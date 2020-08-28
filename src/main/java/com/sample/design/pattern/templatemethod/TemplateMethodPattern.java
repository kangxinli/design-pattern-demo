package com.sample.design.pattern.templatemethod;

/**
 * 模板方法（Template Method）模式的定义如下：
 * 		定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，
 * 		使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。
 * 		它是一种类行为型模式。
 *
 */
public class TemplateMethodPattern {
	public static void main(String[] args) {
		AbstractClass tm = new ConcreteClass();
		tm.TemplateMethod();
	}
}

//抽象类
abstract class AbstractClass {
	public void TemplateMethod() // 模板方法
	{
		SpecificMethod();
		abstractMethod1();
		abstractMethod2();
	}

	public void SpecificMethod() // 具体方法
	{
		System.out.println("抽象类中的具体方法被调用...");
	}

	public abstract void abstractMethod1(); // 抽象方法1

	public abstract void abstractMethod2(); // 抽象方法2
}

//具体子类
class ConcreteClass extends AbstractClass {
	public void abstractMethod1() {
		System.out.println("抽象方法1的实现被调用...");
	}

	public void abstractMethod2() {
		System.out.println("抽象方法2的实现被调用...");
	}
}
