package com.amdemo.mark.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amdemo.mark.beans.Transaction;
import com.amdemo.mark.beans.TransactionRegistration;

@Controller
public class TransactionRetrieveController {

	@RequestMapping(method = RequestMethod.GET, value="/transaction/alltransaction")
	
	@ResponseBody
	public List<Transaction> getAllTransactions() {
		return TransactionRegistration.getInstance().getTransactionRecords();
		
	}
	
	
}
