package Testng.Axis;

import org.testng.annotations.Test;

public class Enabledfalse {
	
	@Test(enabled=false)
	public void test1() {
		System.out.println("Testcase1 excecuted successfully");
	}
	@Test
	public void test2() {
		System.out.println("Testcase2 excecuted successfully");
	}
	@Test
	public void test3() {
		System.out.println("Testcase3 excecuted successfully");
	}

}
