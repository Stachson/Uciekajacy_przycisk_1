package GUI2;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


public class Kanwa extends JPanel implements MouseInputListener
{

    private static boolean RysujKwadrat = true;


    public Kanwa()
    {
        setBackground(Color.ORANGE);
        setFocusable(true);

        addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode()==KeyEvent.VK_K)
                    RysujKwadrat = true;
                if(e.getKeyCode()==KeyEvent.VK_O)
                    RysujKwadrat = false;
            }
        });
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();;
        Graphics g = getGraphics();
        if (RysujKwadrat)
            g.drawRect(x, y, 50, 50);
        else
            g.drawOval(x, y,50,50);
    }



    @Override
    public void mousePressed(MouseEvent e)
    {

    }

    @Override
    public void mouseReleased(MouseEvent e)
    {

    }

    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    @Override
    public void mouseExited(MouseEvent e)
    {

    }

    @Override
    public void mouseDragged(MouseEvent e)
    {

    }

    @Override
    public void mouseMoved(MouseEvent e)
    {

    }

}