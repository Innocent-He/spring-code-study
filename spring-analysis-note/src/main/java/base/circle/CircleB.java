package base.circle;

/**
 * 循环依赖 B
 * @author JingQ at 2019-06-11
 */
public class CircleB {

	private AOPTestInterface circleA;


	/**
	 * 设定一个方法，调用 A 类的方法，这两个方法互相调用
	 */
	public void b() {
		System.out.println("B");
		circleA.a();
	}

	public AOPTestInterface getCircleA() {
		return circleA;
	}

	public void setCircleA(AOPTestInterface circleA) {
		this.circleA = circleA;
	}
}
