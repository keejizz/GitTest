
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CarTest {
	private float dog;
	private int expectedWheels;
	private Car myCar;
	//全部的測試案例執行前，執行beforeclass 前置作業
	//全部的測試案例執行後，執行beforeclass 收尾
	//每個測試案例都是獨立的，測試案例method無順序，故每個案例執行結束,before內重新初始化
	//通常測試案例不應該互相影響
	//核心邏輯寫在Test
	//預先工作寫在before
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass");
	}

	@Before
	public void setUp() throws Exception {//預先工作寫在before
		System.out.println("Before");
		expectedWheels = 4;
		myCar = new Car();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		myCar = null;
	}

	@Test
	public void testGetWheels() {
		System.out.println("Case1");
		assertEquals(expectedWheels, myCar.getWheels());
	}

	@Test
	public void testGetWheelsAgain() {
		System.out.println("Case2");
		assertEquals(expectedWheels, myCar.getWheels());
	}

}
