package Examples;

import java.util.Random;

public class Array {
	public static void main(String[]args)
	{
		Random r=new Random();
		int a[]=new int[50];
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt(50);
		}
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
