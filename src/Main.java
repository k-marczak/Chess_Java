import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        JFrame frame = new JFrame();
        ChessGame gameplay = new ChessGame();

        frame.setTitle("Chess Game");
        frame.setBounds(300, 20, 700, 700);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gameplay);
    }




}
