package com.sample.design.pattern.composite;

import java.util.ArrayList;

/**
 * 组合（Composite）模式的定义：
 * 		有时又叫作部分-整体模式，它是一种将对象组合成树状的层次结构的模式，
 * 		用来表示“部分-整体”的关系，使用户对单个对象和组合对象具有一致的访问性。
 *
 */
public class CompositePattern {
	public static void main(String[] args) {
		Component c0 = new Composite();
		Component c1 = new Composite();
		Component leaf1 = new Leaf("1");
		Component leaf2 = new Leaf("2");
		Component leaf3 = new Leaf("3");
		c0.add(leaf1);
		c0.add(c1);
		c1.add(leaf2);
		c1.add(leaf3);
		c0.operation();
	}
}

//抽象构件
interface Component {
	public void add(Component c);

	public void remove(Component c);

	public Component getChild(int i);

	public void operation();
}

//树叶构件
class Leaf implements Component {
	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	public void add(Component c) {
	}

	public void remove(Component c) {
	}

	public Component getChild(int i) {
		return null;
	}

	public void operation() {
		System.out.println("树叶" + name + "：被访问！");
	}
}

//树枝构件
class Composite implements Component {
	private ArrayList<Component> children = new ArrayList<Component>();

	public void add(Component c) {
		children.add(c);
	}

	public void remove(Component c) {
		children.remove(c);
	}

	public Component getChild(int i) {
		return children.get(i);
	}

	public void operation() {
		for (Object obj : children) {
			((Component) obj).operation();
		}
	}
}
