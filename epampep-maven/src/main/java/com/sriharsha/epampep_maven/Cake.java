package com.sriharsha.epampep_maven;

public abstract class Cake implements Sweet, Comparable<Cake> {
	int sweetness = 0;
	int weight = 0;
	public int compareTo(Cake c)
	{
		return this.weight - c.weight;
	}
	public Cake(int sweet, int weight)
	{
		setSweetness(sweet);
		setWeight(weight);
	}
	public void setSweetness(int s)
	{
		sweetness = s;
	}
	public void setWeight(int s)
	{
		weight = s;
	}
	public int getSweetness()
	{
		return sweetness;
	}
	public int getWeight()
	{
		return weight;
	}
}
