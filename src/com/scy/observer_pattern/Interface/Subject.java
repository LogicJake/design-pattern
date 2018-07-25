package com.scy.observer_pattern.Interface;

public interface Subject {
	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObservers();
}
