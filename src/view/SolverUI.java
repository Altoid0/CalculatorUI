package view;

//imports

//import java.awt.*;

//import com.ibm.dtfj.java.JavaLocation;
import control.PhysicsSolv;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.event.*;

import model.SolverModel;
import control.PhysicsSolv;


public class SolverUI extends JFrame {
    //var setup
    private JPanel mainPanel, subPanel1, subPanel2, subPanel3;
    private JLabel answer;
    private JRadioButton vibtn;
    private JRadioButton vfbtn;
    private JRadioButton accbtn;
    private PhysicsSolv.KINOPERATOR kinematicvar;
    private String kinematicvarstr;
    private double vi;
    private double vf;
    private double acc;
    private double time;
    private double dist;
    private String missingparam;
    private String solveranswer;
    private String testString;
    private String answerString;



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

    private void saveValueofSolveVar(PhysicsSolv.KINOPERATOR kinop ) { //method to store which variable is being solved for
        kinematicvar = kinop; }

    private void calculateAnswer() {
        SolverModel solvanswer = new SolverModel(vi, vf, acc, time, dist, kinematicvar, missingparam );
        solveranswer = String.valueOf(solvanswer.kinematicanswermodel);
        testString = String.valueOf(solvanswer);
    }

    //components of application
    // Dhruv K
    public SolverUI() {
        JLabel soln = new JLabel(kinematicvarstr);
        soln.setPreferredSize(new Dimension(170, 30));
        soln.setFont(new Font("Impact", Font.PLAIN, 20));
        soln.setHorizontalAlignment(SwingConstants.CENTER);
        soln.setForeground(Color.WHITE);

        JLabel answer = new JLabel();
        answer.setPreferredSize(new Dimension(170, 30));
        answer.setFont(new Font("Impact", Font.PLAIN, 20));
        answer.setHorizontalAlignment(SwingConstants.CENTER);
        answer.setForeground(Color.WHITE);

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
        setSize(1000, 500);

// Adding Radio Buttons for Panel 1
        //Adding velocity initial Radio Button
        JRadioButton vibtn = new JRadioButton("Initial Velocity");
        vibtn.setPreferredSize(new Dimension(200,50));
        vibtn.setBackground(new Color(21, 52,80));
        vibtn.setFont(new Font("Impact", Font.PLAIN, 20));
        vibtn.setForeground(Color.white);
        subPanel1.add(vibtn);

        vibtn.addActionListener(e -> {
            saveValueofSolveVar(PhysicsSolv.KINOPERATOR.VI);
            kinematicvarstr = "Initial Velocity";
        });

        //Adding velocity final Radio Button
        JRadioButton vfbtn = new JRadioButton("Final Velocity");
        vfbtn.setPreferredSize(new Dimension(200,50));
        vfbtn.setBackground(new Color(21, 52,80));
        vfbtn.setFont(new Font("Impact", Font.PLAIN, 20));
        vfbtn.setForeground(Color.white);
        subPanel1.add(vfbtn);

        vfbtn.addActionListener(e -> {
            saveValueofSolveVar(PhysicsSolv.KINOPERATOR.VF);
            kinematicvarstr = "Final Velocity";
        });

        //Adding acceleration Radio Button
        JRadioButton accbtn = new JRadioButton("Acceleration");
        accbtn.setPreferredSize(new Dimension(200,50));
        accbtn.setBackground(new Color(21, 52,80));
        accbtn.setFont(new Font("Impact", Font.PLAIN, 20));
        accbtn.setForeground(Color.white);
        subPanel1.add(accbtn);

        accbtn.addActionListener(e -> {
            saveValueofSolveVar(PhysicsSolv.KINOPERATOR.ACC);
            kinematicvarstr = "Acceleration";
        });

        //Adding time Radio Button
        JRadioButton tbtn = new JRadioButton("Time");
        tbtn.setPreferredSize(new Dimension(200,50));
        tbtn.setBackground(new Color(21, 52,80));
        tbtn.setFont(new Font("Impact", Font.PLAIN, 20));
        tbtn.setForeground(Color.white);
        subPanel1.add(tbtn);

        tbtn.addActionListener(e -> {
            saveValueofSolveVar(PhysicsSolv.KINOPERATOR.TIME);
            kinematicvarstr = "Time";
        });

        //Adding Distance Radio Button
        JRadioButton distbtn = new JRadioButton("Distance");
        distbtn.setPreferredSize(new Dimension(200,50));
        distbtn.setBackground(new Color(21, 52,80));
        distbtn.setFont(new Font("Impact", Font.PLAIN, 20));
        distbtn.setForeground(Color.white);
        subPanel1.add(distbtn);

        distbtn.addActionListener(e -> {
            saveValueofSolveVar(PhysicsSolv.KINOPERATOR.DIST);
            kinematicvarstr = "Distance";
        });

        // Initializing Button Group
        ButtonGroup variables = new ButtonGroup();
        variables.add(vibtn);
        variables.add(vfbtn);
        variables.add(accbtn);
        variables.add(tbtn);
        variables.add(distbtn);

// Adding text values to Panel 2

        // Initial Velocity
        JLabel vilbl = new JLabel("Initial Velocity");
        vilbl.setFont(new Font("Impact", Font.PLAIN, 20));
        vilbl.setHorizontalAlignment(SwingConstants.LEFT);
        vilbl.setForeground(Color.WHITE);
        subPanel2.add(vilbl);

        JTextField vitxt = new JTextField();
        vitxt.setPreferredSize(new Dimension(170, 30));
        vitxt.setBackground(new Color(68, 114, 148));
        vitxt.setFont(new Font("Impact", Font.PLAIN, 20));
        vitxt.setForeground(Color.white);
        vitxt.setHorizontalAlignment(SwingConstants.RIGHT);
        subPanel2.add(vitxt);


        vibtn.addActionListener(e -> {
            vitxt.setEnabled(false);
            vitxt.setBackground(new Color(110, 110, 149));
        });



        // Final Velocity
        JLabel vflbl = new JLabel("Final Velocity");
        vflbl.setFont(new Font("Impact", Font.PLAIN, 20));
        vflbl.setHorizontalAlignment(SwingConstants.LEFT);
        vflbl.setForeground(Color.WHITE);
        subPanel2.add(vflbl);

        JTextField vftxt = new JTextField("");
        vftxt.setPreferredSize(new Dimension(170, 30));
        vftxt.setBackground(new Color(68, 114, 148));
        vftxt.setFont(new Font("Impact", Font.PLAIN, 20));
        vftxt.setForeground(Color.white);
        vftxt.setHorizontalAlignment(SwingConstants.RIGHT);
        subPanel2.add(vftxt);


        vfbtn.addActionListener(e -> {
            vftxt.setEnabled(false);
            vftxt.setBackground(new Color(110, 110, 149));
        });




        // Acceleration
        JLabel acclbl = new JLabel("Acceleration");
        acclbl.setFont(new Font("Impact", Font.PLAIN, 20));
        acclbl.setHorizontalAlignment(SwingConstants.LEFT);
        acclbl.setForeground(Color.WHITE);
        subPanel2.add(acclbl);

        JTextField acctxt = new JTextField("");
        acctxt.setPreferredSize(new Dimension(170, 30));
        acctxt.setBackground(new Color(68, 114, 148));
        acctxt.setFont(new Font("Impact", Font.PLAIN, 20));
        acctxt.setForeground(Color.white);
        acctxt.setHorizontalAlignment(SwingConstants.RIGHT);
        subPanel2.add(acctxt);


        accbtn.addActionListener(e -> {
            acctxt.setEnabled(false);
            acctxt.setBackground(new Color(110, 110, 149));
        });




        // Time
        JLabel tlbl = new JLabel("Time          ");
        tlbl.setFont(new Font("Impact", Font.PLAIN, 20));
        tlbl.setHorizontalAlignment(SwingConstants.LEFT);
        tlbl.setForeground(Color.WHITE);
        subPanel2.add(tlbl);

        JTextField ttxt = new JTextField("");
        ttxt.setPreferredSize(new Dimension(170, 30));
        ttxt.setBackground(new Color(68, 114, 148));
        ttxt.setFont(new Font("Impact", Font.PLAIN, 20));
        ttxt.setForeground(Color.white);
        ttxt.setHorizontalAlignment(SwingConstants.RIGHT);
        subPanel2.add(ttxt);

        tbtn.addActionListener(e -> {
            ttxt.setEnabled(false);
            ttxt.setBackground(new Color(110, 110, 149));
        });



        JLabel distlbl = new JLabel("Distance     ");
        distlbl.setFont(new Font("Impact", Font.PLAIN, 20));
        distlbl.setHorizontalAlignment(SwingConstants.LEFT);
        distlbl.setForeground(Color.WHITE);
        subPanel2.add(distlbl);

        // Distance text field
        JTextField disttxt = new JTextField("");
        disttxt.setPreferredSize(new Dimension(170, 30));
        disttxt.setBackground(new Color(68, 114, 148));
        disttxt.setFont(new Font("Impact", Font.PLAIN, 20));
        disttxt.setForeground(Color.white);
        disttxt.setHorizontalAlignment(SwingConstants.RIGHT);
        subPanel2.add(disttxt);


        distbtn.addActionListener(e -> {
            disttxt.setEnabled(false);
            disttxt.setBackground(new Color(110, 110, 149));
        });



        // Adding Solution Button to solve for the value
        JButton solve = new JButton("Solve");
        solve.setPreferredSize(new Dimension(170, 30));
        solve.setBackground(new Color(68, 114, 148));
        solve.setFont(new Font("Impact", Font.PLAIN, 20));
        solve.setForeground(Color.white);
        solve.addActionListener(e -> {
            if (vitxt.getText().isEmpty()) {
                missingparam = "Initial Velocity";
                vi = 0.0;
            }
            else {
                vi = Double.parseDouble(vitxt.getText());
            }
            if (vftxt.getText().isEmpty()) {
                missingparam = "Final Velocity";
                vf = 0.0;
            }
            else {
                vf = Double.parseDouble(vftxt.getText());
            }
            if (acctxt.getText().isEmpty()) {
                missingparam = "Acceleration";
                acc = 0.0;
            }
            else {
                acc = Double.parseDouble(acctxt.getText());
            }
            if (ttxt.getText().isEmpty()) {
                missingparam = "Time";
                time = 0.0;
            }
            else {
                time = Double.parseDouble(ttxt.getText());
            }
            if (disttxt.getText().isEmpty()) {
                missingparam = "Displacement";
                dist = 0.0;
            }
            else {
                dist = Double.parseDouble(disttxt.getText());
            }

            SolverModel solved = new SolverModel(vi, vf, acc, time, dist, kinematicvar, missingparam);
            String answerString = String.valueOf(solved.kinematicanswermodel);
            answer.setText(answerString);

        });
        subPanel2.add(solve);




        // Adding Button to Reset the buttons and text fields
        JButton Reset = new JButton("Reset");
        Reset.setPreferredSize(new Dimension(170, 30));
        Reset.setBackground(new Color(68, 114, 148));
        Reset.setFont(new Font("Impact", Font.PLAIN, 20));
        Reset.setForeground(Color.white);
        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                variables.clearSelection();
                vitxt.setText("");
                vitxt.setEnabled(true);
                vitxt.setBackground(new Color(68, 114, 148));
                vftxt.setText("");
                vftxt.setEnabled(true);
                vftxt.setBackground(new Color(68, 114, 148));
                acctxt.setText("");
                acctxt.setEnabled(true);
                acctxt.setBackground(new Color(68, 114, 148));
                disttxt.setText("");
                disttxt.setEnabled(true);
                disttxt.setBackground(new Color(68, 114, 148));
                ttxt.setText("");
                ttxt.setEnabled(true);
                ttxt.setBackground(new Color(68, 114, 148));
            }
        });
        subPanel2.add(Reset);
        subPanel3.add(soln);
        subPanel3.add(answer);





// Adding Solution Text field for Panel 3


    }
}