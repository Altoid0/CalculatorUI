package view;

//imports

//import java.awt.*;

import com.ibm.dtfj.java.JavaLocation;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class SolverUI extends JFrame {
    //var setup
    private JPanel mainPanel, subPanel1, subPanel2, subPanel3;
    private JTextField celsiusTextField;
    private JLabel celsiusLabel;
    private JButton convertButtonFar;
    private JLabel fahrenheitLabel;
    private double celsiusInput;
    private JButton solver;
    private JButton Kinematic1;
    private JButton Kinematic2;
    private JButton Kinematic3;
    private JButton Kinematic4;


    //runs frame
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                SolverUI frame = new SolverUI();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    //components of application
    // Dhruv K
    public SolverUI() {
        //Setting up the Main Panel
        setTitle("Physics Solver");
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1,3));

        //Setting up Subpanels
        subPanel1 = new JPanel();
        subPanel1.add(new Label("Select Which Variable to Solve for", SwingConstants.TOP)).setForeground(Color.WHITE);
        subPanel1.setBackground(new Color(21, 52, 80));

        subPanel2 = new JPanel();
        subPanel2.add(new Label("Enter the Values of the Known Variables", SwingConstants.CENTER)).setForeground(Color.WHITE);
        subPanel2.setBackground(new Color(68, 114, 148));

        subPanel3 = new JPanel();
        subPanel3.add(new Label("Here is the Calculated Value", SwingConstants.CENTER)).setForeground(Color.WHITE);
        subPanel3.setBackground(new Color(143, 188, 219));

        //Adding subpanels to main panel
        mainPanel.add(subPanel1);
        mainPanel.add(subPanel2);
        mainPanel.add(subPanel3);

        add(mainPanel);
        setSize(700, 500);

// Adding Radio Buttons for Panel 1
        //Adding velocity initial Radio Button
        JRadioButton vi = new JRadioButton("Initial Velocity");
        vi.setPreferredSize(new Dimension(200,50));
        vi.setBackground(new Color(21, 52,80));
        vi.setFont(new Font("Impact", Font.PLAIN, 20));
        vi.setForeground(Color.white);
        subPanel1.add(vi);

        //Adding velocity final Radio Button
        JRadioButton vf = new JRadioButton("Final Velocity");
        vf.setPreferredSize(new Dimension(200,50));
        vf.setBackground(new Color(21, 52,80));
        vf.setFont(new Font("Impact", Font.PLAIN, 20));
        vf.setForeground(Color.white);
        subPanel1.add(vf);

        //Adding acceleration Radio Button
        JRadioButton acc = new JRadioButton("Acceleration");
        acc.setPreferredSize(new Dimension(200,50));
        acc.setBackground(new Color(21, 52,80));
        acc.setFont(new Font("Impact", Font.PLAIN, 20));
        acc.setForeground(Color.white);
        subPanel1.add(acc);

        //Adding time Radio Button
        JRadioButton t = new JRadioButton("Time");
        t.setPreferredSize(new Dimension(200,50));
        t.setBackground(new Color(21, 52,80));
        t.setFont(new Font("Impact", Font.PLAIN, 20));
        t.setForeground(Color.white);
        subPanel1.add(t);

        //Adding Distance Radio Button
        JRadioButton dist = new JRadioButton("Distance");
        dist.setPreferredSize(new Dimension(200,50));
        dist.setBackground(new Color(21, 52,80));
        dist.setFont(new Font("Impact", Font.PLAIN, 20));
        dist.setForeground(Color.white);
        subPanel1.add(dist);


