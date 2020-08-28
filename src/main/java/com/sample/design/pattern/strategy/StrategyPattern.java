package com.sample.design.pattern.strategy;

/**
 * 策略（Strategy）模式的定义：
 * 		该模式定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，
 * 		且算法的变化不会影响使用算法的客户。策略模式属于对象行为模式，
 * 		它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，
 * 		并委派给不同的对象对这些算法进行管理。

 *
 */
public class StrategyPattern {
	public static void main(String[] args) {
		Context c = new Context();
		Strategy s = new ConcreteStrategyA();
		c.setStrategy(s);
		c.strategyMethod();
		System.out.println("-----------------");
		s = new ConcreteStrategyB();
		c.setStrategy(s);
		c.strategyMethod();
	}
}

//抽象策略类
interface Strategy {
	public void strategyMethod(); // 策略方法
}

//具体策略类A
class ConcreteStrategyA implements Strategy {
	public void strategyMethod() {
		System.out.println("具体策略A的策略方法被访问！");
	}
}

//具体策略类B
class ConcreteStrategyB implements Strategy {
	public void strategyMethod() {
		System.out.println("具体策略B的策略方法被访问！");
	}
}

//环境类
class Context {
	private Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void strategyMethod() {
		strategy.strategyMethod();
	}
}
