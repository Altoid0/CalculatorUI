package view;
//imports

//import java.awt.*;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;

public class BeatMakerUI extends JFrame{
    private JButton kick1Button;
    private JButton kick2Button;
    private JButton kick3Button;
    private JButton kick4Button;
    private JButton kick5Button;
    private JButton kick6Button;
    private JButton kick7Button;
    private JButton kick8Button;
    private JButton kick9Button;
    private JButton kick10Button;
    private JButton kick11Button;
    private JButton kick12Button;
    private JButton kick13Button;
    private JButton kick14Button;
    private JButton kick15Button;
    private JButton kick16Button;
    private JButton kick17Button;
    private JButton kick18Button;
    private JButton kick19Button;
    private JButton kick20Button;
    private JButton kick21Button;
    private JButton kick22Button;
    private JButton kick23Button;
    private JButton kick24Button;
    private JButton kick25Button;
    private JButton kick26Button;
    private JButton kick27Button;
    private JButton kick28Button;
    private JButton kick29Button;
    private JButton kick30Button;
    private JButton kick31Button;
    private JButton kick32Button;

    private JButton hihat1Button;
    private JButton hihat2Button;
    private JButton hihat3Button;
    private JButton hihat4Button;
    private JButton hihat5Button;
    private JButton hihat6Button;
    private JButton hihat7Button;
    private JButton hihat8Button;
    private JButton hihat9Button;
    private JButton hihat10Button;
    private JButton hihat11Button;
    private JButton hihat12Button;
    private JButton hihat13Button;
    private JButton hihat14Button;
    private JButton hihat15Button;
    private JButton hihat16Button;
    private JButton hihat17Button;
    private JButton hihat18Button;
    private JButton hihat19Button;
    private JButton hihat20Button;
    private JButton hihat21Button;
    private JButton hihat22Button;
    private JButton hihat23Button;
    private JButton hihat24Button;
    private JButton hihat25Button;
    private JButton hihat26Button;
    private JButton hihat27Button;
    private JButton hihat28Button;
    private JButton hihat29Button;
    private JButton hihat30Button;
    private JButton hihat31Button;
    private JButton hihat32Button;

    private JButton clap1Button;
    private JButton clap2Button;
    private JButton clap3Button;
    private JButton clap4Button;
    private JButton clap5Button;
    private JButton clap6Button;
    private JButton clap7Button;
    private JButton clap8Button;
    private JButton clap9Button;
    private JButton clap10Button;
    private JButton clap11Button;
    private JButton clap12Button;
    private JButton clap13Button;
    private JButton clap14Button;
    private JButton clap15Button;
    private JButton clap16Button;
    private JButton clap17Button;
    private JButton clap18Button;
    private JButton clap19Button;
    private JButton clap20Button;
    private JButton clap21Button;
    private JButton clap22Button;
    private JButton clap23Button;
    private JButton clap24Button;
    private JButton clap25Button;
    private JButton clap26Button;
    private JButton clap27Button;
    private JButton clap28Button;
    private JButton clap29Button;
    private JButton clap30Button;
    private JButton clap31Button;
    private JButton clap32Button;

    private JButton snare1Button;
    private JButton snare2Button;
    private JButton snare3Button;
    private JButton snare4Button;
    private JButton snare5Button;
    private JButton snare6Button;
    private JButton snare7Button;
    private JButton snare8Button;
    private JButton snare9Button;
    private JButton snare10Button;
    private JButton snare11Button;
    private JButton snare12Button;
    private JButton snare13Button;
    private JButton snare14Button;
    private JButton snare15Button;
    private JButton snare16Button;
    private JButton snare17Button;
    private JButton snare18Button;
    private JButton snare19Button;
    private JButton snare20Button;
    private JButton snare21Button;
    private JButton snare22Button;
    private JButton snare23Button;
    private JButton snare24Button;
    private JButton snare25Button;
    private JButton snare26Button;
    private JButton snare27Button;
    private JButton snare28Button;
    private JButton snare29Button;
    private JButton snare30Button;
    private JButton snare31Button;
    private JButton snare32Button;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                BeatMakerUI frame = new BeatMakerUI();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public BeatMakerUI() {
        getContentPane().setBackground(new Color(51, 49, 47));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 2000, 550);
        getContentPane().setLayout(null);

