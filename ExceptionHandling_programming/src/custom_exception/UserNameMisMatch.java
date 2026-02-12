package custom_exception;

public class UserNameMisMatch extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+" You Entered Wrong User Name";
	}
}
