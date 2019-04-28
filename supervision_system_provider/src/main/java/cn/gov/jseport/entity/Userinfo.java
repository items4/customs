package cn.gov.jseport.entity;

import java.util.List;

public class Userinfo {

	private Integer uid;

	private String uname;

	private String upass;

	private Boolean islock;
	
	private List trees;
	
	public List getTrees() {
		return trees;
	}

	public void setTrees(List trees) {
		this.trees = trees;
	}

	@Override
	public String toString() {
		return "Userinfo [uid=" + uid + ", uname=" + uname + ", upass=" + upass + ", islock=" + islock + "]";
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public Boolean getIslock() {
		return islock;
	}

	public void setIslock(Boolean islock) {
		this.islock = islock;
	}
}