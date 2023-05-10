package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.nt.service.BankLoanService;

public class TestBankLoanService {
	@Test
	public void testcalcIntrestAmountWithInvalidInput() {
		BankLoanService service = new BankLoanService();
		 assertThrows(IllegalArgumentException.class, ()->{
		//assertThrows(ArithmeticException.class, () -> {
			service.calcSimpleIntrestAmount(0, 0, 0);
		});
	}

	@Test
	public void testcalcSimpleIntrestAmountWithBigNumber() {
		BankLoanService service = new BankLoanService();
		float actual = service.calcSimpleIntrestAmount(10000000, 2, 12);
		float expected = 2400000.0f;
		assertEquals(expected, actual, "may result is not matching");
	}

	@Test
	public void testcalcSimpleIntrestAmountWithInvalidInput() {
		BankLoanService service = new BankLoanService();
		assertThrows(ArithmeticException.class, () -> {
			service.calcSimpleIntrestAmount(0, 0, 0);
		}, "may result is not matching");
	}

}
