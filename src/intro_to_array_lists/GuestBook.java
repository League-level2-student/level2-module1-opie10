package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.peer.ButtonPeer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame jf = new JFrame() ;
	JPanel jp = new JPanel() ;
	JButton an = new JButton() ;
	JButton vn = new JButton() ;
	
	void run() {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	jf.add(jp);
  jp.add(an);
  jp.add(vn);
  jf.setVisible(true);
  an.addActionListener(this);
  vn.addActionListener(this);
  an.setText("Add Name");
  vn.setText("View Names");
  
	// Guest #1: Bob Banders
	
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
  
  
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton bp = (JButton)e.getSource();
		if (bp == an){
		String IN	= JOptionPane.showInputDialog("Enter a name to add to the list");
		
		}
		else  {
			
		}
		}
	}