// Adding text values to Panel 2

        // Initial Velocity
        JLabel vilbl = new JLabel("Initial Velocity");
        vilbl.setFont(new Font("Impact", Font.PLAIN, 20));
        vilbl.setHorizontalAlignment(SwingConstants.RIGHT);
        vilbl.setForeground(Color.WHITE);
        subPanel2.add(vilbl);

        JTextField vitxt = new JTextField("");
        vitxt.setPreferredSize(new Dimension(100, 30));
        vitxt.setBackground(new Color(68, 114, 148));
        vitxt.setFont(new Font("Impact", Font.PLAIN, 20));
        vitxt.setForeground(Color.white);
        vitxt.setHorizontalAlignment(SwingConstants.LEFT);
        subPanel2.add(vitxt);



        // Final Velocity
        JTextField vftxt = new JTextField("");
        vftxt.setPreferredSize(new Dimension(100, 30));
        vftxt.setBackground(new Color(68, 114, 148));
        vftxt.setFont(new Font("Impact", Font.PLAIN, 20));
        vftxt.setForeground(Color.white);
        vftxt.setHorizontalAlignment(SwingConstants.RIGHT);
        subPanel2.add(vftxt);

        JLabel vflbl = new JLabel("Final Velocity");
        vflbl.setFont(new Font("Impact", Font.PLAIN, 20));
        vflbl.setHorizontalAlignment(SwingConstants.LEFT);
        vflbl.setForeground(Color.WHITE);
        subPanel2.add(vflbl);





        // Acceleration
        JTextField acctxt = new JTextField("");
        acctxt.setPreferredSize(new Dimension(100, 30));
        acctxt.setBackground(new Color(68, 114, 148));
        acctxt.setFont(new Font("Impact", Font.PLAIN, 20));
        acctxt.setForeground(Color.white);
        acctxt.setHorizontalAlignment(SwingConstants.RIGHT);
        subPanel2.add(acctxt);

        JLabel acclbl = new JLabel("Acceleration");
        acclbl.setFont(new Font("Impact", Font.PLAIN, 20));
        acclbl.setHorizontalAlignment(SwingConstants.LEFT);
        acclbl.setForeground(Color.WHITE);
        subPanel2.add(acclbl);





        // Time
        JTextField ttxt = new JTextField("");
        ttxt.setPreferredSize(new Dimension(100, 30));
        ttxt.setBackground(new Color(68, 114, 148));
        ttxt.setFont(new Font("Impact", Font.PLAIN, 20));
        ttxt.setForeground(Color.white);
        ttxt.setHorizontalAlignment(SwingConstants.RIGHT);
        subPanel2.add(ttxt);

        JLabel tlbl = new JLabel("Time");
        tlbl.setFont(new Font("Impact", Font.PLAIN, 20));
        tlbl.setHorizontalAlignment(SwingConstants.LEFT);
        tlbl.setForeground(Color.WHITE);
        subPanel2.add(tlbl);





        // Distance
        JTextField disttxt = new JTextField("");
        disttxt.setPreferredSize(new Dimension(100, 30));
        disttxt.setBackground(new Color(68, 114, 148));
        disttxt.setFont(new Font("Impact", Font.PLAIN, 20));
        disttxt.setForeground(Color.white);
        disttxt.setHorizontalAlignment(SwingConstants.RIGHT);
        subPanel2.add(disttxt);

        JLabel distlbl = new JLabel("Distance");
        distlbl.setFont(new Font("Impact", Font.PLAIN, 20));
        distlbl.setHorizontalAlignment(SwingConstants.LEFT);
        distlbl.setForeground(Color.WHITE);
        subPanel2.add(distlbl);




//        //properties for output label
//        // Dhruv K
//        JLabel output = new JLabel("Answer");
//        output.setFont(new Font("Impact", Font.PLAIN, 60));
//        output.setHorizontalAlignment(SwingConstants.CENTER);
//        output.setBounds(25, 300, 377, 67);
//        output.setForeground(Color.WHITE);
//        getContentPane().add(output);

        /* celsiusTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                celsiusTextField.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                celsiusTextField.setFont(new Font("Impact", Font.PLAIN, 30));
                celsiusTextField.setText("Enter your email here:");
            }
        }); */

        //properties for instructions label
//        // Dhruv K
//        JLabel instrux = new JLabel("Select a Kinematic formula to solve with");
//        instrux.setFont(new Font("Impact", Font.PLAIN, 18));
//        instrux.setHorizontalAlignment(SwingConstants.CENTER);
//        instrux.setForeground(Color.WHITE);
//        instrux.setBounds(18, 100, 377, 67);
//        getContentPane().add(instrux);
//
//        //creating button
//        JButton convertButtonFar = new JButton("Solve");
//
//        //color change once button is clicked
//        // Dhruv K
//        convertButtonFar.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//                convertButtonFar.setBackground(Color.PINK);
//            }
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                convertButtonFar.setBackground(new Color(60, 174, 163));
//            }
//        });
//
//        //properties for button
//        // Dhruv K
//        convertButtonFar.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
//        convertButtonFar.setFont(new Font("Impact", Font.PLAIN, 48));
//        convertButtonFar.setOpaque(true);
//        convertButtonFar.setForeground(Color.WHITE);
//        convertButtonFar.setBackground(new Color(60, 174, 163));
//
//        //logic code once button is clicked
//        // Dhruv K
//        convertButtonFar.addActionListener(e -> {
//            //if else statement to see if text field is blank (Gautam added)
//            if (celsiusTextField.getText().equals("")) {
//                output.setText("Result");
//            } else {
//                //business logic code to convert
//                celsiusInput = Double.parseDouble((celsiusTextField.getText()));
//                double fOutput = celsiusInput*(9/5)+32;
//                String faOutput = String.valueOf(fOutput);
//
//                output.setText(faOutput);
//            }
//
//        });
////        //setting bounds for button
//        convertButtonFar.setBounds(25, 185, 175, 67);
//        getContentPane().add(convertButtonFar);
    }
}