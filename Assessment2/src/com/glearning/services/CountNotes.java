package com.glearning.services;
import java.util.*;
public class CountNotes {

	public int minNotes(int [] arr, int tar)
	{
		int n=arr.length;
		int test[][]=new int[n][tar+1];
		for(int[] row:test)
		{
			Arrays.fill(row,0);
		}
		
		int ans=getMinimum(arr,tar,test);
		if(ans>=(int)Math.pow(10, 9))
			return -1;
		return ans;
	}
	public static int getMinimum(int [] arr,int tar,int [][] test)
	{
		for(int i=0;i<=tar;i++)
		{
			if(i%arr[0]==0)
				test[0][i]=i/arr[0];
			else
				test[0][i]=(int)Math.pow(10, 9);
		}
		for(int i=1;i<arr.length;i++)
		{
			for(int x=0;x<=tar;x++)
			{
				int option1=test[i-1][x];
				int option2=Integer.MAX_VALUE;
				if(arr[i]<=x)
				{
					option2=1+test[i][x-arr[i]];
				}
				test[i][x]=Math.min(option1, option2);
			}
		}
		return test[arr.length-1][tar];
	}
}
