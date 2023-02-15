package Automation;

import java.util.ArrayList;
import java.util.List;


public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		String[] name={"harshil","Sheth","vadoddara"};
		char a='r';
		float dc=4.33f;
		
		
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=5;
		arr[4]=10;
		
		//int [] arr2= {1,2,4,5,10};
		//System.out.println(arr2[2]);
		//For loop with arrays
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(String s:name)
		{
			System.out.println(s);
		}
		ArrayList<String> b=new ArrayList<String>();
		b.add("harsh");
		b.add("sheth");
		System.out.println(b.get(1));
		System.out.println(b.contains("harsh"));
		String[] name1={"harshil","Sheth","vadoddara"};
		List<String> nameArrayList=java.util.Arrays.asList(name1);
		nameArrayList.contains("seleni");
		
	}

}
