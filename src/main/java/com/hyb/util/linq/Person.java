package com.hyb.util.linq;


/**
 * @author bean
 * @date 2014-1-13
 */
public class Person implements Comparable<Person>{
	public int Age;
	public String Name;
	public boolean Sex;

	public Person(int age, String name, boolean sex) {
		super();
		Age = age;
		Name = name;
		Sex = sex;
	}

	@Override
	public int compareTo(Person other) {
		int result=Name.compareTo(other.Name);
		return result;
	}

}
