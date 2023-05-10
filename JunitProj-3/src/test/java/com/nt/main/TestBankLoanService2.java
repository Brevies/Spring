package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nt.service.BankLoanService;

public class TestBankLoanService2 {
	@Test
	public void testcaclSimpleIntrestAmountWithTimer() {
		BankLoanService service = new BankLoanService();
		assertTimeout(Duration.ofMillis(5000), () -> {
			service.calcSimpleIntrestAmount(100000, 2, 12);
		});
	}
	
private BankLoanService service;
 @BeforeEach
 public void setUp() {
	 service=new BankLoanService();
 }
 @Test
 public void testcalcSimpleIntrestAmountWithSmallNumber() {
	 System.out.println("TestBankLoanService.testcalcSimpleIntrestAmountWithSmallNumber()");
	 float actual= service.calcSimpleIntrestAmount(100000, 2, 12);
	 float expected=24000.0f;
	 assertEquals(expected, actual,"may results not matching");
 }
 
 @Test
 public void testcalcSimpleIntrestAmountBigNumber() {
	 System.out.println("TestBankLoanService.testcalcSimpleIntrestAmountBigNumber()");
	 float actual=service.calcSimpleIntrestAmount(1000000, 2, 12);
	 float expected=240000.0f;
	 assertEquals(expected, actual,0.05,"may results not matching");
 }
 
 @AfterEach
 public void clear() {
	// service=null;
 }

}
