
package com.hyb.util.observer;

import java.util.Vector;


/**
 *
 * @author bean
 * @date 2014-1-10
 */
public class Observable<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {
	 private Vector obs=new Vector();
	
	 public synchronized void deleteObservers() {
	        obs.removeAllElements();
	    }
	 
	public synchronized void addObserver(O o) {
		 if (o == null)
	            throw new NullPointerException();
	        if (!obs.contains(o)) {
	            obs.addElement(o);
	        }
	}
	
	 public void notifyObservers(String name) {
		 Object[] arrLocal = obs.toArray();
		 for (int i = arrLocal.length-1; i>=0; i--)
	            ((Observer)arrLocal[i]).update(this, name);
	    }

}
