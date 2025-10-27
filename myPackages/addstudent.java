package myPackages;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class addstudent extends JFrame implements ActionListener{

    JTextField tfname,tffname,tfaddress,tfphoneno,tfemail,tfclassX,tfclassXii,tfAadhaar,tfBranch;
    JLabel labelrollno;
    JDateChooser dcdob;
    JComboBox cbCourse,cbBranch;
    JButton Submit, Reset;


    Random ran = new Random();
    long first4 = Math.abs(ran.nextLong() %9000L + 1000L);

    addstudent(){
        setSize(900,700);
        setLocation(350,50);

        setLayout(null);

        JLabel heading =  new JLabel("New Student Information");
        heading.setBounds(310,30,500,50);
        heading.setFont(new Font("Times New Roman",Font.BOLD,25));
        add(heading);

    // Name
        JLabel nameLabel =  new JLabel("Name");
        nameLabel.setBounds(50,150,100,30);
        nameLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(nameLabel);

        tfname = new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);

    // father's name
        JLabel fnameLabel =  new JLabel("Father's Name");
        fnameLabel.setBounds(400,150,200,30);
        fnameLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(fnameLabel);

        tffname = new JTextField();
        tffname.setBounds(600,150,150,30);
        add(tffname);

    //Roll NO

        JLabel lblRollno =  new JLabel("Roll No");
        lblRollno.setBounds(50,200,200,30);
        lblRollno.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(lblRollno);

        labelrollno = new JLabel("1533"+ first4);
        labelrollno.setBounds(200,200,200,30);
        labelrollno.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(labelrollno);

    //date of birth
        JLabel dobLabel =  new JLabel("Date of Birth");
        dobLabel.setBounds(400,200,200,30);
        dobLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(dobLabel);

        dcdob = new JDateChooser();
        dcdob.setBounds(600,200,150,30);
        add(dcdob);

    
    //Address
        JLabel addressLabel =  new JLabel("Address");
        addressLabel.setBounds(50,250,200,30);
        addressLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(addressLabel);

        tfaddress = new JTextField();
        tfaddress.setBounds(200,250,550,30);
        add(tfaddress);

    //Phone Number
        JLabel phonenoLabel =  new JLabel("Phone No");
        phonenoLabel.setBounds(50,300,200,30);
        phonenoLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(phonenoLabel);

        tfphoneno = new JTextField();
        tfphoneno.setBounds(200,300,150,30);
        add(tfphoneno);

    //Email Id 
        JLabel emailLabel =  new JLabel("Email Id");
        emailLabel.setBounds(50,350,200,30);
        emailLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(emailLabel);

        tfemail = new JTextField();
        tfemail.setBounds(200,350,150,30);
        add(tfemail);

    //CLASS X Percentage 
        JLabel classXLabel =  new JLabel("Class X Percentage");
        classXLabel.setBounds(400,300,200,30);
        classXLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(classXLabel);

        tfclassX = new JTextField();
        tfclassX.setBounds(600,300,150,30);
        add(tfclassX);

    //CLASS XII Percentage 
        JLabel classXiiLabel =  new JLabel("Class XII Percentage");
        classXiiLabel.setBounds(400,350,200,30);
        classXiiLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(classXiiLabel);

        tfclassXii = new JTextField();
        tfclassXii.setBounds(600,350,150,30);
        add(tfclassXii);

    //Aadhaar No
        JLabel aadhaarLabel =  new JLabel("Aadhaar No");
        aadhaarLabel.setBounds(400,400,200,30);
        aadhaarLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(aadhaarLabel);

        tfAadhaar = new JTextField();
        tfAadhaar.setBounds(600,400,150,30);
        add(tfAadhaar);

    //course

        JLabel courseLabel =  new JLabel("Course");
        courseLabel.setBounds(50,400,200,30);
        courseLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(courseLabel);

        String course[]= {"B.Tech","BBA","MBA","BCA","MCA","BSc","MSc","BA","MA"};
        cbCourse = new JComboBox(course);
        cbCourse.setBounds(200,400,150,30);
        cbCourse.setBackground(Color.white);
        add(cbCourse);

    //Branch

        JLabel branchLabel =  new JLabel("Branch");
        branchLabel.setBounds(50,450,200,30);
        branchLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(branchLabel);

        String branch[]= {"CSE","ECE","ME","CE","IT"};
        cbBranch = new JComboBox(branch);
        cbBranch.setBounds(200,450,150,30);
        cbBranch.setBackground(Color.white);
        add(cbBranch);

    //Submit Button
        Submit =new JButton("Submit");
        Submit.setBounds(250, 550, 120, 30);
        Submit.setBackground(Color.black);
        Submit.setForeground(Color.white);
        Submit.addActionListener(this);
        Submit.setFont(new Font("Times New Roman",Font.BOLD,15));
        add(Submit);

    // Reset Button
        Reset =new JButton("Reset");
        Reset.setBounds(450, 550, 120, 30);
        Reset.setBackground(Color.black);
        Reset.setForeground(Color.white);
        Reset.addActionListener(this);
        Reset.setFont(new Font("Times New Roman",Font.BOLD,15));
        add(Reset);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Submit){
            String name = tfname.getText();
            String fname = tffname.getText();
            String rollno = labelrollno.getText();
            String dob = ((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phoneno = tfphoneno.getText();
            String email = tfemail.getText();
            String classX = tfclassX.getText();
            String classXii = tfclassXii.getText();
            String Aadhaar = tfAadhaar.getText();
            String course = (String)cbCourse.getSelectedItem();
            String branch = (String)cbBranch.getSelectedItem();

            try{

                String query = "insert into student values('"+name+"','"+fname+"','"+rollno+"','"+dob+"','"+address+"','"+phoneno+"','"+email+"','"+classX+"','"+classXii+"','"+Aadhaar+"','"+course+"','"+branch+"')";

                conns con = new conns();
                con.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Student Details Added Successfully");
                setVisible(false);
                new addstudent();

            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {

        new addstudent();
        
    }
    
}
