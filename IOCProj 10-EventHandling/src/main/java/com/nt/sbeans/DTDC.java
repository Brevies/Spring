package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid+"order items are kept for delivery by DTDC";
	}

}
