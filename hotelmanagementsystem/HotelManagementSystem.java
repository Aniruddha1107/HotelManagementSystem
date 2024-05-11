package hotelmanagementsystem;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.io.PrintStream;
public class HotelManagementSystem extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
    private PrintStream s;
	
	
	public HotelManagementSystem() {
		setSize(1366,565); //to set frame size
		setLocation(100,100); //to set location from top-left
              
                
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
		JLabel image=new JLabel(i1);
		image.setBounds(0,0,1366,565);
		add(image);
		
		JLabel text=new JLabel("Hotel Management System");
		text.setBounds(20,430,1000,90);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("serif",Font.PLAIN,50));
		image.add(text);
		
		JButton next=new JButton("Next");
		next.setBounds(1050,450,150,50);
		next.setBackground(Color.WHITE);
		next.setForeground(Color.MAGENTA);
		next.setFont(new Font("serif",Font.PLAIN,24));
		image.add(next);
		next.addActionListener(this);
		
		setVisible(true); //to set frame to visible
		
		while(true) {
			text.setVisible(false);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
                            e.printStackTrace(s);
                        }
			text.setVisible(true);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
                            e.printStackTrace(s);
			}
		}
		
	}
	public static void main(String args[]) {
		HotelManagementSystem obj=new HotelManagementSystem();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		new Login();
	}

  
}
