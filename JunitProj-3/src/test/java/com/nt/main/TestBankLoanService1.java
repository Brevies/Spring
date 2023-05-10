package com.nt.main;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import com.nt.service.BankLoanService;

public class TestBankLoanService1 {
	 private static BankLoanService service;
	 @BeforeAll
	 public static void setUpOnce() {
		 service =new BankLoanService();
	 }
	 
	 @AfterAll
	 public static void clearOnce() {
		 service=null;
	 }
}
