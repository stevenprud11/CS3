
public enum Suit {
	DIAMOND("Diamond"), HEART("Heart"), CLUB("Club"), SPADE("Spade");

	private String s;
	private Suit(String a)
	{
		switch(a)
		{
		case "Diamond":s = "Diamond";break;
		case "Heart":s = "Heart"; break;
		case "Club":s = "Club"; break;
		case "Spade":s = "Spade"; break;
		default :  s ="What is Happening"; break;
		}
	}
	
	public String getSuit()
	{
		return s;
	}
	

}
