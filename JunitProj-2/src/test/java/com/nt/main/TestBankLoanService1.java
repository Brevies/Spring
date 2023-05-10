package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.BankLoanService;

public class TestBankLoanService1 {

	@Test
	public void testcalcIntrestAmountWithBigNumber() {
		BankLoanService service= new BankLoanService();
		float actual=service.calcSimpleIntrestAmount(10000000, 2, 12);
		float excepted=2400000.65f;
		assertEquals(excepted, actual,0.75,"my results not matching");
	}
}
