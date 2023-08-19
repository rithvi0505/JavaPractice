package com.kodnest.august.dailypractice;

import java.util.Scanner;

public class ArrayOpposite {                    //ERROR coming

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String word=scan.nextLine();
		char[] wordArr=word.toCharArray();
		System.out.println(wordArr);
		
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				wordArr[j]=wordArr[i];
				System.out.println(wordArr);
			}
		}
		System.out.println(wordArr);

	}

}
