
package hotelmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddDriver extends javax.swing.JFrame implements ActionListener{

     JButton add,cancle;
    JTextField tfname,tfage,tfcompany,tfmodel,tflocation;
    JComboBox gendercombo,availablecombo;
   
    public AddDriver() {
        initComponents();
         getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Add Drivers");
        heading.setFont(new Font("Tahoma",Font.BOLD,18));
        heading.setBounds(150,10,200,20);
        add(heading);
        
        JLabel lblroomno=new JLabel("Name");
        lblroomno.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblroomno.setBounds(60,70,120,20);
        add(lblroomno);
        
        tfname=new JTextField();
        tfname.setBounds(200,70,150,30);
        add(tfname);
        
        JLabel lblage=new JLabel("Age");
        lblage.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblage.setBounds(60,110,120,20);
        add(lblage);
        
          tfage=new JTextField();
        tfage.setBounds(200,110,150,30);
        add(tfage);
        
         JLabel lblclean=new JLabel("Gender");
        lblclean.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblclean.setBounds(60,150,120,20);
        add(lblclean);
        
        String cleanOptions[]={"Male","Female"};
        gendercombo=new JComboBox(cleanOptions);
        gendercombo.setBounds(200,150,150,30);
        gendercombo.setBackground(Color.WHITE);
        add(gendercombo);
        
         JLabel lblprice=new JLabel("Car Company");
        lblprice.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblprice.setBounds(60,190,120,20);
        add(lblprice);
        
        tfcompany=new JTextField();
        tfcompany.setBounds(200,190,150,30);
        add(tfcompany);
        
         JLabel lbltype=new JLabel("Car Model");
        lbltype.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbltype.setBounds(60,230,120,20);
        add(lbltype);
        
         tfmodel=new JTextField();
        tfmodel.setBounds(200,230,150,30);
        add(tfmodel);
        
         JLabel lblavailable=new JLabel("Avalability");
        lblavailable.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblavailable.setBounds(60,270,120,20);
        add(lblavailable);
        
        String driverOption[]={"Avalable","Busy"};
        availablecombo=new JComboBox(driverOption);
        availablecombo.setBounds(200,270,150,30);
        availablecombo.setBackground(Color.WHITE);
        add(availablecombo);
        
        JLabel lbllocation=new JLabel("Location");
        lbllocation.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbllocation.setBounds(60,310,120,20);
        add(lbllocation);
        
         tflocation=new JTextField();
        tflocation.setBounds(200,310,150,30);
        add(tflocation);
        
        
        add=new JButton("Add Driver");
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setBounds(60,360,130,30);
        add.addActionListener(this);
        add(add);
        
        cancle=new JButton("Cancle");
        cancle.setForeground(Color.WHITE);
        cancle.setBackground(Color.BLACK);
        cancle.setBounds(220,360,130,30);
        cancle.addActionListener(this);
        add(cancle);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(400,30,500,300);
        add(image);
        
        setBounds(300,200,980,470);
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
                new AddDriver();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
            String name=tfname.getText();
            String age=tfage.getText();
            String gender=(String)gendercombo.getSelectedItem();
            String company=tfcompany.getText();
            String brand=tfmodel.getText();
            String available=(String)availablecombo.getSelectedItem();
            String location=tflocation.getText();
            try{
                Conn conn = new Conn();
                String str="insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+brand+"','"+available+"','"+location+"')";
                conn.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null,"New Driver Added Successfully"); 
                
            }catch(Exception ex){
                ex.printStackTrace();
            }
            
        }else{
            setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
