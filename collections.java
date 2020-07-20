package com.CustomFramework;

class collections
{
	private Object[] objArray=new Object[10];
	private int elementCount=0;
	private void add(Object obj)
	{
		if(elementCount==objArray.length)
		{
			increaseCapacity();
		}
		objArray[elementCount]=obj;
		elementCount++;
	}
	public void increaseCapacity()
	{
		int newCapacity=objArray.length*2;
		Object[] nextArray=new Object[newCapacity];
		for(int i=0;i<objArray.length;i++)
		{
			nextArray[i]=objArray[i];
		}
		objArray=nextArray;
	}
	public int capacity()
	{
		return objArray.length;
	}
	public int size()
	{
		return elementCount;
	}
	
	public Object get(int index)
	{
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		System.out.println("elemennt of index: "+index);
		System.out.println(objArray[index]);
		return objArray[index];
	}
	public void replace(int index,Object obj)
	{
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		objArray[index]=obj;
	}
	public void remove(int index)
	
	{
		
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		while(index<size()-1)
		{
			objArray[index]=objArray[index+1];
			index++;
		}
		objArray[index]=null;
		elementCount--;
	}
	public void insert(int index,Object obj)
	{
		
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		if(size()==capacity())
		{
			increaseCapacity();
		}
		for(int i=size()-1;i>=index;i--)
		{
			objArray[i++]=objArray[i];
		}
		objArray[index]=obj;
		elementCount++;
	}
	public void display(Object obj)
	{	
		System.out.println("Elements in the list");
		for(int i=0;i<size();i++)
		{
			System.out.println(objArray[i]);
		}
	}
	public static void main(String args[])
	{
 		collections c=new Loki();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		c.add(5);
		c.add(6);
		c.add(7);
		c.add(8);
		c.add(9);
		c.add(10);		
		c.display(c);
		c.get(0);
		c.get(1);
		c.get(2);
		c.get(3);
		c.get(4);
		c.get(5);
		c.get(6);
		c.get(7);
		c.get(8);
		c.get(9);
		
	}		
			
}
 























