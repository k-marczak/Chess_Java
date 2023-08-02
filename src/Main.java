import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 532, 552);


        JPanel pn = new JPanel() {
            @Override
            public void paint(Graphics g) {
                boolean white = true;
                for(int y = 0; y < 8; y++){
                    for(int x = 0; x < 8; x++){
                        if(white){
                            g.setColor(Color.white.darker());
                        }else {
                            g.setColor(Color.black);
                        }
                        g.fillRect(x*64, y*64, 64, 64);
                        white = !white;
                    }
                    white = !white;
                }
            }
        };

        frame.add(pn);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}