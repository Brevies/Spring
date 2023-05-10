package com.nt.main;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestMockVsSpy {
    @Test
	public void testList() {
    	List<String> listMock=Mockito.mock(ArrayList.class);// mock
		List<String> listSpy=Mockito.spy(new ArrayList()); // spy
		listMock.add("table");
		listSpy.add("table");
		System.out.println(listMock.size()+" "+listSpy.size());
		
    	
		List<String> listMock1=Mockito.mock(ArrayList.class);// mock
		List<String> listSpy1=Mockito.spy(new ArrayList()); // spy
		listMock.add("table");
		//stubbing on mock
		Mockito.when(listMock1.size()).thenReturn(10);
		listSpy.add("table");
		//stubbing on spy
		Mockito.when(listSpy1.size()).thenReturn(10);
		System.out.println(listMock1.size()+" "+listSpy1.size());
	}
}
