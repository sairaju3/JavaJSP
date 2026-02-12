package custom_exception;

public class MisMatchNoOfPages extends RuntimeException
{
	public String toString()
	{
		return getClass()+" You entered Wrong No Of Pages.";
	}
}
