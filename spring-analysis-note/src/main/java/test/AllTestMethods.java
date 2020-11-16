package test;

/**
 * @Description
 * @Author He
 * @Date 2020/11/3 20:39
 */
public class AllTestMethods {
	public static void main(String[] args) {
		AllTestMethods allTestMethods = new AllTestMethods();
		allTestMethods.test1();
	}

	public void test1(){
		synchronized (this){
			System.out.println(this.hashCode());
		}
	}
}
