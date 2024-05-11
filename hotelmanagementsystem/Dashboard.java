
package hotelmanagementsystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener{

    public Dashboard() {
        initComponents();
        		setBounds(0,0,1550,1000);
		
		setLayout(null);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
		Image i2=i1.getImage().getScaledInstance(1550,1000,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,1550,1000);
		add(image);
		
		JLabel text=new JLabel("The ROYAL ORCHID METROPOLE MYSORE Welcome You");
		text.setBounds(450,80,1000,50);
		text.setFont(new Font("Tahoma",Font.PLAIN,30));
		text.setForeground(Color.WHITE);
		image.add(text);
		
		JMenuBar mb=new JMenuBar();
		mb.setBounds(0,0,1500,30);
		image.add(mb);
		
		JMenu hotel=new JMenu("Hotel Management");
		hotel.setForeground(Color.RED);
		mb.add(hotel);
		
		JMenuItem reception=new JMenuItem("Reception");
		reception.addActionListener(this);
                hotel.add(reception);
		
		JMenu admin=new JMenu("ADMIN");
		admin.setForeground(Color.RED);
		mb.add(admin);
		
		JMenuItem addemployee=new JMenuItem("Add Employee");
                addemployee.addActionListener(this);
		admin.add(addemployee);
		
		JMenuItem addroom=new JMenuItem("Add Rooms");
                addroom.addActionListener(this);
		admin.add(addroom);
		
		JMenuItem adddrivers=new JMenuItem("Add Drivers");
                adddrivers.addActionListener(this);
		admin.add(adddrivers);
		
		setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Add Employee")){
            new AddEmployee();
        }
        if(e.getActionCommand().equals("Add Rooms")){
             new AddRooms();
        }
        if(e.getActionCommand().equals("Add Drivers")){
             new AddDriver();
        }
        if(e.getActionCommand().equals("Reception")){
             new Reception();
        }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
