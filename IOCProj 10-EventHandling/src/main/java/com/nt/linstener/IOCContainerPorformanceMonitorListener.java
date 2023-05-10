package com.nt.linstener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component("pmlistener")
public class IOCContainerPorformanceMonitorListener implements ApplicationListener {
	private long start, end;

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("onApplicationEvent(-)" + event.toString());

		if (event.toString().contains("Refreshed")) 
			start = System.currentTimeMillis();
		
		else if (event.toString().contains("Closed")) {
			end = System.currentTimeMillis();
			
			System.out.println("IOC Container is active mode for " + (start - end) + "ms");
		}
	}
}
