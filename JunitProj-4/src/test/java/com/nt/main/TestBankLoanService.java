package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.nt.services.BankLoanService;

@DisplayName("TestBankLoanService Class")
public class TestBankLoanService {

  private BankLoanService service;
  @BeforeEach
  public void  setUp() {
	  service = new BankLoanService();
  }
	
	@Test
	@Disabled
	@DisplayName("Testing with timer")
	@Tag("dev")
	public void testcalcSimpleIntrestAmountWithTimer() {
		//BankLoanService service = new BankLoanService();
		System.out.println("TestBankLoanService2.testcalcSimpleIntrestAmountWithTimer()");
		assertTimeout(Duration.ofMillis(2000), () -> {
			service.calcSimpleIntrestAmount(100000, 2, 12);
		});
	}
	@Test
	@DisplayName("Testing with small numbers")
	@Tag("dev")
	public void testcalcSimpleIntrestAmountWithSmallNumber() {
		//BankLoanService service = new BankLoanService();
		System.out.println("TestBankLoanService2.testcalcSimpleIntrestAmountWithSmallNumber()");
		float actual = service.calcSimpleIntrestAmount(100000, 2, 12);
		float expected = 24000.0f;
		assertEquals(expected, actual, "my results not matching");
	}

	 @Test
	 @DisplayName("Testing with Big numbers")
	 @Tag("uat")
	 public void testcalcSimpleIntrestAmountBigNumber() {
		 System.out.println("TestBankLoanService.testcalcSimpleIntrestAmountBigNumber()");
		 float actual=service.calcSimpleIntrestAmount(1000000, 2, 12);
		 float expected=240000.0f;
		 assertEquals(expected, actual,0.05,"may results not matching");
	 }
	 @Test
	 @DisplayName("Testing with invalid inputs")
	 @Tag("uat")
	 public void testcalcSimpleIntrestAmountWithInvalidNumber() {
		 System.out.println("TestBankLoanService.testcalcSimpleIntrestAmountWithInvalidNumber()");
		 assertThrows(IllegalArgumentException.class, ()->{
			 service.calcSimpleIntrestAmount(0, 0, 0);
		 },"my result is not matching");
	 }
		@AfterEach
		public void clear() {
			service=null;
		}
}
