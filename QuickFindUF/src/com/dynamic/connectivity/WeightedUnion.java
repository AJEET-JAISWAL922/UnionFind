package com.dynamic.connectivity;

public class WeightedUnion 
{
private int id[];
private int size[];
private int count;
public WeightedUnion(int n)
{
	count = n;
	int i;
	id = new int[n];
	size = new int[n];
	for(i=0; i < n; i++)
	{
		id[i] = i;
		size[i] = i;	
	}
}
public int count()
{
	return count;
}
public int root(int i)
{
while(i != id[i])
{
	id[i] = id[id[i]];
	i = id[i];
}
return i;
}

	
private void validate(int p)
{

	int n = id.length;
	if(p < 0 || p >= n)
	{
		throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
	}
		
}

	

public boolean connected(int p,int q)
{
	return root(p) == root(q);
}
public void union(int p, int q)
{
	int i = root(p);
	int j = root(q);
	if( i == j)
		return;
	if(size[i] < size[j])
	{
		id[i] = j; size[j] += size[i];
	}
	else
	{
		id[j] = i; size[i] += size[j];
	}
	count-- ;
}
public void display(int n)
{
	int i;
	for( i = 0; i < n; i++)
	{
		System.out.print(id[i]+ " " ); // printing id of numbers
		System.out.println(i+ " ");  // printing numbers
	}
}
public static void main(String args[])throws Exception
{
	WeightedUnion aa = new WeightedUnion(10);
	aa.union(4, 3);
	aa.union(3, 8);
	
	aa.display(10);
}
}
