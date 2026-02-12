package compileTime_polymorphismPrograms;

public class Myntra 
{
	public void purchase(String productName)
	{
		System.out.println(productName);
	}
	public void purchase(int product_id)
	{
		System.out.println(product_id);
	}
	public void purchase(int cost,String productName)
	{
		System.out.println(cost+" "+productName);
	}
}
