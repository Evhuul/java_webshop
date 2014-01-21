package data;

public class ProductNotFoundException extends Exception 
{

	private static final long serialVersionUID = 20140101L;

	public ProductNotFoundException(String msg) 
	{
		super(msg);
	}
}