package com.dynamic.connectivity;

public class QuickFindUF 
{
private int id[];

QuickFindUF(int N)
{
	int i;
	
	id = new int [N];
	for(i=0;i<N;i++)
	{
		id[i]=i;
	}
}
public boolean connected(int p, int q)
{
	return id[p] == id[q];
}
public void union(int p, int q)
{
	int i;
	int pid = id[p];
	int qid = id[q];
	
	for(i = 0; i < id.length; i++)
	{
		if(id[i] == pid)
			id[i] = qid;
	}
}
public void display(int N)
{
	int i; 
	for(i=0; i < N; i++)
	{
		System.out.println(id[i]);
	}
}
public static void main(String args[])throws Exception
{
QuickFindUF aa = new QuickFindUF(3);

aa.connected(0,1);
aa.union(0,1);
aa.display(3);


}
}