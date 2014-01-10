package com.hyb.util.observer;

/**
 * @author bean
 * @date 2014-1-10
 */
public class A1 extends Observable<A1, B1, String> {
	public void babyIsCrying() {
		notifyObservers("A1...........");
	}

}
