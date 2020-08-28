package com.sample.design.pattern.bridge;

/**
 * 桥接（Bridge）模式的定义如下：
 * 		将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
 *
 */
public class BridgeTest {
	public static void main(String[] args) {
		Implementor imple = new ConcreteImplementorA();
		Abstraction abs = new RefinedAbstraction(imple);
		abs.Operation();
	}
}

//实现化角色
interface Implementor {
	public void OperationImpl();
}

//具体实现化角色
class ConcreteImplementorA implements Implementor {
	public void OperationImpl() {
		System.out.println("具体实现化(Concrete Implementor)角色被访问");
	}
}

//抽象化角色
abstract class Abstraction {
	protected Implementor imple;

	protected Abstraction(Implementor imple) {
		this.imple = imple;
	}

	public abstract void Operation();
}

//扩展抽象化角色
class RefinedAbstraction extends Abstraction {
	protected RefinedAbstraction(Implementor imple) {
		super(imple);
	}

	public void Operation() {
		System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
		imple.OperationImpl();
	}
}
