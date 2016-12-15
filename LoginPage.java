import javax.swing.*;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * The LoginPage class which makes the login page using javax.swing
 * @author Steven
 * @version 1.1.1.1
 */
public class LoginPage extends JFrame 
{
	/**
	 * The panel that is being used
	 */
	JPanel LP;
	/**
	 * Login Page Label
	 */
	JLabel LPL1;
	/**
	 * Username label
	 */
	JLabel UserName;
	/**
	 * password label
	 */
	JLabel Password;
	/**
	 * text field for username
	 */
	JTextField User;
	/**
	 * text field for password
	 */
	JTextField Pass;
	/**
	 * button pressed to login to the system
	 */
	JButton Login;
	
	
	/**
	 * The constructor used to add all elements to the JPanel LP and evenutally displays the Panel
	 */
	public LoginPage()
	{
		
		this.setSize(400,500);
		this.setLocationRelativeTo(null);
		
		this.setTitle("Login Page");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LP = new JPanel();
		LP.setLayout(new GridBagLayout());
		LPL1 = new JLabel("Login Page");
		
		JLabel logo1 = new JLabel(new ImageIcon("Leopard.png"));
		addComp(LP, logo1, 1,0,2,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		
		UserName = new JLabel("Username");
		addComp(LP, UserName, 0,4,2,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		User = new JTextField();
		User.setPreferredSize( new Dimension( 200, 24 ) );
		addComp(LP, User, 2,4,2,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		
		Password = new JLabel("Password");
		addComp(LP, Password, 0,8,2,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		Pass = new JTextField();
		Pass.setPreferredSize( new Dimension( 200, 24 ) );
		addComp(LP, Pass, 2,8,2,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		
		
		Login = new JButton("Login");
		addComp(LP, Login, 1,12,2,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		ListenForButtons myButtonListener = new ListenForButtons();
		Login.addActionListener(myButtonListener);
		
		this.add(LP);	//adds panel to the screen
		this.pack();
		this.setVisible(true);
		
	}
	
	/**
	 * method used to add any element to the JPanel LP such as the JLabels and JTextFields
	 * @param thePanel is where you wish to add the element. Should be LP
	 * @param comp which element you wish to add such as the JLabels or JTextfields
	 * @param xP  the x Position on the Panel you wish to place the element
	 * @param yP the y position on the panel you wish to place the element
	 * @param w the width of the element 
	 * @param h the height of the element
	 * @param place the GridBagConstraints that you wish to put on the element
	 * @param stretch the GridBagCronstraint you wish to put on element. (use none for it to be simple)
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
		new LoginPage();

	}
	
	/**
	 * this is the button listener to see if the button gets pressed and when it does it prints loging in
	 * because I dont know what to do after this step 
	 * 
	 * @author Steven
	 *@version 1.1.1.1
	 */
	private class ListenForButtons implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub
			if(e.getSource()==Login);
			{

				System.out.println("Loging in...");
				
				dispose();
			}
		}
		
	}

}
