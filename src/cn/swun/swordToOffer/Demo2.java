package cn.swun.swordToOffer;
class A {
	private static final A a = new A();
	private A() {
	}
	public static A getInstance() {
		return a;
	}
}

// 懒汉式 线程安全写法
class B {
	private static volatile B b = null;
	private B() {
	}
	public static B getInstance() {
		if (b == null) {
			synchronized (B.class) {
				if (b == null)
					b = new B();
			}
		}
		return b;
	}
}
public class Demo2 {

	public static void main(String[] args) {
		

	}

}
