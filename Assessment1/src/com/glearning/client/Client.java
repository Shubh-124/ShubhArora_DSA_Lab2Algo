package com.glearning.client;
import com.glearning.services.TransactionService;
import java.util.*;
public class Client {

	public static void main(String[] args) {
		TransactionService transaction=new TransactionService();
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of transaction array:");
		long n=s.nextInt();
		long inputTrans[]=new long[(int)n];
		System.out.println("enter the values of array:");
		for(int i=0;i<n;i++)
		{
			inputTrans[i]=s.nextLong();
		}
		System.out.println("enter the total no of targets that need to be achieved:");
		int targetNo=s.nextInt();
		while(targetNo--!=0)
		{
			long target;
			System.out.println("enter the value of target:");
			target=s.nextLong();
			transaction.checkTarget(inputTrans,target);
		}
		s.close();
	}

}
