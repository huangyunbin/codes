
package com.hyb.util.observer;


/**
 *
 * @author bean
 * @date 2014-1-10
 */
public class B1 implements   Observer<A1, B1, String>{

	@Override
	public void update(A1 a1, String arg) {
		    System.out.println("recive=== " + arg + "!");
	}

}
