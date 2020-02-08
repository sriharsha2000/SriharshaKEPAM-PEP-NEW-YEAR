package com.sriharsha.epampep_maven;
import java.util.Scanner;
import java.util.Arrays;

public class Gift {
	Chocolate chocolates[];
	Cake cakes[];
	int noch=0, noc=0;
	public Gift(int nofChocolates, int nofCakes)
	{
		noch = nofChocolates;
		noc = nofCakes;
		Scanner in = new Scanner(System.in);
		chocolates = new Chocolate[nofChocolates];
		cakes = new Cake[nofCakes];
		System.out.println("Number of chocolates in the gift: " + nofChocolates);
		System.out.println("Number of cakes in the gift: " + nofCakes);
		for(int i=0; i<nofChocolates; i++)
		{
			System.out.print("Enter sweetness of chocolate #" + (i+1) + ": ");
			chocolates[i].setSweetness(in.nextInt());
			System.out.print("Enter sourness of chocolate #" + (i+1) + ": ");
			chocolates[i].setSourness(in.nextInt());
		}
		for(int i=0; i<nofCakes; i++)
		{
			System.out.print("Enter sweetness of cake #" + (i+1) + ": ");
			cakes[i].setSweetness(in.nextInt());
			System.out.print("Enter weight of cake #" + (i+1) + ": ");
			cakes[i].setWeight(in.nextInt());
		}
	}
	public void sortChocolates()
	{
		Arrays.sort(chocolates);
	}
	public void sortCakes()
	{
		Arrays.sort(cakes);
	}
	public void displayItems()
	{
		for(int i=0; i<noch; i++)
		{
			System.out.println("Chocolate #" + (i+1) + "Sweetness: " + chocolates[i].getSweetness() + " Sourness: " + chocolates[i].getSourness());
		}
		for(int i=0; i<noc; i++)
		{
			System.out.println("Cake #" + (i+1) + "Sweetness: " + cakes[i].getSweetness() + " Weight: " + cakes[i].getWeight());
		}
	}
}
