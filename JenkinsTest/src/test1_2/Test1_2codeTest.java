package test1_2;

import static org.junit.Assert.*;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test1_2codeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNumSort1() {
		Test1_2code test=new Test1_2code();
		String string="3721";
			
		assertEquals("1237",test.numSort(string));
//		fail("Not yet implemented");
	}
	
	@Test
	public void testNumSort2() {
		Test1_2code test=new Test1_2code();
		String string="asdv";
		
		
		assertEquals("NoNums",test.numSort(string));
//		fail("Not yet implemented");
	}
	
	@Test
	public void testNumSort3() {
		Test1_2code test=new Test1_2code();
		String string="372abrc8";
		
		assertEquals("2378",test.numSort(string));
//		fail("Not yet implemented");
	}
	
	@Test
	public void testAlphabetSort1() {
		Test1_2code test=new Test1_2code();
		String string="3721";
		assertEquals("NoAlphabets",test.alphabetSort(string));
		//fail("Not yet implemented");
	}

	@Test
	public void testAlphabetSort2() {
		Test1_2code test=new Test1_2code();
		String string="asdv";
		assertEquals("adsv",test.alphabetSort(string));
		//fail("Not yet implemented");
	}
	@Test
	public void testAlphabetSort3() {
		Test1_2code test=new Test1_2code();
		String string="372abrc8";
		assertEquals("abcr",test.alphabetSort(string));
		//fail("Not yet implemented");
	}

	@Test
	public void testSort1() {
		Test1_2code test=new Test1_2code();
		String string="3721";
		assertEquals("1237NoAlphabets",test.sort(string));
//		fail("Not yet implemented");
	}
	
	@Test
	public void testSort2() {
		Test1_2code test=new Test1_2code();
		String string="asdv";
		assertEquals("NoNumsadsv",test.sort(string));
//		fail("Not yet implemented");
	}
	
	@Test
	public void testSort3() {
		Test1_2code test=new Test1_2code();
		String string="372abrc8";
		assertEquals("2378abcr",test.sort(string));
//		fail("Not yet implemented");
	}

	@Test
	public void testStringSwap() {
		Test1_2code test=new Test1_2code();
		String string="abcdefg";
		assertEquals("gfedcba",test.StringSwap(string));
//		fail("Not yet implemented");
	}

}
