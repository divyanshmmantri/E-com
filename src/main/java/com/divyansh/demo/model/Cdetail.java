package com.divyansh.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cdetail {
	@Id
    private int cid;
    private String name;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cdetail [cid=" + cid + ", name=" + name + "]";
	}
    
}
