package com.nt.service;

import com.nt.dao.ILogingDAO;

public class LoginMgmtServiceImpl implements ILoginMgmtService {

	private ILogingDAO loginDAO;

	public LoginMgmtServiceImpl(ILogingDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	@Override
	public boolean login(String username, String password) {
		if (username.equals("") || password.equals(""))
			throw new IllegalArgumentException("Empty credentials");
		// use DAO
		int count = loginDAO.authenticate(username, password);
		if (count == 0)
			return false;
		else
			return true;
	}

	@Override
	public String registerUser(String username, String role) {
		if (!role.equalsIgnoreCase("") && !role.equalsIgnoreCase("visitor")) {
			loginDAO.addUser(username, role);
			return "user Added";
		} else {
			return "user Not Added";
		}
	}
}
