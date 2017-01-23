package com.cs.ps.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PasrkingStatus  implements Serializable {
	
	private BigDecimal sum;
	
	private String status;

	/**
	 * @return the sum
	 */
	public BigDecimal getSum() {
		return sum;
	}

	/**
	 * @param sum the sum to set
	 */
	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
