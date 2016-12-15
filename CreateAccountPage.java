import javax.swing.*;



import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** 
 * This is the CreateAccountPage that creates an account for a program
 * 
 * @author Steven
 * @version 1.1.1.1
 * @see something else
 * 
 * 
 */

public class CreateAccountPage extends JFrame
{
	JPanel caPage;
	JLabel FName, LName, eMail, DOB, Pass, ConfirmPass, Username; 
	JButton CreateAccount;
	JTextField fName, lName, EMail, PASS, CON, User;
	
	JCheckBox Male, Female, Other, Student, TA, Parent, Oother, Weekly;
	String[] Month, Day, Year;
	JComboBox mList, dList, yList; 
	
	String FirstName, LastName, EmailAddress, UserNAME, Password, ConfirmPassword;
	
	/**
	 * creates the CAP page and runs the program
	 */
	public CreateAccountPage()
	{
		this.setSize(400,800);
		this.setLocationRelativeTo(null);
		
		this.setTitle("Create Account");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add panel at top
		caPage = new JPanel();
		caPage.setLayout(new GridBagLayout());
		JLabel cal1 = new JLabel("Create Account");		
		
		//adding pictures
		JLabel logo1 = new JLabel(new ImageIcon("imgres.png"), JLabel.CENTER);
		addComp(caPage, logo1, 1,0,3,2, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		
		//adding labels
		
		//enter first name
		FName = new JLabel("First Name");
		addComp(caPage, FName, 0,6,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		fName = new JTextField();
		fName.setPreferredSize( new Dimension( 200, 24 ) );
		addComp(caPage, fName, 2,6,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);

		
		//enter last name
		LName = new JLabel("Last Name");
		addComp(caPage, LName, 0,10,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		lName = new JTextField();
		lName.setPreferredSize( new Dimension( 200, 24 ) );
		addComp(caPage, lName, 2,10,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		
		//enter email
		eMail = new JLabel("Email Address");
		addComp(caPage, eMail, 0,14,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		EMail = new JTextField();
		EMail.setPreferredSize( new Dimension( 200, 24 ) );
		addComp(caPage, EMail, 2,14,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		
		//check box for gender
		JLabel gender = new JLabel("Select Gender");
		addComp(caPage, gender, 0,18,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		Male = new JCheckBox("Male");
		addComp(caPage, Male, 0,22,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		Female = new JCheckBox("Female");
		addComp(caPage, Female, 2,22,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		Other = new JCheckBox("Other");
		addComp(caPage, Other, 4,22,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);

		//username
		Username = new JLabel("Username");
		addComp(caPage, Username, 0,26,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		User = new JTextField();
		User.setPreferredSize( new Dimension( 200, 24 ) );
		addComp(caPage, User, 2,26,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);

		
		
		//password
		Pass = new JLabel("Password");
		addComp(caPage, Pass, 0,30,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		Pass.setToolTipText("6-12 Length, 1 or More Uppercase, 1 or More Lowercase, 1 or More Digit, 1 or More Special Character, No Spaces");
		PASS = new JPasswordField();
		PASS.setPreferredSize( new Dimension( 200, 24 ) );
		addComp(caPage, PASS, 2,30,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);

		
		//confirm password
		ConfirmPass = new JLabel("Confirm Password");
		addComp(caPage, ConfirmPass, 0,34,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
 		CON = new JPasswordField();
		CON.setPreferredSize( new Dimension( 200, 24 ) );
		addComp(caPage, CON, 2,34,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		
		ButtonGroup Gender = new ButtonGroup();
		Gender.add(Male);
		Gender.add(Female);
		Gender.add(Other);
		
//		//Date of Birth
		DOB = new JLabel("Date of Birth");
		addComp(caPage, DOB, 0,38,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		String[] Month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October"
				, "November","December"};
		mList = new JComboBox(Month);
		addComp(caPage, mList, 2,38,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		String [] Day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"
				,"21","22","23","24","25","26","27","28","29","30","31"};
		dList = new JComboBox(Day);
		addComp(caPage, dList, 3,38,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		String [] Year ={"Before 1949","1950","1951","1952","1953","1954","1955","1956","1957","1958","1959",
				"1960","1961","1962","1963","1964","1965","1966","1967","1968","1969",
				"1970","1971","1972","1973","1974","1975","1976","1977","1978","1979",
				"1980","1981","1982","1983","1984","1985","1986","1987","1988","1989",
				"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999",
				"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009",
				"2010","2011","2012","2013","2014","2015","2016"};
		yList = new JComboBox(Year);
		addComp(caPage, yList, 4,38,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);


		
		//check box for who you are
		JLabel who = new JLabel("Who are you?");
		addComp(caPage, who, 2,42,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		Student = new JCheckBox("Student");
		addComp(caPage, Student, 0,46,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		TA = new JCheckBox("Teacher or Admin");
		addComp(caPage, TA, 2,46,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		Parent = new JCheckBox("Parent");
		addComp(caPage, Parent, 4,46,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		Oother = new JCheckBox("Other");
		addComp(caPage, Oother, 6,46,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		
		ButtonGroup Person = new ButtonGroup();
		Person.add(Student);
		Person.add(TA);
		Person.add(Parent);
		Person.add(Oother);	

		//subscribe check box
		Weekly = new JCheckBox("Subsrcibe For Store Updates");
		addComp(caPage, Weekly, 2,50,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);

		
		//create account button
		CreateAccount = new JButton("Create Account");
		addComp(caPage, CreateAccount, 2,54,1,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		ListenForButtons myButtonListener = new ListenForButtons();
		CreateAccount.addActionListener(myButtonListener);

		this.add(caPage);	//adds panel to the screen
		this.pack();
		this.setVisible(true);
		
	}
	/**
	 * 
	 * Adds component to the panel
	 * 
	 * @param thePanel the CreateAccountsPage
	 * @param comp usually the class you are in
	 * @param xP the x position
	 * @param yP the y position
	 * @param w the width of item
	 * @param h the height of item
	 * @param place where on the page you want to place
	 * @param stretch don't do this
	 */
	private void addComp(JPanel thePanel, JComponent comp, int xP, int yP, int w, int h, int place, int stretch)
	{
		GridBagConstraints gridC = new GridBagConstraints();
		gridC.gridx = xP;
		gridC.gridy = yP;
		gridC.gridwidth = w;
		gridC.gridheight = h;
		gridC.insets = new Insets(5,5,5,5);
		gridC.anchor = place;
		gridC.fill = stretch;
		thePanel.add(comp, gridC);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CreateAccountPage();
	}
	
	/**
	 *  This class looks for which buttons are pressed on the CreateAccountPage
	 * @author Steven
	 * @version 1.1.1.1
	 * 
	 */
	private class ListenForButtons implements ActionListener
	{

		@Override
		/**
		 * This method gathers all information for the user who is creating an account, saving the info,
		 * checks the password to make sure it passes the requirements, and then calls the Customer Constructor
		 * 
		 * @param e is a button
		 */
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Customer me = new Customer();
			
			//Password = Pass.getText();
			
			//me.passVerify(Password);
			
			
			if(e.getSource()==CreateAccount);
			{

				FirstName = fName.getText();
				LastName = lName.getText();
				EmailAddress = EMail.getText();
				UserNAME = User.getText();
				Password = PASS.getText();
				ConfirmPassword = CON.getText();
				
				String MONTH = (String) mList.getSelectedItem();
				String DAY = (String) dList.getSelectedItem();
				String YEAR = (String) yList.getSelectedItem();

				String DATEOFBIRTH = MONTH +", " + DAY + ", " +YEAR;
				
				String GENDER ="";
				if (Male.isSelected())
					GENDER = "Male";
				else if(Female.isSelected())
					GENDER = "Female";
				else
					GENDER = "Other";
				
				String discription = "";
				if(Student.isSelected())
					discription = "Student";
				else if(TA.isSelected())
					discription = "Teacher / Admin";
				else if(Parent.isSelected())
					discription = "Parent";
				else
					discription = "Other";
				
				boolean weekly = false;
				if(Weekly.isSelected())
					weekly = true;
				//System.out.println(FirstName + " " + LastName+ " is creating an account");
				
				
				/**
				 * This makes sure the Password within requirements and then will run program
				 */
				if (Customer.passVerify(Password))
				{
					//System.out.println("IM inside here");
					Customer me = new Customer(FirstName, LastName, EmailAddress, UserNAME, Password, ConfirmPassword, GENDER, discription, weekly, DATEOFBIRTH);
				}
				else
				{
					//JOptionPane.showMessageDialog(caPage, "Password does not meet requirments" );
					//System.out.println("Im here");
					CreateAccountPage again = new CreateAccountPage();
					JOptionPane.showMessageDialog(null, "Password does not meet requirments" );
				}
				
				//System.out.println(me);
				dispose();
			}

			
			
		}
		
	}

}
