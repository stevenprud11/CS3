import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class MainPage extends JFrame
{
	JPanel mpp;
	JButton mpLoginB, mpCrAccountB;
	public MainPage()
	{
		this.setSize(400,500);
		this.setLocationRelativeTo(null);
		this.setTitle("Lovejoy School Store");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Main Page Panel (mpp)
		mpp = new JPanel();
		mpp.setLayout(new GridBagLayout());
		JLabel mpl1 = new JLabel("Lovejoy School Store");
		addComp(mpp, mpl1, 1,0,2,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);


		//adding pictures
		JLabel logo1 = new JLabel(new ImageIcon("imgres.png"));
		addComp(mpp, logo1, 1,4,2,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		
		//Buttons for the panel
		mpLoginB = new JButton("Login");
		mpLoginB.setToolTipText("Enter Your Login ID");	// adds text when hovering over button or text to help user
		mpCrAccountB = new JButton("Create Account");
		mpCrAccountB.setToolTipText("Create Account");  // adds text when hovering over button or text to help user
		
		//add button listener
		ListenForButtons myButtonListener = new ListenForButtons();
		mpLoginB.addActionListener(myButtonListener);
		mpCrAccountB.addActionListener(myButtonListener);
		
		//adds buttons
		addComp(mpp, mpLoginB, 0,8,2,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		addComp(mpp, mpCrAccountB, 2,8,2,3, GridBagConstraints.CENTER, GridBagConstraints.NONE);

		
		//adds panel to the screen
		this.add(mpp);
		this.pack();
		this.setVisible(true);
		
		
	}
	
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
		new MainPage();
	}
	//new class inside of MainPage Class
	private class ListenForButtons implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==mpLoginB)
				new LoginPage();
			if(e.getSource()==mpCrAccountB)
				new CreateAccountPage();
			dispose();
		}
		
	}
}
