import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginFrame extends JFrame {
    private Container cp;
    private JButton logon = new JButton("login");
    private JButton score = new JButton("Score");
    private JButton exit = new JButton("Exit");


    public loginFrame(){
        init();
    }
    public void init(){
       cp=this.getContentPane();
       cp.setLayout(null);
       this.setBounds(100,150,300,500);
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       cp.setBackground(new Color(255,150,100));

       logon.setBounds(100,100,100,50);
       score.setBounds(100,200,100,50);
       exit.setBounds(100,300,100,50);

       cp.add(logon);
       cp.add(score);
       cp.add(exit);

       logon.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               gameFrame gf = new gameFrame();
               gf.setVisible(true);


           }
       });

    }
}