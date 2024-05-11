
package hotelmanagementsystem;

import java.awt.*;
import java.sql.ResultSet;
import javax.swing.*;
import java.awt.event.*;
import java.util.Date;
public class Checkout extends JFrame implements ActionListener{
    Choice ccustomer;
    JLabel lblroomnumber,lblcheckintime,lblcheckouttime;
    JButton checkout,back;
    public Checkout() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text=new JLabel("Checkout");
        text.setBounds(100,20,100,30);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(text);
        
        
         JLabel lblid=new JLabel("Customer Id");
        lblid.setBounds(30,80,100,30);
        add(lblid);
        
         ccustomer=new Choice();
        ccustomer.setBounds(150,80,150,25);
        add(ccustomer);
        
       
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/tick.png"));
        Image i2=i1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel tick=new JLabel(i3);
        tick.setBounds(310,80,20,20);
        add(tick);
        
          JLabel lblroom=new JLabel("Room Number");
        lblroom.setBounds(30,130,100,30);
        add(lblroom);
        
        lblroomnumber=new JLabel();
        lblroomnumber.setBounds(150,130,100,30);
        add(lblroomnumber);
        
         JLabel lblcheckin=new JLabel("Checkin Time");
        lblcheckin.setBounds(30,180,100,30);
        add(lblcheckin);
        
         lblcheckintime=new JLabel();
        lblcheckintime.setBounds(150,180,100,30);
        add(lblcheckintime);
        
         JLabel lblcheckout=new JLabel("Checkin Time");
        lblcheckout.setBounds(30,230,100,30);
        add(lblcheckout);
        
        Date date=new Date();
         lblcheckouttime=new JLabel(""+date);
        lblcheckouttime.setBounds(150,230,160,30);
        add(lblcheckouttime);
        
        checkout=new JButton("Checkout");
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        checkout.setBounds(30,280,120,20);
        checkout.addActionListener(this);
        add(checkout);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(200,280,120,20);
        back.addActionListener(this);
        add(back);
        
         try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from customer");
            while(rs.next()){
                ccustomer.add(rs.getString("number"));
                lblroomnumber.setText(rs.getString("room"));
                lblcheckintime.setText(rs.getString("checkintime"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
         
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/sixth.jpg"));
        Image i5=i4.getImage().getScaledInstance(400,250,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(350,50,400,250);
        add(image);
        
        setBounds(300,200,800,400);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkout){
            String query1="delete from customer where number='"+ccustomer.getSelectedItem()+"'";
            String query2="update room set availability='Available' where roomnumber='"+lblroomnumber.getText()+"'";
            
            try{
                Conn c=new Conn();
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null,"Checkout done");
            }catch(Exception e){
                e.printStackTrace();
            }
             setVisible(false);
            new Reception();
        }else if(ae.getSource()==back){
            setVisible(false);
            new Reception();
        }
    
    }
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
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
