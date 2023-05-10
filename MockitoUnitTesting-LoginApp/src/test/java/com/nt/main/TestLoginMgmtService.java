package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.nt.dao.ILogingDAO;
import com.nt.service.ILoginMgmtService;
import com.nt.service.LoginMgmtServiceImpl;

public class TestLoginMgmtService {

	//using Annotation 
	@InjectMocks
	private LoginMgmtServiceImpl  loginService;
	@Mock
	private static ILogingDAO loginDAOMock;
	
	public TestLoginMgmtService() {
	MockitoAnnotations.openMocks(this);
	}

	/* without Annotation
	  private static ILoginMgmtService loginService;
	private static ILogingDAO loginDAOMock;
	@BeforeAll
	public static void setupOnce() {
		 Create Mock/ Fake/ Dummy Object
		 mock(-) generates lnMemory class implementing ILoginDAO(l) having null method definitions for authenticate(-,-) method 
	loginDAOMock=Mockito.mock(ILogingDAO.class);
	// Create Service class Object
	loginService =new LoginMgmtServiceImpl(loginDAOMock);
	}
	@AfterAll
	public static void clearOnce() {
		loginDAOMock=null;
		loginService=null;
	}*/

	@Test
	public void testLoginWithValidCredentials() {
		// Provide stub (Temporary functionality) for DAO's authenticate method
		Mockito.when(loginDAOMock.authenticate("raja", "rani")).thenReturn(1);
		assertTrue(loginService.login("raja", "rani"));
	}

	@Test
	public void testLoginWithInvalidCredentials() {
		Mockito.when(loginDAOMock.authenticate("raja", "rani1")).thenReturn(0);
		assertFalse(loginService.login("raja", "rani1"));
	}

	@Test
	public void testLoginWithNoCredentials() {
		assertThrows(IllegalArgumentException.class, () -> {
			loginService.login("", "");
		});
	}

	@Test
	public void testRegisterWithSpy() {
		// spy object
		ILogingDAO loginDAoSpy = Mockito.spy(ILogingDAO.class);
		ILoginMgmtService loginService = new LoginMgmtServiceImpl(loginDAoSpy);
		loginService.registerUser("raja", "admin");
		loginService.registerUser("suresh", "visitor");
		loginService.registerUser("jani", "");
		Mockito.verify(loginDAoSpy, Mockito.times(1)).addUser("raja", "admin");
		Mockito.verify(loginDAoSpy, Mockito.times(0)).addUser("suresh", "visitor");
		Mockito.verify(loginDAoSpy, Mockito.never()).addUser("jani", "");
	}
}
