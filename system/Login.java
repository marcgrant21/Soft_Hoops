/*GROUP 2 SOFT HOOPS*/
package system;
import javax.swing.*;
import java.awt.*;

	public class Login {
		private JFrame frame;
		private JPanel panel;
		private JButton button1;
		private JButton button2;
		private Font myfont;
		private JTextField textbox1;
		private JPasswordField textbox2;
		private JLabel namelabel;
		private JLabel passwordlabel;
		
		public Login() {
			GUI();
		}
		
		public void GUI() {
/*Creates and sets frame and size*/
			frame = new JFrame("Soft HOOPS V.1");
			frame.setVisible(true);
			frame.setSize(800,500);
			frame.setLocation(120,80);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/*Creates and sets panel and color*/			
			panel = new JPanel();
			panel.setBackground (Color.BLUE);
			panel.setLayout(null);
			frame.add(panel);
/*Creates button, sets: location, and color*/			
			button1 = new JButton("Register");
			button1.setBounds(50,50,100,25);
			button1.setBackground(Color.WHITE);
			namelabel = new JLabel("Username:");
			namelabel.setBounds(600,400,75,25);
			myfont = new Font ("Verdana",Font.BOLD,12);
			namelabel.setFont(myfont);
			panel.add(namelabel);
			
			button2 = new JButton("Login");
			button2.setBounds(800,600,100,25);
			button2.setBackground(Color.WHITE);
			passwordlabel = new JLabel("Password:");
			passwordlabel.setBounds(600,500,75,25);
			passwordlabel.setFont(myfont);
			panel.add(passwordlabel);

/*Create and set font*/
			button1.setFont(myfont);
			button2.setFont(myfont);
/*Adds buttons to the panel*/			
			panel.add(button1);
			panel.add(button2);
/*Creates text box*/	
			textbox1 = new JTextField(30);
			textbox1.setBounds(600,450,300,25);
			panel.add(textbox1); 
			textbox2 = new JPasswordField();
			textbox2.setBounds(600,550,300,25);
			panel.add(textbox2); 
/*Creates action listeners for text boxes*/
		/*	button2.addActionListener(new ActionListener()) {
				public void actionPerformed(ActionEvent arg0) {
			try {
				Class.forName("");
				Connection conn = DriveManager.getConnection("",",");
				Statement state = conn.createStatement();
				String sql =""+textbox1.getText()+""textbox2.getText();
				ResultSet result=state.executeQuery(sql);
				if(result.next())
					JOptionPane.showMessageDialog(null,"Login Successful");
				else
					JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
			}catch(Exception e) {
				System.out.print(e);
		 }
	  }		*/	
	}
 }

