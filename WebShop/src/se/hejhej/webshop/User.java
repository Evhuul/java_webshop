package se.hejhej.webshop;

public class User implements java.io.Serializable 
{

	private static final long serialVersionUID = -5651447119411623806L;
	private String id;
	private String username;
	private String password;

	public User(String id, String username, String password) 
	{
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getId() 
	{
		return (this.id);
	}

	public String getUsername() 
	{
		return (this.username);
	}

	public String getPassword() 
	{
		return (this.password);
	}
	
	public String toString()
	{
		String uSep = System.getProperty("line.separator");
		StringBuffer buffer2 = new StringBuffer();
		buffer2.append(uSep);
		buffer2.append("User id is: ");
		buffer2.append(id);
		buffer2.append(uSep);
		buffer2.append("User is: ");
		buffer2.append(username);
		buffer2.append(uSep);
		buffer2.append("User password is: ");
		buffer2.append(password);
		
		return buffer2.toString();
	} // toString

}
