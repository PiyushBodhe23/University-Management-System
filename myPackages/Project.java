package myPackages;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener {

    Project() {
        setSize(1550, 865);

        // Background image
        ImageIcon i1 = new ImageIcon("icons/third.jpg");
        Image i2 = i1.getImage().getScaledInstance(1500, 765, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JMenuBar mb = new JMenuBar();

        // ========== NEW INFORMATION ==========
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.blue);

        JMenuItem FacultyInfo = new JMenuItem("New Faculty Information");
        FacultyInfo.setBackground(Color.white);
        FacultyInfo.addActionListener(this);
        newInformation.add(FacultyInfo);

        JMenuItem StudentInfo = new JMenuItem("New Student Information");
        StudentInfo.setBackground(Color.white);
        StudentInfo.addActionListener(this);
        newInformation.add(StudentInfo);
        mb.add(newInformation);

        // ========== DETAILS ==========
        JMenu Details = new JMenu("Details");
        Details.setForeground(Color.blue);

        JMenuItem FacultyDetails = new JMenuItem("Faculty Details");
        FacultyDetails.setBackground(Color.white);
        FacultyDetails.addActionListener(this);
        Details.add(FacultyDetails);

        JMenuItem StudentDetails = new JMenuItem("Student Details");
        StudentDetails.setBackground(Color.white);
        StudentDetails.addActionListener(this);
        Details.add(StudentDetails);
        mb.add(Details);

        // ========== LEAVE ==========
        JMenu Leave = new JMenu("Apply For Leave");
        Leave.setForeground(Color.blue);

        JMenuItem FacultyLeave = new JMenuItem("Faculty Leave");
        FacultyLeave.setBackground(Color.white);
        FacultyLeave.addActionListener(this);
        Leave.add(FacultyLeave);

        JMenuItem StudentLeave = new JMenuItem("Student Leave");
        StudentLeave.setBackground(Color.white);
        StudentLeave.addActionListener(this);
        Leave.add(StudentLeave);
        mb.add(Leave);

        // ========== LEAVE DETAILS ==========
        JMenu LeaveDetails = new JMenu("Leave Details");
        LeaveDetails.setForeground(Color.blue);

        JMenuItem FacultyLeaveDetails = new JMenuItem("Faculty Leave Details");
        FacultyLeaveDetails.setBackground(Color.white);
        FacultyLeaveDetails.addActionListener(this);
        LeaveDetails.add(FacultyLeaveDetails);

        JMenuItem StudentLeaveDetails = new JMenuItem("Student Leave Details");
        StudentLeaveDetails.setBackground(Color.white);
        StudentLeaveDetails.addActionListener(this);
        LeaveDetails.add(StudentLeaveDetails);
        mb.add(LeaveDetails);

        // ========== EXAMINATION ==========
        JMenu Exam = new JMenu("Examination");
        Exam.setForeground(Color.blue);

        JMenuItem Examination = new JMenuItem("Examination Results");
        Examination.setBackground(Color.white);
        Examination.addActionListener(this);
        Exam.add(Examination);

        JMenuItem EnterMarks = new JMenuItem("Enter Marks");
        EnterMarks.setBackground(Color.white);
        EnterMarks.addActionListener(this);
        Exam.add(EnterMarks);
        mb.add(Exam);

        // ========== UPDATE INFORMATION ==========
        JMenu UpdateInfo = new JMenu("Update Information");
        UpdateInfo.setForeground(Color.blue);

        JMenuItem UpdateFaculty = new JMenuItem("Update Faculty Details");
        UpdateFaculty.setBackground(Color.white);
        UpdateFaculty.addActionListener(this);
        UpdateInfo.add(UpdateFaculty);

        JMenuItem UpdateStudent = new JMenuItem("Update Student Details");
        UpdateStudent.setBackground(Color.white);
        UpdateStudent.addActionListener(this);
        UpdateInfo.add(UpdateStudent);
        mb.add(UpdateInfo);

        // ========== FEES ==========
        JMenu Fees = new JMenu("Fees Details");
        Fees.setForeground(Color.blue);

        JMenuItem FeeStructure = new JMenuItem("Fee Structure");
        FeeStructure.setBackground(Color.white);
        FeeStructure.addActionListener(this);
        Fees.add(FeeStructure);

        JMenuItem StudentFeeForm = new JMenuItem("Student Fee Form");
        StudentFeeForm.setBackground(Color.white);
        StudentFeeForm.addActionListener(this);
        Fees.add(StudentFeeForm);
        mb.add(Fees);

        // ========== UTILITY ==========
        JMenu Utility = new JMenu("Utility");
        Utility.setForeground(Color.blue);

        JMenuItem Notepad = new JMenuItem("Notepad");
        Notepad.setBackground(Color.white);
        Notepad.addActionListener(this);
        Utility.add(Notepad);

        JMenuItem Calculator = new JMenuItem("Calculator");
        Calculator.setBackground(Color.white);
        Calculator.addActionListener(this);
        Utility.add(Calculator);
        mb.add(Utility);

        // ========== EXIT ==========
        JMenu Exit = new JMenu("Exit");
        Exit.setForeground(Color.red);

        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.white);
        ex.addActionListener(this);
        Exit.add(ex);
        mb.add(Exit);

        setJMenuBar(mb);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        try {
            switch (msg) {
                case "Exit":
                    setVisible(false);
                    break;

                case "Calculator":
                    Runtime.getRuntime().exec("calc.exe");
                    break;

                case "Notepad":
                    Runtime.getRuntime().exec("notepad.exe");
                    break;

                case "New Student Information":
                    new addstudent();
                    break;

                case "New Faculty Information":
                    new addTeacher();
                    break;

                case "Student Details":
                    new StudentDetail();
                    break;

                case "Faculty Details":
                    new TeacherDetails();
                    break;

                case "Faculty Leave":
                    new TeacherLeave();
                    break;

                case "Student Leave":
                    new StudentLeave();
                    break;

                case "Faculty Leave Details":
                    new TeacherLeaveDetails();
                    break;

                case "Student Leave Details":
                    new StudentLeaveDetails();
                    break;

                case "Update Faculty Details":
                    new UpdateTeacher();
                    break;

                case "Update Student Details":
                    new UpdateStudent();
                    break;

                case "Enter Marks":
                    new EnterMarks();
                    break;

                case "Examination Results":
                    new ExaminationDetails();
                    break;

                case "Fee Structure":
                    new FeeStructure();
                    break;

                case "Student Fee Form":
                    new StudentFeeForm();
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "No action defined for: " + msg);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Project();
    }
}