        //setting up kick buttons

        JButton kick1Button = new JButton("");
        kick1Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick1Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick1Button.setOpaque(true);
        kick1Button.setForeground(Color.WHITE);
        kick1Button.setBackground(new Color(203, 9, 33, 67));
        kick1Button.setBounds(25, 10, 50, 50);
        getContentPane().add(kick1Button);
        kick1Button.addActionListener(e -> {
            kick1Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick2Button = new JButton("");
        kick2Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick2Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick2Button.setOpaque(true);
        kick2Button.setForeground(Color.WHITE);
        kick2Button.setBackground(new Color(203, 9, 33, 67));
        kick2Button.setBounds(80, 10, 50, 50);
        getContentPane().add(kick2Button);
        kick2Button.addActionListener(e -> {
            kick2Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick3Button = new JButton("");
        kick3Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick3Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick3Button.setOpaque(true);
        kick3Button.setForeground(Color.WHITE);
        kick3Button.setBackground(new Color(203, 9, 33, 67));
        kick3Button.setBounds(135, 10, 50, 50);
        getContentPane().add(kick3Button);
        kick3Button.addActionListener(e -> {
            kick3Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick4Button = new JButton("");
        kick4Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick4Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick4Button.setOpaque(true);
        kick4Button.setForeground(Color.WHITE);
        kick4Button.setBackground(new Color(203, 9, 33, 67));
        kick4Button.setBounds(190, 10, 50, 50);
        getContentPane().add(kick4Button);
        kick4Button.addActionListener(e -> {
            kick4Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick5Button = new JButton("");
        kick5Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick5Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick5Button.setOpaque(true);
        kick5Button.setForeground(Color.WHITE);
        kick5Button.setBackground(new Color(203, 9, 33, 67));
        kick5Button.setBounds(245, 10, 50, 50);
        getContentPane().add(kick5Button);
        kick5Button.addActionListener(e -> {
            kick5Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick6Button = new JButton("");
        kick6Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick6Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick6Button.setOpaque(true);
        kick6Button.setForeground(Color.WHITE);
        kick6Button.setBackground(new Color(203, 9, 33, 67));
        kick6Button.setBounds(300, 10, 50, 50);
        getContentPane().add(kick6Button);
        kick6Button.addActionListener(e -> {
            kick6Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick7Button = new JButton("");
        kick7Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick7Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick7Button.setOpaque(true);
        kick7Button.setForeground(Color.WHITE);
        kick7Button.setBackground(new Color(203, 9, 33, 67));
        kick7Button.setBounds(355, 10, 50, 50);
        getContentPane().add(kick7Button);
        kick7Button.addActionListener(e -> {
            kick7Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick8Button = new JButton("");
        kick8Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick8Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick8Button.setOpaque(true);
        kick8Button.setForeground(Color.WHITE);
        kick8Button.setBackground(new Color(203, 9, 33, 67));
        kick8Button.setBounds(410, 10, 50, 50);
        getContentPane().add(kick8Button);
        kick8Button.addActionListener(e -> {
            kick8Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick9Button = new JButton("");
        kick9Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick9Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick9Button.setOpaque(true);
        kick9Button.setForeground(Color.WHITE);
        kick9Button.setBackground(new Color(203, 9, 33, 67));
        kick9Button.setBounds(465, 10, 50, 50);
        getContentPane().add(kick9Button);
        kick9Button.addActionListener(e -> {
            kick9Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick10Button = new JButton("");
        kick10Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick10Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick10Button.setOpaque(true);
        kick10Button.setForeground(Color.WHITE);
        kick10Button.setBackground(new Color(203, 9, 33, 67));
        kick10Button.setBounds(520, 10, 50, 50);
        getContentPane().add(kick10Button);
        kick10Button.addActionListener(e -> {
            kick10Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick11Button = new JButton("");
        kick11Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick11Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick11Button.setOpaque(true);
        kick11Button.setForeground(Color.WHITE);
        kick11Button.setBackground(new Color(203, 9, 33, 67));
        kick11Button.setBounds(575, 10, 50, 50);
        getContentPane().add(kick11Button);
        kick11Button.addActionListener(e -> {
            kick11Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick12Button = new JButton("");
        kick12Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick12Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick12Button.setOpaque(true);
        kick12Button.setForeground(Color.WHITE);
        kick12Button.setBackground(new Color(203, 9, 33, 67));
        kick12Button.setBounds(630, 10, 50, 50);
        getContentPane().add(kick12Button);
        kick12Button.addActionListener(e -> {
            kick12Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick13Button = new JButton("");
        kick13Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick13Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick13Button.setOpaque(true);
        kick13Button.setForeground(Color.WHITE);
        kick13Button.setBackground(new Color(203, 9, 33, 67));
        kick13Button.setBounds(685, 10, 50, 50);
        getContentPane().add(kick13Button);
        kick13Button.addActionListener(e -> {
            kick13Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick14Button = new JButton("");
        kick14Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick14Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick14Button.setOpaque(true);
        kick14Button.setForeground(Color.WHITE);
        kick14Button.setBackground(new Color(203, 9, 33, 67));
        kick14Button.setBounds(740, 10, 50, 50);
        getContentPane().add(kick14Button);
        kick14Button.addActionListener(e -> {
            kick14Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick15Button = new JButton("");
        kick15Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick15Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick15Button.setOpaque(true);
        kick15Button.setForeground(Color.WHITE);
        kick15Button.setBackground(new Color(203, 9, 33, 67));
        kick15Button.setBounds(795, 10, 50, 50);
        getContentPane().add(kick15Button);
        kick15Button.addActionListener(e -> {
            kick15Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick16Button = new JButton("");
        kick16Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick16Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick16Button.setOpaque(true);
        kick16Button.setForeground(Color.WHITE);
        kick16Button.setBackground(new Color(203, 9, 33, 67));
        kick16Button.setBounds(850, 10, 50, 50);
        getContentPane().add(kick16Button);
        kick16Button.addActionListener(e -> {
            kick16Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick17Button = new JButton("");
        kick17Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick17Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick17Button.setOpaque(true);
        kick17Button.setForeground(Color.WHITE);
        kick17Button.setBackground(new Color(203, 9, 33, 67));
        kick17Button.setBounds(905, 10, 50, 50);
        getContentPane().add(kick17Button);
        kick17Button.addActionListener(e -> {
            kick17Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick18Button = new JButton("");
        kick18Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick18Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick18Button.setOpaque(true);
        kick18Button.setForeground(Color.WHITE);
        kick18Button.setBackground(new Color(203, 9, 33, 67));
        kick18Button.setBounds(960, 10, 50, 50);
        getContentPane().add(kick18Button);
        kick18Button.addActionListener(e -> {
            kick18Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick19Button = new JButton("");
        kick19Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick19Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick19Button.setOpaque(true);
        kick19Button.setForeground(Color.WHITE);
        kick19Button.setBackground(new Color(203, 9, 33, 67));
        kick19Button.setBounds(1015, 10, 50, 50);
        getContentPane().add(kick19Button);
        kick19Button.addActionListener(e -> {
            kick19Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick20Button = new JButton("");
        kick20Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick20Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick20Button.setOpaque(true);
        kick20Button.setForeground(Color.WHITE);
        kick20Button.setBackground(new Color(203, 9, 33, 67));
        kick20Button.setBounds(1070, 10, 50, 50);
        getContentPane().add(kick20Button);
        kick20Button.addActionListener(e -> {
            kick20Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick21Button = new JButton("");
        kick21Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick21Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick21Button.setOpaque(true);
        kick21Button.setForeground(Color.WHITE);
        kick21Button.setBackground(new Color(203, 9, 33, 67));
        kick21Button.setBounds(1125, 10, 50, 50);
        getContentPane().add(kick21Button);
        kick21Button.addActionListener(e -> {
            kick21Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick22Button = new JButton("");
        kick22Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick22Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick22Button.setOpaque(true);
        kick22Button.setForeground(Color.WHITE);
        kick22Button.setBackground(new Color(203, 9, 33, 67));
        kick22Button.setBounds(1180, 10, 50, 50);
        getContentPane().add(kick22Button);
        kick22Button.addActionListener(e -> {
            kick22Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick23Button = new JButton("");
        kick23Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick23Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick23Button.setOpaque(true);
        kick23Button.setForeground(Color.WHITE);
        kick23Button.setBackground(new Color(203, 9, 33, 67));
        kick23Button.setBounds(1235, 10, 50, 50);
        getContentPane().add(kick23Button);
        kick23Button.addActionListener(e -> {
            kick23Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick24Button = new JButton("");
        kick24Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick24Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick24Button.setOpaque(true);
        kick24Button.setForeground(Color.WHITE);
        kick24Button.setBackground(new Color(203, 9, 33, 67));
        kick24Button.setBounds(1290, 10, 50, 50);
        getContentPane().add(kick24Button);
        kick24Button.addActionListener(e -> {
            kick24Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick25Button = new JButton("");
        kick25Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick25Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick25Button.setOpaque(true);
        kick25Button.setForeground(Color.WHITE);
        kick25Button.setBackground(new Color(203, 9, 33, 67));
        kick25Button.setBounds(1345, 10, 50, 50);
        getContentPane().add(kick25Button);
        kick25Button.addActionListener(e -> {
            kick25Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick26Button = new JButton("");
        kick26Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick26Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick26Button.setOpaque(true);
        kick26Button.setForeground(Color.WHITE);
        kick26Button.setBackground(new Color(203, 9, 33, 67));
        kick26Button.setBounds(1400, 10, 50, 50);
        getContentPane().add(kick26Button);
        kick26Button.addActionListener(e -> {
            kick26Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick27Button = new JButton("");
        kick27Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick27Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick27Button.setOpaque(true);
        kick27Button.setForeground(Color.WHITE);
        kick27Button.setBackground(new Color(203, 9, 33, 67));
        kick27Button.setBounds(1455, 10, 50, 50);
        getContentPane().add(kick27Button);
        kick27Button.addActionListener(e -> {
            kick27Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick28Button = new JButton("");
        kick28Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick28Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick28Button.setOpaque(true);
        kick28Button.setForeground(Color.WHITE);
        kick28Button.setBackground(new Color(203, 9, 33, 67));
        kick28Button.setBounds(1510, 10, 50, 50);
        getContentPane().add(kick28Button);
        kick28Button.addActionListener(e -> {
            kick28Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick29Button = new JButton("");
        kick29Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick29Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick29Button.setOpaque(true);
        kick29Button.setForeground(Color.WHITE);
        kick29Button.setBackground(new Color(203, 9, 33, 67));
        kick29Button.setBounds(1565, 10, 50, 50);
        getContentPane().add(kick29Button);
        kick29Button.addActionListener(e -> {
            kick29Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick30Button = new JButton("");
        kick30Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick30Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick30Button.setOpaque(true);
        kick30Button.setForeground(Color.WHITE);
        kick30Button.setBackground(new Color(203, 9, 33, 67));
        kick30Button.setBounds(1620, 10, 50, 50);
        getContentPane().add(kick30Button);
        kick30Button.addActionListener(e -> {
            kick30Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick31Button = new JButton("");
        kick31Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick31Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick31Button.setOpaque(true);
        kick31Button.setForeground(Color.WHITE);
        kick31Button.setBackground(new Color(203, 9, 33, 67));
        kick31Button.setBounds(1675, 10, 50, 50);
        getContentPane().add(kick31Button);
        kick31Button.addActionListener(e -> {
            kick31Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton kick32Button = new JButton("");
        kick32Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        kick32Button.setFont(new Font("Impact", Font.PLAIN, 50));
        kick32Button.setOpaque(true);
        kick32Button.setForeground(Color.WHITE);
        kick32Button.setBackground(new Color(203, 9, 33, 67));
        kick32Button.setBounds(1730, 10, 50, 50);
        getContentPane().add(kick32Button);
        kick32Button.addActionListener(e -> {
            kick32Button.setBackground(new Color(203, 9, 33, 255));


        });



        //adding buttons for claps

        JButton clap1Button = new JButton("");
        clap1Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap1Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap1Button.setOpaque(true);
        clap1Button.setForeground(Color.WHITE);
        clap1Button.setBackground(new Color(203, 9, 33, 67));
        clap1Button.setBounds(25, 65, 50, 50);
        getContentPane().add(clap1Button);
        clap1Button.addActionListener(e -> {
            clap1Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap2Button = new JButton("");
        clap2Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap2Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap2Button.setOpaque(true);
        clap2Button.setForeground(Color.WHITE);
        clap2Button.setBackground(new Color(203, 9, 33, 67));
        clap2Button.setBounds(80, 65, 50, 50);
        getContentPane().add(clap2Button);
        clap2Button.addActionListener(e -> {
            clap2Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap3Button = new JButton("");
        clap3Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap3Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap3Button.setOpaque(true);
        clap3Button.setForeground(Color.WHITE);
        clap3Button.setBackground(new Color(203, 9, 33, 67));
        clap3Button.setBounds(135, 65, 50, 50);
        getContentPane().add(clap3Button);
        clap3Button.addActionListener(e -> {
            clap3Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap4Button = new JButton("");
        clap4Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap4Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap4Button.setOpaque(true);
        clap4Button.setForeground(Color.WHITE);
        clap4Button.setBackground(new Color(203, 9, 33, 67));
        clap4Button.setBounds(190, 65, 50, 50);
        getContentPane().add(clap4Button);
        clap4Button.addActionListener(e -> {
            clap4Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap5Button = new JButton("");
        clap5Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap5Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap5Button.setOpaque(true);
        clap5Button.setForeground(Color.WHITE);
        clap5Button.setBackground(new Color(203, 9, 33, 67));
        clap5Button.setBounds(245, 65, 50, 50);
        getContentPane().add(clap5Button);
        clap5Button.addActionListener(e -> {
            clap5Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap6Button = new JButton("");
        clap6Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap6Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap6Button.setOpaque(true);
        clap6Button.setForeground(Color.WHITE);
        clap6Button.setBackground(new Color(203, 9, 33, 67));
        clap6Button.setBounds(300, 65, 50, 50);
        getContentPane().add(clap6Button);
        clap6Button.addActionListener(e -> {
            clap6Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap7Button = new JButton("");
        clap7Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap7Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap7Button.setOpaque(true);
        clap7Button.setForeground(Color.WHITE);
        clap7Button.setBackground(new Color(203, 9, 33, 67));
        clap7Button.setBounds(355, 65, 50, 50);
        getContentPane().add(clap7Button);
        clap7Button.addActionListener(e -> {
            clap7Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap8Button = new JButton("");
        clap8Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap8Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap8Button.setOpaque(true);
        clap8Button.setForeground(Color.WHITE);
        clap8Button.setBackground(new Color(203, 9, 33, 67));
        clap8Button.setBounds(410, 65, 50, 50);
        getContentPane().add(clap8Button);
        clap8Button.addActionListener(e -> {
            clap8Button.setBackground(new Color(203, 9, 33, 255));


        });



        JButton clap9Button = new JButton("");
        clap9Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap9Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap9Button.setOpaque(true);
        clap9Button.setForeground(Color.WHITE);
        clap9Button.setBackground(new Color(203, 9, 33, 67));
        clap9Button.setBounds(465, 65, 50, 50);
        getContentPane().add(clap9Button);
        clap9Button.addActionListener(e -> {
            clap9Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap10Button = new JButton("");
        clap10Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap10Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap10Button.setOpaque(true);
        clap10Button.setForeground(Color.WHITE);
        clap10Button.setBackground(new Color(203, 9, 33, 67));
        clap10Button.setBounds(520, 65, 50, 50);
        getContentPane().add(clap10Button);
        clap10Button.addActionListener(e -> {
            clap10Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap11Button = new JButton("");
        clap11Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap11Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap11Button.setOpaque(true);
        clap11Button.setForeground(Color.WHITE);
        clap11Button.setBackground(new Color(203, 9, 33, 67));
        clap11Button.setBounds(575, 65, 50, 50);
        getContentPane().add(clap11Button);
        clap11Button.addActionListener(e -> {
            clap11Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap12Button = new JButton("");
        clap12Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap12Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap12Button.setOpaque(true);
        clap12Button.setForeground(Color.WHITE);
        clap12Button.setBackground(new Color(203, 9, 33, 67));
        clap12Button.setBounds(630, 65, 50, 50);
        getContentPane().add(clap12Button);
        clap12Button.addActionListener(e -> {
            clap12Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap13Button = new JButton("");
        clap13Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap13Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap13Button.setOpaque(true);
        clap13Button.setForeground(Color.WHITE);
        clap13Button.setBackground(new Color(203, 9, 33, 67));
        clap13Button.setBounds(685, 65, 50, 50);
        getContentPane().add(clap13Button);
        clap13Button.addActionListener(e -> {
            clap13Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap14Button = new JButton("");
        clap14Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap14Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap14Button.setOpaque(true);
        clap14Button.setForeground(Color.WHITE);
        clap14Button.setBackground(new Color(203, 9, 33, 67));
        clap14Button.setBounds(740, 65, 50, 50);
        getContentPane().add(clap14Button);
        clap14Button.addActionListener(e -> {
            clap14Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap15Button = new JButton("");
        clap15Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap15Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap15Button.setOpaque(true);
        clap15Button.setForeground(Color.WHITE);
        clap15Button.setBackground(new Color(203, 9, 33, 67));
        clap15Button.setBounds(795, 65, 50, 50);
        getContentPane().add(clap15Button);
        clap15Button.addActionListener(e -> {
            clap15Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap16Button = new JButton("");
        clap16Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap16Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap16Button.setOpaque(true);
        clap16Button.setForeground(Color.WHITE);
        clap16Button.setBackground(new Color(203, 9, 33, 67));
        clap16Button.setBounds(850, 65, 50, 50);
        getContentPane().add(clap16Button);
        clap16Button.addActionListener(e -> {
            clap16Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap17Button = new JButton("");
        clap17Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap17Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap17Button.setOpaque(true);
        clap17Button.setForeground(Color.WHITE);
        clap17Button.setBackground(new Color(203, 9, 33, 67));
        clap17Button.setBounds(905, 65, 50, 50);
        getContentPane().add(clap17Button);
        clap17Button.addActionListener(e -> {
            clap17Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap18Button = new JButton("");
        clap18Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap18Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap18Button.setOpaque(true);
        clap18Button.setForeground(Color.WHITE);
        clap18Button.setBackground(new Color(203, 9, 33, 67));
        clap18Button.setBounds(960, 65, 50, 50);
        getContentPane().add(clap18Button);
        clap18Button.addActionListener(e -> {
            clap18Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap19Button = new JButton("");
        clap19Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap19Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap19Button.setOpaque(true);
        clap19Button.setForeground(Color.WHITE);
        clap19Button.setBackground(new Color(203, 9, 33, 67));
        clap19Button.setBounds(1015, 65, 50, 50);
        getContentPane().add(clap19Button);
        clap19Button.addActionListener(e -> {
            clap19Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap20Button = new JButton("");
        clap20Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap20Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap20Button.setOpaque(true);
        clap20Button.setForeground(Color.WHITE);
        clap20Button.setBackground(new Color(203, 9, 33, 67));
        clap20Button.setBounds(1070, 65, 50, 50);
        getContentPane().add(clap20Button);
        clap20Button.addActionListener(e -> {
            clap20Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap21Button = new JButton("");
        clap21Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap21Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap21Button.setOpaque(true);
        clap21Button.setForeground(Color.WHITE);
        clap21Button.setBackground(new Color(203, 9, 33, 67));
        clap21Button.setBounds(1125, 65, 50, 50);
        getContentPane().add(clap21Button);
        clap21Button.addActionListener(e -> {
            clap21Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap22Button = new JButton("");
        clap22Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap22Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap22Button.setOpaque(true);
        clap22Button.setForeground(Color.WHITE);
        clap22Button.setBackground(new Color(203, 9, 33, 67));
        clap22Button.setBounds(1180, 65, 50, 50);
        getContentPane().add(clap22Button);
        clap22Button.addActionListener(e -> {
            clap22Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap23Button = new JButton("");
        clap23Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap23Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap23Button.setOpaque(true);
        clap23Button.setForeground(Color.WHITE);
        clap23Button.setBackground(new Color(203, 9, 33, 67));
        clap23Button.setBounds(1235, 65, 50, 50);
        getContentPane().add(clap23Button);
        clap23Button.addActionListener(e -> {
            clap23Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap24Button = new JButton("");
        clap24Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap24Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap24Button.setOpaque(true);
        clap24Button.setForeground(Color.WHITE);
        clap24Button.setBackground(new Color(203, 9, 33, 67));
        clap24Button.setBounds(1290, 65, 50, 50);
        getContentPane().add(clap24Button);
        clap24Button.addActionListener(e -> {
            clap24Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap25Button = new JButton("");
        clap25Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap25Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap25Button.setOpaque(true);
        clap25Button.setForeground(Color.WHITE);
        clap25Button.setBackground(new Color(203, 9, 33, 67));
        clap25Button.setBounds(1345, 65, 50, 50);
        getContentPane().add(clap25Button);
        clap25Button.addActionListener(e -> {
            clap25Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap26Button = new JButton("");
        clap26Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap26Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap26Button.setOpaque(true);
        clap26Button.setForeground(Color.WHITE);
        clap26Button.setBackground(new Color(203, 9, 33, 67));
        clap26Button.setBounds(1400, 65, 50, 50);
        getContentPane().add(clap26Button);
        clap26Button.addActionListener(e -> {
            clap26Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap27Button = new JButton("");
        clap27Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap27Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap27Button.setOpaque(true);
        clap27Button.setForeground(Color.WHITE);
        clap27Button.setBackground(new Color(203, 9, 33, 67));
        clap27Button.setBounds(1455, 65, 50, 50);
        getContentPane().add(clap27Button);
        clap27Button.addActionListener(e -> {
            clap27Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap28Button = new JButton("");
        clap28Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap28Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap28Button.setOpaque(true);
        clap28Button.setForeground(Color.WHITE);
        clap28Button.setBackground(new Color(203, 9, 33, 67));
        clap28Button.setBounds(1510, 65, 50, 50);
        getContentPane().add(clap28Button);
        clap28Button.addActionListener(e -> {
            clap28Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap29Button = new JButton("");
        clap29Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap29Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap29Button.setOpaque(true);
        clap29Button.setForeground(Color.WHITE);
        clap29Button.setBackground(new Color(203, 9, 33, 67));
        clap29Button.setBounds(1565, 65, 50, 50);
        getContentPane().add(clap29Button);
        clap29Button.addActionListener(e -> {
            clap29Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap30Button = new JButton("");
        clap30Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap30Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap30Button.setOpaque(true);
        clap30Button.setForeground(Color.WHITE);
        clap30Button.setBackground(new Color(203, 9, 33, 67));
        clap30Button.setBounds(1620, 65, 50, 50);
        getContentPane().add(clap30Button);
        clap30Button.addActionListener(e -> {
            clap30Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap31Button = new JButton("");
        clap31Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap31Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap31Button.setOpaque(true);
        clap31Button.setForeground(Color.WHITE);
        clap31Button.setBackground(new Color(203, 9, 33, 67));
        clap31Button.setBounds(1675, 65, 50, 50);
        getContentPane().add(clap31Button);
        clap31Button.addActionListener(e -> {
            clap31Button.setBackground(new Color(203, 9, 33, 255));


        });

        JButton clap32Button = new JButton("");
        clap32Button.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        clap32Button.setFont(new Font("Impact", Font.PLAIN, 50));
        clap32Button.setOpaque(true);
        clap32Button.setForeground(Color.WHITE);
        clap32Button.setBackground(new Color(203, 9, 33, 67));
        clap32Button.setBounds(1730, 65, 50, 50);
        getContentPane().add(clap32Button);
        clap32Button.addActionListener(e -> {
            clap32Button.setBackground(new Color(203, 9, 33, 255));


        });



    }

}
