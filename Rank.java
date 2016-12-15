
public enum Rank 
{

	ACE("Ace"), TWO("Two"), THREE("Three"), FOUR("Four"), FIVE("Five"), SIX("Six"), SEVEN("Seven"), EIGHT("Eight"), NINE("Nine"), TEN("Ten"), JACK("Eleven"), QUEEN("Telve"), KING("Thirteen");
	private String rankValue;
	
	private Rank(String s)
	{
		switch(s)
		{
		case "Ace": rankValue = "Ace"; break;
		case "Two": rankValue = "Two"; break;
		case "Three": rankValue = "Three"; break;
		case "Four": rankValue = "Four"; break;
		case "Five": rankValue = "Five"; break;
		case "Six": rankValue = "Six"; break;
		case "Seven": rankValue = "Seven"; break;
		case "Eight": rankValue = "Eight"; break;
		case "Nine": rankValue = "Nine"; break;
		case "Ten": rankValue = "Ten"; break;
		case "Eleven": rankValue = "Eleven"; break;
		case "Twelve": rankValue = "Twele"; break;
		case "Thirteen": rankValue = "Thirteen"; break;
		
		}
		rankValue = s;
	}
	
	public String getCard()
	{
		return rankValue;
	}
}
