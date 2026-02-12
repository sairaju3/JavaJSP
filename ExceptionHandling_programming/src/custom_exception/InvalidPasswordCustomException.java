package custom_exception;

public class InvalidPasswordCustomException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+" You Entered Wrong Password";
	}
}
