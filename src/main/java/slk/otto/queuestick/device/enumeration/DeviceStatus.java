package slk.otto.queuestick.device.enumeration;

public enum DeviceStatus {
	ON("ON"),
	OFF("OFF"),
	DIM("DIM");
	
	private String status;
	
	DeviceStatus(String status){
		this.status = status;
	}
}
