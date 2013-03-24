package slk.otto.queuestick.transformer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TdtoolExecutor {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void execute(String command){
		

		if(command != null && command.startsWith("tdtool")){
			Process child;
			try {
				child = Runtime.getRuntime().exec(command);
				child.waitFor();
				logger.info("Command executed with exit code: " + child.exitValue());
			} catch (Exception e) {
				logger.error("Failed to gracefully execute command '" + command + "'", e.getMessage());
			} 
			
			
		}
	}

}
