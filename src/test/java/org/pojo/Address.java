package org.pojo;

public class Address {
	
	private PermanentAddress permanentAddress;
	private TemporaryAddress temporaryAddress;
	
	public PermanentAddress getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(PermanentAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public TemporaryAddress getTemporaryAddress() {
		return temporaryAddress;
	}
	public void setTemporaryAddress(TemporaryAddress temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}
	
	

}
