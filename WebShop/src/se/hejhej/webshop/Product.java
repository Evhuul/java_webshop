package se.hejhej.webshop;

public class Product implements java.io.Serializable 
{

	private static final long serialVersionUID = 6275774896190383890L;
	private String pid;
	private String pname;
	private int qty;
	private double price;

	public Product(String pid, String pname, int qty, double price) 
	{
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}

	public void setPid(String pid) 
	{
		this.pid = pid;
	}

	public void setPname(String pname) 
	{
		this.pname = pname;
	}

	public void setQty(int qty) 
	{
		this.qty = qty;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	public String getPid() 
	{
		return (this.pid);
	}

	public String getPname() 
	{
		return (this.pname);
	}

	public int getQty() 
	{
		return (this.qty);
	}

	public double getPrice() 
	{
		return (this.price);
	}

	public String toString() 
	{
		String sep = System.getProperty("line.separator");
		StringBuffer buffer = new StringBuffer();
		buffer.append(sep);
		buffer.append("----- Product Detail ----- ");
		buffer.append(sep);
		buffer.append("\tProduct id: ");
		buffer.append(pid);
		buffer.append(sep);
		buffer.append("\tProductname: ");
		buffer.append(pname);
		buffer.append(sep);
		buffer.append("\tQuantity: ");
		buffer.append(qty);
		buffer.append(sep);
		buffer.append("\tPrice: ");
		buffer.append(price);
		buffer.append(sep);
		return buffer.toString();
	}

}