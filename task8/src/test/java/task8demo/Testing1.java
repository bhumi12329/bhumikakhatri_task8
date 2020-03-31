package task8demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing1 {

	@Test
	void test2chars1() {
		Removefirst2char1 removefirst2char=new Removefirst2char1();
		String actual=removefirst2char.Remove("ABCD");
		assertEquals("BCD", actual);
		
	}
	@Test
	void test2chars2() {
		Removefirst2char1 removefirst2char=new Removefirst2char1();
		String actual=removefirst2char.Remove("AACD");
		assertEquals("CD", actual);
		
	}
	@Test
	void test2chars3() {
		Removefirst2char1 removefirst2char=new Removefirst2char1();
		String actual=removefirst2char.Remove("BACD");
		assertEquals("BCD", actual);
		
	}
	@Test
	void test2chars4() {
		Removefirst2char1 removefirst2char=new Removefirst2char1();
		String actual=removefirst2char.Remove("BBAA");
		assertEquals("BBAA", actual);
		
	}
	@Test
	void test2chars5() {
		Removefirst2char1 removefirst2char=new Removefirst2char1();
		String actual=removefirst2char.Remove("AABAA");
		assertEquals("BAA", actual);
		
	}

}
