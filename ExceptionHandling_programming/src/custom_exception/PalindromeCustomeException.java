package custom_exception;

public class PalindromeCustomeException extends RuntimeException
{
	public String toString()
	{
		return getClass()+"You Entered Wrong Palindrome Number";
	}
}
