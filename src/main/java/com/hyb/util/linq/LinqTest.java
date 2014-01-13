
package com.hyb.util.linq;

import static junit.framework.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import net.hydromatic.linq4j.Linq4j;
import net.hydromatic.linq4j.function.Function1;
import net.hydromatic.linq4j.function.Predicate1;

import org.junit.Test;

/**
 *
 * @author bean
 * @date 2014-1-13
 */
public class LinqTest {
	@Test
	public void name() {
		Person p1=new Person(21,"21",true);
		Person p2=new Person(22,"22",false);
		Person p4=new Person(23,"24",true);
		Person p3=new Person(23,"23",true);
		
		List<Person> list=new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		
		
		List<String> nameList= Linq4j.asEnumerable(list).where(new Predicate1<Person>() {
			public boolean apply(Person arg0) {
                //只要sex为true的
				return arg0.Sex;
			}
		}).select(new Function1<Person, String>() {

			public String apply(Person arg0) {
				 //只要Person的name字段，
				return arg0.Name;
			}
		}).orderByDescending(new Function1<String, String>() {

			public String apply(String arg0) {
				//降序排列
				return arg0;
			}
		}).toList();

		assertEquals(3, nameList.size());
		assertEquals("24", nameList.get(0));
		assertEquals("23", nameList.get(1));
		assertEquals("21", nameList.get(2));
		
		
		
		
		List<Person> list2= Linq4j.asEnumerable(list).where(new Predicate1<Person>() {
			public boolean apply(Person arg0) {
                //只要sex为true的
				return arg0.Sex;
			}
		}).select(new Function1<Person, Person>() {

			public Person apply(Person arg) {
				return arg;
			}
		}).orderByDescending(new Function1<Person, Person>() {

			public Person apply(Person arg) {
				//降序排列
				return arg;
			}
		}).toList();
		
		assertEquals(3, list2.size());
		assertEquals(p4, list2.get(0));
		assertEquals(p3, list2.get(1));
		assertEquals(p1, list2.get(2));
		
	}

}
