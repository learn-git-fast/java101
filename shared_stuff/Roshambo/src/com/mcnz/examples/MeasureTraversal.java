package com.mcnz.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MeasureTraversal
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		
		for (int i=0; i<4000000; i++)
			list.add("String" + i);		
		
		long startTimeGet = System.currentTimeMillis();
		
		for (int i=0; i<list.size(); i++)
		{
			String s = (String)list.get(i);
		}
		
		long endTimeGet = System.currentTimeMillis();
		System.out.println(endTimeGet - startTimeGet);
			 
		long startTimeIterator = System.currentTimeMillis();

		Iterator iter = list.iterator();
		while (iter.hasNext())
		{
			String s = (String)iter.next();
		}
		
		
		long endTimeIterator = System.currentTimeMillis();
		System.out.println(endTimeIterator - startTimeIterator);	 
	}
}
