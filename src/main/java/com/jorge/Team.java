package com.jorge;

public class Team {

	private long id;
	private String name;
	private String location;
	private String mascotte;
	
	
	public Team(){
		super();
	}
	
	public Team(long id, String name, String location, String mascotte) {
		this();
		this.id = id;
		this.name = name;
		this.location = location;
		this.mascotte = mascotte;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascotte() {
		return mascotte;
	}
	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}
	
	
}
