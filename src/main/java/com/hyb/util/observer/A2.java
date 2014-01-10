package com.hyb.util.observer;

/**
 * @author bean
 * @date 2014-1-10
 */
public class A2 extends Observable<A2, B2, String> {
	public void barks() {
		notifyObservers("A2.........");
	}

}
