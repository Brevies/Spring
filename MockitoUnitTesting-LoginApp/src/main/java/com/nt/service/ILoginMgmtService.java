package com.nt.service;

public interface ILoginMgmtService {

	public boolean login(String username,String password);
    public String registerUser(String username,String role);
}
