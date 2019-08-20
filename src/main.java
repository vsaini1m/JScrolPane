import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frame();
            }
        });
    }
}
class frame extends JFrame{

JTextArea textArea=new JTextArea();
    public frame(){
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea),BorderLayout.CENTER);


    }
}

