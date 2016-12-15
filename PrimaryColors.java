public class PrimaryColors
{
	

	public enum PrimaryColorsList 
	{
		BLUE(0,0,255), YELLOW(255,255,0), RED(255,0,0);
		private int red, green, blue;
		
		
		private PrimaryColorsList(int r, int g, int b)
		{
			red=r;
			green=g;
			blue=b;
		}
		public String hexString()
		{
			return String.format("%02x%02x%02x", red, green, blue);
		}
	
	}
	
	
	
	public static void main(String [] args)
	{
		PrimaryColorsList myColor = PrimaryColorsList.YELLOW;
		
		for(PrimaryColorsList x : PrimaryColorsList.values())
		{
			System.out.println(x.hexString());
		}
		
		//System.out.println(myColor);
	
	
	}
}