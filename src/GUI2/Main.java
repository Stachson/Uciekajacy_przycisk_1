package GUI2;

import javax.swing.*;
import java.awt.*;

public class Main
{

    public static void main(String[] args)
    {

        EventQueue.invokeLater(()->
        {
            var frame = new MyFrame();
            frame.setTitle("Okienko");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });

    }

}
