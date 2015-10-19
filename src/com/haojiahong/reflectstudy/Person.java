package com.haojiahong.reflectstudy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过反射调用类中的属性和方法 ；首先获取class对象 然后调用该对象对应的方法
 * 
 * @author haojiahong
 * 
 * @createtime：2015-10-19 上午11:06:07
 * 
 * 
 */
public class Person {

	private String name;
	private int age;

	public String hello() {
		System.out.println("say hello");
		return "hello";
	}

	public void sayHello(String who) {
		System.out.println(who + "is saying hello");
	}

	@Override
	public String toString() {
		return "Person[name:" + name + "age:" + age + "]";
	}

	public static class FieldTest {
		public static void main(String[] args) throws Exception {
			Person p = new Person();
			// 获取person类对应的class对象(获得class对象的方法有三种。1.Class.forName(Person);2.Person.class;3.调用某个对象的getClass方法)
			Class<Person> personClazz = Person.class;
			// 通过反射获取person名称为name的Filed
			Field nameField = personClazz.getDeclaredField("name");
			// 通过反射访问改field时取消访问权限
			nameField.setAccessible(true);
			nameField.set(p, "haojiahong");
			Field ageField = personClazz.getDeclaredField("age");
			ageField.setAccessible(true);
			ageField.set(p, 24);
			System.out.println(p);

			// 测试反射方法
			Method mtd = personClazz.getMethod("hello");
			mtd.invoke(p);
			// 测试带参数的方法
			Method mtd2 = personClazz.getMethod("sayHello", String.class);
			mtd2.invoke(p, "haojiaong");

			System.out.println(Person.class);

		}
	}
}
