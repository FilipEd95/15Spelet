import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FifteenGame extends JFrame implements ActionListener {

    //JFrame frame = new JFrame();
//    JLabel label = new JLabel("15 Game");
//    JButton bNyttSpel = new JButton("Nytt Spel");

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b10 = new JButton("10");
    JButton b11 = new JButton("11");
    JButton b12 = new JButton("12");
    JButton b13 = new JButton("13");
    JButton b14 = new JButton("14");
    JButton b15 = new JButton("15");
    JButton btom = new JButton("");
    JPanel pMain = new JPanel(), NORTH;
    JPanel p = new JPanel(), CENTER;
    JPanel p2 = new JPanel();

    public FifteenGame(){

        pMain.setLayout(new BorderLayout());

        this.setTitle("15 Game");
        this.add(p);
        this.add(pMain);
        //p.add(label);
//        pMain.add(new JButton("Tryck"),NORTH);
//        p.add(new JButton("TEst mitten"), CENTER);
        //bNyttSpel.setBounds(20, 20, 100, 100);
        p.setLayout(new GridLayout(4,4));


        //p.add(b1);

        p.add(b1);p.add(b2); p.add(b3); p.add(b4);p.add(b5);p.add(b6);p.add(b7); p.add(b8);p.add(b9);
        p.add(b10);p.add(b11);p.add(b12);p.add(b13);p.add(b14);p.add(b15);p.add(btom);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        btom.addActionListener(this);
//        bNyttSpel.addActionListener(this);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Random random = new Random();

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}