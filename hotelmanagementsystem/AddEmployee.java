/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aniru
 */
public class AddEmployee extends javax.swing.JFrame implements ActionListener{

   JTextField tfname,tfage,tfsalary,tfemail,tfphone,tfaadhar;
	JRadioButton rbmale,rbfemale;
	JButton submit,back;
	JComboBox cbjob;
    public AddEmployee() {
        initComponents();
        setLayout(null);
		
    	setBounds(350,200,800,500);
		JLabel lblname=new JLabel("NAME");
		lblname.setBounds(60,30,120,30);
		lblname.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(lblname);
		
		 tfname=new JTextField();
		tfname.setBounds(200,30,150,30);
		add(tfname);
		
		JLabel lblage=new JLabel("AGE");
		lblage.setBounds(60,80,120,30);
		lblage.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(lblage);
		
		 tfage=new JTextField();
		tfage.setBounds(200,80,150,30);
		add(tfage);
		
		JLabel lblgender=new JLabel("GENDER");
		lblgender.setBounds(60,130,120,30);
		lblgender.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(lblgender);
		
		 rbmale=new JRadioButton("Male");
		rbmale.setBounds(200,130,70,30);
		rbmale.setFont(new Font("Tahoma",Font.PLAIN,14));
		rbmale.setBackground(Color.WHITE);
		add(rbmale);
		
		 rbfemale=new JRadioButton("female");
		rbfemale.setBounds(280,130,70,30);
		rbfemale.setFont(new Font("Tahoma",Font.PLAIN,14));
		rbfemale.setBackground(Color.WHITE);
		add(rbfemale);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rbfemale);
		bg.add(rbmale);
		
		JLabel lbljob=new JLabel("JOB");
		lbljob.setBounds(60,180,120,30);
		lbljob.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(lbljob);
		
		String str[]= {"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Chefs","Waiter/Waiters","Manager","Accountant"};
		cbjob=new JComboBox(str);
		cbjob.setBounds(200,180,150,30);
		cbjob.setBackground(Color.WHITE);
		add(cbjob);
		
		JLabel lblsalary=new JLabel("SALARY");
		lblsalary.setBounds(60,230,120,30);
		lblsalary.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(lblsalary);
		
		 tfsalary=new JTextField();
		tfsalary.setBounds(200,230,150,30);
		add(tfsalary);
		
		JLabel lblphone=new JLabel("Phone");
		lblphone.setBounds(60,280,120,30);
		lblphone.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(lblphone);
		
		 tfphone=new JTextField();
		tfphone.setBounds(200,280,150,30);
		add(tfphone);
		
		JLabel lblemail=new JLabel("EMAIL");
		lblemail.setBounds(60,330,120,30);
		lblemail.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(lblemail);
		
		 tfemail=new JTextField();
		tfemail.setBounds(200,330,150,30);
		add(tfemail);
		
		JLabel lblaadhar=new JLabel("Aadhar");
		lblaadhar.setBounds(60,380,120,30);
		lblaadhar.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(lblaadhar);
		
		 tfaadhar=new JTextField();
		 tfaadhar.setBounds(200,380,150,30);
		add(tfaadhar);
		
		 submit=new JButton("SUBMIT");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setBounds(200,430,150,30);
		submit.addActionListener(this);
		add(submit);
		
                back=new JButton("Back");
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setBounds(30,430,150,30);
		back.addActionListener(this);
		add(back);
                
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
		Image i2=i1.getImage().getScaledInstance(450,450,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(380,60,450,370);
		add(image);
		
		getContentPane().setBackground(Color.WHITE);
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
                if(e.getSource()==submit){
		String name=tfname.getText();
		String age=tfage.getText();
		String salary=tfsalary.getText();
		String phone=tfphone.getText();
		String email=tfemail.getText();
		String aadhar=tfaadhar.getText();
		
		String gender=null;
		
		if(name.equals("")) {
			JOptionPane.showMessageDialog(null, "Name Should not be empty");
		}
		
		if(rbmale.isSelected()) {
			gender="Male";
		}else if(rbfemale.isSelected()) {
			gender="Female";
		}
		
		String job=(String)cbjob.getSelectedItem();
		
		try {
			Conn con=new Conn();
			String query="insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"','"+aadhar+"')";
			con.s.executeUpdate(query);
			JOptionPane.showMessageDialog(null, "Employee added Successfully");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
                }
                else{
                    setVisible(false);
                    new Dashboard();
                }
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
