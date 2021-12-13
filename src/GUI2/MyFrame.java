package GUI2;

import GUI2.GBC;
import GUI2.Kanwa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MyFrame extends JFrame {

    public MyFrame()
    {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        setSize(screenWidth / 2, screenHeight / 2);

        Kanwa kanwa = new Kanwa();
        JButton runButton = new JButton("CMIYC");
        JButton resetButton = new JButton("Reset");
        Random rnd = new Random();

        setLayout(new GridBagLayout());

        add(runButton,new GBC(1,1,1,1).setWeight(1,1));
        add(resetButton, new GBC(1,2,1,1).setWeight(1,1));
        add(kanwa,new GBC(0,0,10,10).setFill(GridBagConstraints.BOTH));


            runButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);

                    int width= runButton.getWidth();
                    //Ustawienie strefy bezpiecznej od góry, tzn możemy najechać na przycisk wyłącznie od góry, inaczej ucieknie
                    if(e.getY() >+1) {
                        int x = rnd.nextInt(300) + 100;
                        int y = rnd.nextInt(300) + 100;
                        runButton.setLocation(x, y);
                    }
                    }
                });

        /*
        resetButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                runButton.setLocation(0,0);
            }
        });
         */

        }
}
