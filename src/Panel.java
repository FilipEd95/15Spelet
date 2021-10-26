import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Panel extends JFrame implements ActionListener {

        ArrayList<JButton> arrayList = new ArrayList<>();

        JButton buttonNyttSpel = new JButton("Nytt Spel");
        JPanel p = new JPanel();
        JPanel p2 = new JPanel();

        // For loopa alla knappar

        JButton b1 = new JButton("1"); JButton b2 = new JButton("2");
        JButton b3 = new JButton("3"); JButton b4 = new JButton("4");
        JButton b5 = new JButton("5"); JButton b6 = new JButton("6");
        JButton b7 = new JButton("7"); JButton b8 = new JButton("8");
        JButton b9 = new JButton("9"); JButton b10 = new JButton("10");
        JButton b11 = new JButton("11"); JButton b12 = new JButton("12");
        JButton b13 = new JButton("13"); JButton b14 = new JButton("14");
        JButton b15 = new JButton("15"); JButton btom = new JButton("");

        public Panel(){

            setLayout(new BorderLayout());
            setTitle("15 Game");

            add(p2,BorderLayout.NORTH);
            p2.add(buttonNyttSpel);

            add(p, BorderLayout.CENTER);
            p.setLayout(new GridLayout(4,4));

            buttonNyttSpel.addActionListener(this);

            arrayList.add(b1); arrayList.add(b2); arrayList.add(b3);arrayList.add(b4);arrayList.add(b5);
            arrayList.add(b6);arrayList.add(b7);arrayList.add(b8);arrayList.add(b9);arrayList.add(b10);
            arrayList.add(b11);arrayList.add(b12);arrayList.add(b13);arrayList.add(b14);
            arrayList.add(b15); arrayList.add(btom);

            Collections.shuffle(arrayList);

            for (JButton buttons : arrayList) {
                p.add(buttons);
            }

            /*b1.addActionListener(this); b2.addActionListener(this);
            b3.addActionListener(this); b4.addActionListener(this);
            b5.addActionListener(this); b6.addActionListener(this);
            b7.addActionListener(this); b8.addActionListener(this);
            b9.addActionListener(this); b10.addActionListener(this);
            b11.addActionListener(this); b12.addActionListener(this);
            b13.addActionListener(this); b14.addActionListener(this);
            b15.addActionListener(this); btom.addActionListener(this);*/

            pack();
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        Collections.shuffle(arrayList);
        for (JButton buttons : arrayList) {
            p.add(buttons);
        }
        p.revalidate();
    }
}