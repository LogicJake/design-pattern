package com.scy.observer.Interface;

public interface Subject {
	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObservers();
}
