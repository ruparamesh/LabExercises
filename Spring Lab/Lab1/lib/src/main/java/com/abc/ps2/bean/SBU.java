package com.abc.ps2.bean;

public class SBU {
	private String sbuId;
	private String sbuName;
	private String sbuHead;
	
	public String getSbuId() {
		return sbuId;
	}
	
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	@Override
	public String toString() {
		return String.format("sbuCode=%s, sbuHead=%s, sbuName=%s",this.sbuId,this.sbuHead,this.sbuName);
	}

}
