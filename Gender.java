
public enum Gender {
	MALE("Male"), FEMALE("Female"), OTHER("Other");
	
	private String gender;
	
	private Gender(String n)
	{
		gender = n;
	}
	
	public String getGender()
	{
		return gender;
	}
}
