package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.nt.service.Printer;

public class TestPrinter {
    @Test
	public void testSingletone() {
		Printer p1=Printer.getInstance();
		Printer p2=Printer.getInstance();
		/*assertNull(p1);
		assertNull(p2);*/
		if(p1==null || p2==null)
			fail("p1,p2 references must not be null");
		assertSame(p1, p2);
	}
}
