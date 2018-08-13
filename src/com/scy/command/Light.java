package com.scy.command;

public class Light {
	String location = "";
	
	public Light(String location) {
		this.location = location;
	}
	
	public Light() {
	}
	
	public void on() {
		System.out.println("Light is on");
	}
	
	public void off() {
		System.out.println("Light is off");
	}
}
