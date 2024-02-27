package Testng.Axis;

import org.testng.annotations.Test;

public class Prority {
	
	

	@Test(priority=0)
	public void test1() {
		System.out.println("Testcase1 excecuted successfully");
	}
	@Test(priority=3)
	public void test2() {
		System.out.println("Testcase2 excecuted successfully");
	}
	@Test(priority=2)
	public void test3() {
		System.out.println("Testcase3 excecuted successfully");
	}
}
