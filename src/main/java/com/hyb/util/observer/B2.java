
package com.hyb.util.observer;


/**
 *
 * @author bean
 * @date 2014-1-10
 */
public class B2 implements Observer<A2, B2, String>{

	@Override
	public void update(A2 a2, String arg) {
		    System.out.println("recive=== " + arg + "!");
	}

}
