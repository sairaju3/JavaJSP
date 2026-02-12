package custom_exception;

public class InvalidTitle extends RuntimeException
{
	public String toString()
	{
		return getClass()+"You Entered Valid Title Name..";
	}
}
