package custom_exception;

public class MisMathCost extends RuntimeException
{
	public String tostring()
	{
		return getClass()+" You Entered Wrong Cost.";
	}
}
