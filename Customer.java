/**
 *  This is the Customer class with all the instance data for that customer
 * @author Steven
 * @version 1.1.1.1
 */
public class Customer {
	/**
	 * String for the first name of customer
 	*/
	String fName;
	/**
	 * String for last name of customer
	 */
	String lName;
	/**
	 * String for email of customer
	 */
	String eMail;
	/**
	 * String for username for customer
	 */
	String userName;
	/**
	 * String for password for customer
	 */
	String password;
	/**
	 * String for confirm password to make sure the passwords match
	 */
	String confirmPassword;
	/**
	 * String for gender of customer
	 */
	String gender;
	/**
	 * String for what they are, Student, Teacher, Parent, Other
	 */
	String discription;
	/**
	 * String for date of birth
	 */
	String DOB;
	/**
	 * boolean value if they want the weekly updates
	 */
	boolean weekly;
	
	
	//constructors
	/**
	 * blank constructor to help with the create account page. Leave here so logic works
	 */
	public Customer()
	{
		
	}
	/**
	 * 
	 * @param f is to be saved to firstName instance data
	 * @param l is to be saved to lastName instance data
	 * @param e is to be save to eMail instance data
	 * @param u is to be saved to userName instance data
	 * @param p is to be saved to password
	 * @param cP is to be saved to confirmPassword
	 * @param g is to be checked in enum (teacher made us) to set the gender
	 * @param d is to be saved to discription instance data
	 * @param w is to be saved to boolean weekly instance data
	 * @param dob is to be saved to DOB instance data
	 */
	public Customer(String f, String l, String e, String u, String p, String cP, String g, String d, boolean w, String dob)
	{
		fName = f;
		lName = l;
		eMail = e;
		userName = u;
		password = p;
		confirmPassword = cP;
		
		Gender test;
		if(g.equals("Male"))
		{
			test = Gender.MALE;
		}
		else if (g.equals("Female"))
		{
			test = Gender.FEMALE;
		}
		else
		{
			test = Gender.OTHER;
		}
		
		gender = test.getGender();
		discription =d;
		weekly =w;
		DOB = dob;
		
		
//		System.out.println(fName);
//		System.out.println(lName);
//		System.out.println(eMail);
//		System.out.println(userName);
//		System.out.println(password);
//		System.out.println(confirmPassword);
	}
	
	
	//password method
	/**
	 * method to make sure the password meets the requirements being...
	 * at least one digit
	 * at least one lower-case letter
	 * at least one capital letter
	 * at least one special character
	 * and ranges from 6-12 in length
	 * 
	 * @param l is the password in String format
	 */
	public static boolean passVerify(String l)
	{
		String password = l;
		boolean matchAnswer = password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{6,12}$");
		
		return matchAnswer;
	}
	
	
	//accessors
	/**
	 * 
	 * @return first name of customer
	 */
	public String getFirstName()
	{
		return fName;
	}
	/**
	 * 
	 * @return last name of customer
	 */
	public String getLastName()
	{
		return lName;
	}
	/**
	 * 
	 * @return email of customer
	 */
	public String getEMail()
	{
		return eMail;
	}
	/**
	 * 
	 * @return username of customer
	 */
	public String getUserName()
	{
		return userName;
	}
	/**
	 * 
	 * @return password of customer
	 */
	public String getPassword()
	{
		return password;
	}
	/**
	 * 
	 * @return confirm password of customer
	 */
	public String getConfirmPassword()
	{
		return confirmPassword;
	}
	
	
	//modifiers
	/**
	 * 
	 * @param f is to be set as customers first name
	 */
	public void setFirstName(String f)
	{
		fName=f;
	}
	/**
	 * 
	 * @param f is to be set as customers last name
	 */
	public void setLastName(String f)
	{
		lName=f;
	}
	/**
	 * 
	 * @param f is to be set as customers email
	 */
	public void setEMail(String f)
	{
		eMail=f;
	}
	/**
	 * 
	 * @param f is to be set as customers username
	 */
	public void setUserName(String f)
	{
		userName=f;
	}
	/**
	 * 
	 * @param f is to be set as customers password
	 */
	public void setPassword(String f)
	{
		password=f;
	}
	/**
	 * 
	 * @param f is to be set as cusotmers confirm password
	 */
	public void setConfirmPassword(String f)
	{
		confirmPassword=f;
	}
	
	
	//toString method
	/**
	 * This displays all instance data in printf format to make sure all the customers data is correct 
	 * and the program worked properly
	 */
	public String toString()
	{
		System.out.printf("%-15s %-15s %-25s %-25s %-25s %-15s %-15s %-15s %-15s %n",
				"First Name", "Last Name", "Email", "Date of Birth", "Username","Password", "Gender", "Classification", "Weekly Subscription");
		return String.format("%-15s %-15s %-25s %-25s %-25s %-15s %-15s %-15s %5b %n", fName, lName, eMail, DOB, userName, password, gender, discription, weekly);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	}

}
