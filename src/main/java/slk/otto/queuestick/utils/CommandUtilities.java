package slk.otto.queuestick.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import slk.otto.queuestick.device.enumeration.DeviceStatus;
import slk.otto.queuestick.model.TellstickCommand;



public class CommandUtilities {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static TellstickCommand tellstickCommandFactory(String command) throws IllegalArgumentException{
		
		String[] props = command.split(":");
	
		if(props.length < 2 || props.length > 3){
			LoggerFactory.getLogger(CommandUtilities.class).error("Invalid input: " + command + " for TellstickCommand");
		}
		
		return new TellstickCommand(props[0], DeviceStatus.valueOf(props[1]), (props.length == 3 ? props[2] : null));
		
	}
	
	public static String getShellCommand(TellstickCommand command){

		switch(command.getState()){
		
			case ON:
				return "tdtool -n " + command.getId(); 
			case DIM:
				return "tdtool -v " + command.getDimLevel() + " -d " + command.getId();
			case OFF:
				return "tdtool -f " + command.getId();
		
		}
		
		return null;

	}

}
