package _02_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	
       String behzad =	JOptionPane.showInputDialog("what is your birthady?");
       if (behzad.equals("06/09")) {
    	   JOptionPane.showMessageDialog(null, "Happy birthday");
       }else {
    	   JOptionPane.showMessageDialog(null, "merry UNbirthday");
       }
       
       
       

	
	
}
}
