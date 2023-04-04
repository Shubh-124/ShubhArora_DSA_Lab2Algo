package com.glearning.services;

public class TransactionService {

	public void checkTarget(long [] arr,long tar) {
		long sum=0;
		boolean flag=false;
		for(long i=0;i<arr.length;i++) {
			sum+=arr[(int)i];
			
			if(sum>=tar)
			{
				System.out.println("Target achieved after " + (i+1) + " transactions");
				flag=true;
				break;
			}
			
		}
		if(!flag)
			System.out.println("Given target is not achieved");
	}
}
