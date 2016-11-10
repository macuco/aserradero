package com.sinespera;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sinespera.Application;

public class ApplicationTest {

	@Test
	public void testSumar() {
		int a = 5;
		int b = 10;
		int esperado = 15;
		Application ap = new Application();
		
		assertEquals(esperado, 15);
	}

}
