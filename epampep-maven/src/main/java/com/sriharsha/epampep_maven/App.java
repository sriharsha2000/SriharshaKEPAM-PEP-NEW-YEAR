package com.sriharsha.epampep_maven;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static int nofGifts = 0;
	static Gift gifts[];
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of gifts: ");
        nofGifts = in.nextInt();
        gifts = new Gift[nofGifts];
        for(int i = 0; i < nofGifts; i++)
        {
        	System.out.println("Enter number of chocolates in gift #" + (i+1));
        	gifts[i] = new Gift(in.nextInt(), in.nextInt());
        }
        String q = "";
        while(!q.equals("q"))
        {
        	System.out.println("Choice: 1: display gifts\n2: sort all chocolates in gifts\n3: sort all cakes in gifts");
        	int ch = in.nextInt();
        	if(ch==1)
        	{
        		for(int i=0; i<nofGifts; i++)
        		{
        			gifts[i].displayItems();
        		}
        	}
        	else if(ch==2)
        	{
        		for(int i=0; i<nofGifts; i++)
        		{
        			gifts[i].sortChocolates();
        		}
        	}
        	else if(ch==3)
        	{
        		for(int i=0; i<nofGifts; i++)
        		{
        			gifts[i].sortCakes();
        		}
        	}
        	System.out.println("Enter 'q' to exit: ");
        	q = in.next();
        }
    }
}
