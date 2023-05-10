package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component("nf")
@PropertySource("com/nt/commons/Info.properties")
public class PersonalInfo {
	
    @Value("${per.name}")
	private String pname;
     
    @Value("${per.addrs}")
	private String paddrs;
    
    @Value("${per.age}")
	private int page;

    @Value("${os.name}")
    private String osName;
	
    @Value("${user.name}")
    private String uname;
    
    @Value("${path}")
    private String pathData;

	@Override
	public String toString() {
		return "PersonalInfo [pname=" + pname + ", paddrs=" + paddrs + ", page=" + page + ", osName=" + osName
				+ ", uname=" + uname + ", pathData=" + pathData + "]";
	}    
}
