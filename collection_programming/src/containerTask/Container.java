package containerTask;

import java.util.Arrays;

public class Container<E> 
{
	private Object[] arr ;
	int index=0;
	
	Container()
	{	
		arr= new Object[5];
	}
	public void add(E ele)
	{
		if(index==arr.length)
			arr=grow();
		arr[index++]=ele;
	}
	private Object[] grow()
	{
		Object [] newArray=new Object[arr.length+3];
		for(int i=0;i<=arr.length-1;i++)
		{
			newArray[i]=arr[i];
		}
		return newArray;
	}
	public E remove(int index)
	{
		if(index<0 || index>=arr.length)
			throw new ElementNotFoundException();
		E  ele = (E) arr[index];
		arr[index]=null;
		for(int i=index;i<=arr.length-2;i++)
		{
			arr[i]=arr[i+1];
			
		}
		this.index--;
		arr[arr.length-1]=null;
		return ele;
	}
	public E update(int index,E newE)
	{
		if(index<0 || index>=arr.length)
			throw new ElementNotFoundException();
		E ele = (E) arr[index];
		arr[index]=newE;
		return (E) ele;
	}
	public E get(int index)
	{
		if(index<0 || index>=arr.length)
			throw new ElementNotFoundException();
		return (E) arr[index];
	}
	@Override
	public String toString() 
	{
		String st="[ ";
		for(int i=0;i<=index-1;i++)
		{
			if(i<this.index-1)
				st=st+arr[i]+", ";
			else
				st=st+arr[i];
			
		}
		st=st+" ]";
		return st;
	}
	public int size()
	{
		return arr.length;
	}
	
}
