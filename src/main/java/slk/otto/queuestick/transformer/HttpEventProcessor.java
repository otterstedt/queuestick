package slk.otto.queuestick.transformer;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpEventProcessor implements Processor {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	private static String EVENT_QUERY_PARAM = "event";
	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		String event = (String) exchange.getIn().getHeader(EVENT_QUERY_PARAM);
		
		logger.info("Processing event: '" + event + "' from http endpoint to internal queue");
		
		exchange.getOut().setBody(event);
		
		
	}

}
