package rysowanie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame
{
    public Main()
    {
        this.setTitle("Rysowanie");
        this.setBounds(250, 300, 800, 600);

        this.getContentPane().add(panelDoRysowania);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }

    private PanelRysowania panelDoRysowania = new PanelRysowania();
}
class PanelRysowania extends JPanel implements ActionListener
{
    Random generator = new Random();
    JButton BTest = new JButton("Test");
    public Color[] colors = {Color.GREEN ,Color.BLUE ,Color.BLACK ,Color.RED ,Color.WHITE ,Color.PINK ,Color.MAGENTA ,Color.ORANGE};

    public PanelRysowania()
    {
        super();
        BTest.addActionListener(this);
        add(BTest);
    }


    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.drawString("Napis", 0, 40);

        g.drawImage(new ImageIcon("tenor.gif").getImage(), 200, 130, 400, 350, null);

        g.drawRect(200, 130, 400, 350);

        g.drawLine(0,60, 800,60);

        Graphics2D g2 = (Graphics2D)g;

        System.out.println(i++);

    }

    public static int i = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(colors[generator.nextInt(7)]);
    }
}