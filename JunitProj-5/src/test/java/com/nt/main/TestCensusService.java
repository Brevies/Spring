package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.nt.service.CensusService;

public class TestCensusService {

	public CensusService service;

	@BeforeEach
	public void setUp() {
		service = new CensusService();
	}

	@RepeatedTest(value = 10, name = "execution of {displayName}-{curentRepetition}/{totalRepetition}")
	@DisplayName("Testing data export")
	public void testexportdata() {
		System.out.println("TestCensusService.testexportdata()");
		assertEquals("data export", service.exportData());
	}
	@ParameterizedTest
	@ValueSource(ints= {10,21,34,56,11,78})
	public void testIsOdd(int n) {
		System.out.println("TestCensusService.testIsOdd()");
		assertTrue(service.isOdd(n));
	}
	@Test
	@ValueSource(strings= {"raja","ram"})
	@DisplayName("String test Say Hello")
	public void testSayHello(String user) {
		System.out.println("TestCensusService.testSayHello()");
	    assertEquals("Hello :"+user, service.sayHello(user));
	}
	
	
	@AfterEach
	public void clear() {
		service=null;
	}
}
