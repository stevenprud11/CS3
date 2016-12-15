

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class BitCalc extends JFrame
{


	public BitCalc()
	{
		

		 String test1= JOptionPane.showInputDialog("Please input first number: ");
		 String test2= JOptionPane.showInputDialog("Please input second number: ");
		 int a = Integer.parseInt(test1);
		 int b = Integer.parseInt(test2);
		 
		 int result;
		 // a > b
		    result = 0;
		    while (b != 0)              
		    {
		        if ((b & 01) != 0 )               
		        {
		            result = result + a;  
		        }
		        a<<=1;                    
		                                  
		        b>>=1;                   
		    }
		    JFrame test = new JFrame();
		    JOptionPane.showMessageDialog(test.getContentPane(),result);

		
	}
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BitCalc test = new BitCalc();
		
	}

}
