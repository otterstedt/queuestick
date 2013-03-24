package slk.otto.queuestick.model;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import slk.otto.queuestick.device.enumeration.DeviceStatus;

public class TellstickCommand implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	
	private String id;
	private DeviceStatus state;
	private String dimLevel;
	
	public TellstickCommand(String id, DeviceStatus state, String dimLevel){
		this.id=id;
		this.state=state;
		this.dimLevel=dimLevel;
	}

	public String getId() {
		return id;
	}

	public DeviceStatus getState() {
		return state;
	}

	public String getDimLevel() {
		return dimLevel;
	}

	
	
}
