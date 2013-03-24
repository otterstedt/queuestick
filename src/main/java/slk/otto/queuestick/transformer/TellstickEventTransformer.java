package slk.otto.queuestick.transformer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import slk.otto.queuestick.model.TellstickCommand;
import slk.otto.queuestick.utils.CommandUtilities;

public class TellstickEventTransformer {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//create TellstickCommand from string event (id:state:<dimLevel>)
	public TellstickCommand transform(String event){
		
		try {
		
			TellstickCommand tsCommand = CommandUtilities.tellstickCommandFactory(event);
			
			return tsCommand;
		}
		catch(Exception e){
			logger.error("Unable to create TellstickCommand from input: '" + event + "'");
			return null;
		}
	}

}
