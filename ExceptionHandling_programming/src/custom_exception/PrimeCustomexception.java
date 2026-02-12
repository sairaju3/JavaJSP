package custom_exception;

public class PrimeCustomexception extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+" you Entered Wrong Prime  Number";
	}
}
