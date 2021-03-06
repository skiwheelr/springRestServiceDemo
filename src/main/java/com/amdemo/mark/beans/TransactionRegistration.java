package com.amdemo.mark.beans;

import java.util.ArrayList;
import java.util.List;

public class TransactionRegistration {

	private List<Transaction> transactionRecords;
	
	private static TransactionRegistration trregd = null;
	
	private TransactionRegistration() {
		transactionRecords = new ArrayList<Transaction>();
		
	}
	
	
	public static TransactionRegistration getInstance() {
		if (trregd == null) {
			trregd = new TransactionRegistration();
			return trregd;
		}
		else {
			return trregd;
		}
	}
	
	public void add(Transaction trd) {
		transactionRecords.add(trd);
	}
	
	public String upDateTransaction(Transaction trd) {
		
		for (int i=0; i<transactionRecords.size(); i++) {
			Transaction trdn = transactionRecords.get(i);
			if (trdn.getTransactionId().contentEquals(trd.getTransactionId())) {
				transactionRecords.set(i,trd); //updates record
				return "Transaction Processed";
			}
		}
		return "Transaction Unsuccessful";
	}
	
	
	// Delete	
	public String deleteTransaction(String transactionId) {
		for(int i=0; i<transactionRecords.size(); i++)
		        {
		            Transaction stdn = transactionRecords.get(i);
		            if(stdn.getTransactionId().equals(transactionId)){
		              transactionRecords.remove(i);//update the new record
		              return "Delete successful";
		            }
		        }
		return "Delete un-successful";
		}
	
	 public List<Transaction> getTransactionRecords() {
		    return transactionRecords;
	 } 
		    
	
}
