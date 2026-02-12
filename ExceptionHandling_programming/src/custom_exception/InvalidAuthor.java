package custom_exception;

public class InvalidAuthor extends RuntimeException
{
	public String toString()
	{
		return getClass()+" You Entered Wrong Author Name";
	}
}
