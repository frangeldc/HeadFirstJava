package chap12.poolpuzzle;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Animate {
    int x = 1;
    int y = 1;

    public static void main(String[] args) {
	Animate gui = new Animate();
	gui.go();
    }

    public void go() {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(

		JFrame.EXIT_ON_CLOSE);
	MyDrawP drawP = new MyDrawP();
	frame.getContentPane().add(drawP);

	frame.setSize(500, 270);
	frame.setVisible(true);

	for (int i = 0; i < 124; i++, y++, x++) {
	    x++;
	    drawP.repaint();

	    try {
		Thread.sleep(50);
	    } catch (Exception ex) {
	    }
	}
    }

    class MyDrawP extends JPanel {
	public void paintComponent(Graphics g) {
	    g.setColor(Color.white);
	    g.fillRect(0, 0, 500, 250);
	    g.setColor(Color.blue);
	    // g.fillRect(x, y, x - 500, y - 250);
	    g.fillRect(x, y, 500 - x * 2, 250 - y * 2);
	}
    } // close class MyDrawP
} // close class Animate
