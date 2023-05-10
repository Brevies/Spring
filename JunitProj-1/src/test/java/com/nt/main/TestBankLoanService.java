package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.BankLoanService;

public class TestBankLoanService {
    @Test
	public void testcalcSimpleIntrestAmountWithSmallNumber() {
		BankLoanService service= new BankLoanService();
		float actual=service.calcSimpleIntrestAmount(100000, 2, 12);
		float expected =24000.0f;
		assertEquals(expected, actual);
	}
    @Test
    public void testcalcSimpleIntrestAmountWithBigNumber() {
    	BankLoanService service= new BankLoanService();
    	float actual=service.calcSimpleIntrestAmount(10000000, 2, 12);
    	float expected= 2400000.0f;
    	assertEquals(expected, actual);
    }
}
