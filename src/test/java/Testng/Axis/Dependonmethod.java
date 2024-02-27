package Testng.Axis;

import org.testng.annotations.Test;

public class Dependonmethod {
	
	
	
	
	@Test()
	public void test1() {
		System.out.println("Testcase1 excecuted successfully");
	}
	@Test(dependsOnMethods="test1")
	public void test2() {
		System.out.println("Testcase2 excecuted successfully");
	}
	@Test()
	public void test3() {
		System.out.println("Testcase3 excecuted successfully");
	}

}
