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
        setBounds(100, 100, 1760, 550);
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

    }

}
