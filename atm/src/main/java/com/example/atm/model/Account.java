package com.example.atm.model;

import java.io.Serializable;

/**
 * This class represents pojo for account model.
 * 
 * @author Sudhakar
 *
 */
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4180021115818039332L;

	private String accountPIN;
	private String accountHolderName;
	private String accountNumber;
	private AccountType accountType;

	public Account(String accountPIN, String accountHolderName,
			String accountNumber, AccountType accountType) {
		this.accountPIN = accountPIN;
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;

	}

	public String getAccountPIN() {
		return accountPIN;
	}

	public void setAccountPIN(String accountPIN) {
		this.accountPIN = accountPIN;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

}
