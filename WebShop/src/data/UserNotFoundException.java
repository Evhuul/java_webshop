package data;

public class UserNotFoundException extends Exception 
{
	private static final long serialVersionUID = 20140102L;
	
	public UserNotFoundException(String userMsg)
	{
		super(userMsg);
	}

}
