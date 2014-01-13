package com.hyb.util.superAndDerived;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

/**
 * @author bean
 * @date 2014-1-13
 */
public class SuperAndDerivedTest {
	@Test
	public void test() {
		Derived derived = new Derived();
		Super superr = derived;

		// 封装性，父类的方法是看不到子类的属性的。
		assertEquals(10, derived.execute());
		assertEquals(10, superr.execute());

		// java属性是静态绑定的
		assertEquals(20, derived.i);
		assertEquals(10, superr.i);

		// java方法是动态绑定的。
		assertEquals(20, derived.getI());
		assertEquals(20, superr.getI());
	}

}
