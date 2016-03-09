package com.example.atm.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * This class represents pojo for balance object.
 * 
 * @author Sudhakar
 *
 */
public class Balance implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3554951666970840082L;
	private BigDecimal savingAmount;
	private BigDecimal currentAmount;
	private BigDecimal withdrawalAmount;

	private String balanceSheet;

	public BigDecimal getSavingAmount() {
		return savingAmount;
	}

	public void setSavingAmount(BigDecimal savingAmount) {
		this.savingAmount = savingAmount;
	}

	public BigDecimal getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(BigDecimal currentAmount) {
		this.currentAmount = currentAmount;
	}

	public BigDecimal getWithdrawalAmount() {
		return withdrawalAmount;
	}

	public void setWithdrawalAmount(BigDecimal withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}

	public String getBalanceSheet() {
		return balanceSheet;
	}

	public void setBalanceSheet(String balanceSheet) {
		this.balanceSheet = balanceSheet;
	}

}
