package myPackages;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//because awt.* only add class not sub classes like event is the cunclass of awt package
import java.sql.*;
import javax.swing.*;

public class login extends JFrame implements ActionListener{

    JButton Login, Cancel;
    JTextField TFusername;
    JPasswordField TFpassword;
    login(){

        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel LBLusername =new JLabel("Username");
        LBLusername.setBounds(40, 20, 100, 30);
        add(LBLusername);

        TFusername = new JTextField();
        TFusername.setBounds(150, 20, 150, 30);
        add(TFusername);

        JLabel LBLpassword =new JLabel("Password");
        LBLpassword.setBounds(40, 70, 100, 30);
        add(LBLpassword);

        TFpassword = new JPasswordField();
        TFpassword.setBounds(150, 70, 150, 30);
        add(TFpassword);


        Login =new JButton("Login");
        Login.setBounds(40, 140, 120, 30);
        Login.setBackground(Color.black);
        Login.setForeground(Color.white);
        Login.addActionListener(this);
        Login.setFont(new Font("Times New Roman",Font.BOLD,15));
        add(Login);

        Cancel =new JButton("Cancel");
        Cancel.setBounds(180, 140, 120, 30);
        Cancel.setBackground(Color.black);
        Cancel.setForeground(Color.white);
        Cancel.addActionListener(this);
        Cancel.setFont(new Font("Times New Roman",Font.BOLD,15));
        add(Cancel);

        ImageIcon i1 = new ImageIcon("icons/second.jpg");
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);


        setSize(600,300);
        setVisible(true);
        setLocation(500,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()== Login){

            String username = TFusername.getText();
            String Password = TFpassword.getText();

            String query = "Select * from Login where username='" + username +  "'and password = '"+ Password +"'";

            try {

                conns c= new conns();
                ResultSet rs= c.s.executeQuery(query);

                if(rs.next()){
                    setVisible(false);
                    new Project();

                }else{

                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    setVisible(false);
                    new login();

                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(ae.getSource()== Cancel){
            setVisible(false);
        }

    }
    public static void main(String[] args) {
        new login();
    }
}