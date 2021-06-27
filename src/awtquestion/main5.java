package awtquestion;

import java.awt.*;
import java.awt.event.*;
public class main5 extends Frame implements ActionListener {
    Button btnInfo, btnCGPA;
    main5() {
        super("Student Details");
        btnInfo = new Button("A");
        btnInfo.setBounds(25, 125, 450, 100);
        btnInfo.addActionListener(this);
        this.add(btnInfo);
        btnCGPA = new Button("B");
        btnCGPA.setBounds(25, 300, 450, 100);
        btnCGPA.addActionListener(this);
        this.add(btnCGPA);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        new main5();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnInfo) {
            new Information(
                    "Sagar Rathore",
                    "BSc (Hons) Computer Science",
                    "5786",
                    "Keshav Mahavidalya"
            );
        } else if (e.getSource() == btnCGPA) {
            new CGPA("9.73");
        }
    }
}