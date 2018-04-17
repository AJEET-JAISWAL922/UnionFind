package com.dynamic.connectivity;

public class QuickUnionUF 
{
	private int id[];
	public QuickUnionUF(int n)
	{
		int i;
		id =  new int[n];
		for(i = 0; i < n; i++)
		{
			id[i] = i;
		}

	}
private int root(int i)
{
	while(i != id[i])
		
		i = id[i];
	return i;
}
public boolean connected(int p, int q)
{
	return root(p) == root(q);
}
public void union(int p, int q)
{
	int i = root(p);
	int j = root(q);
	id[i] = j;
}
public void display(int n)
{
	int i;
	for(i = 0; i < n; i++)
	{
		System.out.print(id[i]+ " " ); // printing id of numbers
		System.out.println(i+ " ");  // printing numbers
		
	}
}
public static void main(String args[])throws Exception
{
	QuickUnionUF aa = new QuickUnionUF(10);
	aa.union(4, 3);
	aa.union(3, 8);
	aa.union(6, 5);
	aa.union(9, 4);
	aa.union(2, 1);
	aa.union(5, 0);
	aa.union(7, 2);
	aa.union(6, 1);
	aa.union(7, 3);
	aa.display(10);
}
}
