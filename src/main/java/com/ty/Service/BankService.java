package com.ty.Service;

import com.ty.dao.BankDao;
import com.ty.dto.Bank;

public class BankService {
	
	BankDao bankDao=new BankDao();
	
	public Bank saveBank(Bank bank) {
		return bankDao.saveBank(bank);
	}

}
