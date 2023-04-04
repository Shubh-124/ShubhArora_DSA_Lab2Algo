package com.glearning.client;

import java.util.Scanner;

import com.glearning.services.CountNotes;

public class Client {

	public static void main(String[] args) {
CountNotes denomination=new CountNotes();
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		int n=s.nextInt();
		int inputCurrency[]=new int[n];
		System.out.println("enter the currency denominations value:");
		for(int i=0;i<n;i++)
		{
			inputCurrency[i]=s.nextInt();
		}
		

			int target;
			System.out.println("enter the amount you want to pay");
			target=s.nextInt();
			if(denomination.minNotes(inputCurrency,target)!=-1)
			{
				System.out.println("Minimum no of notes required to pay the given amount are: "+denomination.minNotes(inputCurrency,target));
			}
			else
			{
				System.out.println("Required amount can't be paid with given denominations");
				
			}
		s.close();

	}

}
