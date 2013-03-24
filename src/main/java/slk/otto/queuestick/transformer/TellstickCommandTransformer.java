package slk.otto.queuestick.transformer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import slk.otto.queuestick.model.TellstickCommand;
import slk.otto.queuestick.utils.CommandUtilities;



public class TellstickCommandTransformer {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public String transform(TellstickCommand command){
		
		if(command != null){
		
			logger.info("Got command id: " + command.getId() + " state: " + command.getState() + " dimLevel: " + command.getDimLevel());
			
			return CommandUtilities.getShellCommand(command);
		
		}
		
		return null;
	}

}
