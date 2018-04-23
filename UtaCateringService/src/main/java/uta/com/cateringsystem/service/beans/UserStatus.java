package uta.com.cateringsystem.service.beans;

public enum UserStatus {
	REGISTERED("Registered"), 
	APPROVED("Approved"), 
	DELETED("Deleted");

	private String userStatus;

	UserStatus(String userStatus) {
	        this.userStatus = userStatus;
	    }

	public String userStatus() {
		return userStatus;
	}
}
