package com.amdemo.mark.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amdemo.mark.beans.*;

@Controller
public class TransactionRegistrationController {
	
	@RequestMapping
	(method = RequestMethod.POST, value="/register/transaction")
	
	@ResponseBody
	public TransactionRegistrationReply registerTransaction(@RequestBody Transaction transaction) {
		System.out.println("In registerTransaction");
		TransactionRegistrationReply trdregreply = new TransactionRegistrationReply();
		TransactionRegistration.getInstance().add(transaction);
		//set below value for reply message to caller
		trdregreply.setTransactionId(transaction.getTransactionId());
		trdregreply.setAmount(transaction.getAmount());
		trdregreply.setCustomerId(transaction.getCustomerId());
		trdregreply.setDate(transaction.getDate());
		trdregreply.setVendor(transaction.getVendor());
		trdregreply.setStatus("Successful");
		
		return trdregreply;
	}
	

}
