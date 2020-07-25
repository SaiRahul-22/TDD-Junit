package com.epam.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Remove_A {
	
	/*
	 * "ABCD" => "BCD"
	 * "AACD" => "CD"
	 * "BACD" => "BCD"
	 * "BBAA" => "BBAA"
	 * "AABAA" => "BAA"
	 */

	@Test
	void test1char() {
		removeA rm = new removeA();
		String actual = rm.remov("ABCD");
		assertEquals("BCD", actual);
	}
	
	@Test
	void test2char() {
		removeA rm = new removeA();
		String actual = rm.remov("AACD");
		assertEquals("CD", actual);
	}
	
	@Test
	void testMiddlechar() {
		removeA rm = new removeA();
		String actual = rm.remov("BACD");
		assertEquals("BCD", actual);
	}
	
	@Test
	void testNochar() {
		removeA rm = new removeA();
		String actual = rm.remov("");
		assertEquals("", actual);
	}
	
	@Test
	void testLastchar() {
		removeA rm = new removeA();
		String actual = rm.remov("BBAA");
		assertEquals("BBAA", actual);
	}
	
	@Test
	void testMultichar() {
		removeA rm = new removeA();
		String actual = rm.remov("AABAA");
		assertEquals("BAA", actual);
	}
	
}
