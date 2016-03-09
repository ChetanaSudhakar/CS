package com.example.atm.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.atm.model.Bank;

public class BankController {

	public static void main(String[] args) {
		
		List<Bank> bankList=new ArrayList<Bank>();
		bankList.add(new Bank(0, "SBI", "Shirali"));
		
		bankList.add(new Bank(6, "SBI", "Shirali"));
		bankList.add(new Bank(5, "SBI", "Shirali"));
		
		bankList.add(new Bank(1, "SBI", "Shirali"));
		
	}

}
