package com.haojiahong.reflectstudy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ͨ������������е����Ժͷ��� �����Ȼ�ȡclass���� Ȼ����øö����Ӧ�ķ���
 * 
 * @author haojiahong
 * 
 * @createtime��2015-10-19 ����11:06:07
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
			// ��ȡperson���Ӧ��class����(���class����ķ��������֡�1.Class.forName(Person);2.Person.class;3.����ĳ�������getClass����)
			Class<Person> personClazz = Person.class;
			// ͨ�������ȡperson����Ϊname��Filed
			Field nameField = personClazz.getDeclaredField("name");
			// ͨ��������ʸ�fieldʱȡ������Ȩ��
			nameField.setAccessible(true);
			nameField.set(p, "haojiahong");
			Field ageField = personClazz.getDeclaredField("age");
			ageField.setAccessible(true);
			ageField.set(p, 24);
			System.out.println(p);

			// ���Է��䷽��
			Method mtd = personClazz.getMethod("hello");
			mtd.invoke(p);
			// ���Դ������ķ���
			Method mtd2 = personClazz.getMethod("sayHello", String.class);
			mtd2.invoke(p, "haojiaong");

			System.out.println(Person.class);

		}
	}
}
