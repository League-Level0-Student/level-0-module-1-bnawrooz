import javax.swing.JOptionPane;

public class score {
public static void main(String[] args) {
	
	int score = 0; 
    String behzad = JOptionPane.showInputDialog("what is ww2?");
    if (behzad.equals("world war 2")) {
    	JOptionPane.showMessageDialog(null, "correct");
    	score = score + 1;
    } else {
    	JOptionPane.showMessageDialog(null, "wrong, the right answer is world war 2");
    	
    }	
    JOptionPane.showMessageDialog(null, score);
    

    
    
    
    }	
    }
