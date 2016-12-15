
public enum Currency 
{
	PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
	private int value;
	
	private Currency(int v)
	{	this.value = v;		}
	public int getValue()
	{	return value;		}
}
