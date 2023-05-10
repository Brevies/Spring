package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.nt.service.BankLoanService;

@DisplayName("TestBankLoanService Class")
public class TestBankLoanService {

	// private static BankLoanService service;
	@Test
	@DisplayName("Testing with small numbers")
	public void testcalcSimpleIntrestAmountWithSmallNumber() {
		BankLoanService service = new BankLoanService();
		System.out.println("TestBankLoanService2.testcalcSimpleIntrestAmountWithSmallNumber()");
		float actual = service.calcSimpleIntrestAmount(100000, 2, 12);
		float expected = 24000.0f;
		assertEquals(expected, actual, "my results not matching");
	}
	
		@Test
		@Disabled
		@DisplayName("Testing with timer")
		public void testcalcSimpleIntrestAmountWithTimer() {
			BankLoanService service = new BankLoanService();
			System.out.println("TestBankLoanService2.testcalcSimpleIntrestAmountWithTimer()");
			assertTimeout(Duration.ofMillis(2000), () -> {
				service.calcSimpleIntrestAmount(100000, 2, 12);
			});
		}
}
