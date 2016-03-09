package com.example.atm.model;

import java.io.Serializable;

/**
 * This class represents pojo for bank object.
 * 
 * @author Sudhakar
 *
 */
public class Bank implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5127576314376900443L;
	private int bankId;
	private String bankName;
	private String branchName;

	public Bank(int bankId, String bankName, String branchName) {
		this.bankId = bankId;
		this.bankName = bankName;
		this.branchName = branchName;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
