
package com.hyb.util.observer;

import org.junit.Test;


/**
 *
 * @author bean
 * @date 2014-1-10
 */
public class ObserverTest {
	@Test
	public void name() {
		A1 a1 = new A1();
		A2 a2 = new A2();
	    B1 b1 = new B1();
	    B2 b2 = new B2();
	 
	    a1.addObserver(b1);
//a1在类型限定的时候，只能接受B1，所以传入b2的时候会报错的。
//	    a1.addObserver(b2);
	    a1.babyIsCrying();
	    a2.addObserver(b2);
	    a2.barks();
	}

}
