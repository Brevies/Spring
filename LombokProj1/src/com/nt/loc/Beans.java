package com.nt.loc;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class Beans {

	//@Setter
	//@Getter
	private String name;
	
	private int Marks;
	private double digit;
	private String uname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public double getDigit() {
		return digit;
	}
	public void setDigit(double digit) {
		this.digit = digit;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
}
