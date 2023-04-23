package com.edu4java.minitennis2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel {

	int x = 0;
	int y = 0;

	private void moveBall() {
		x = x + 1;
		y = y + 1;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 30, 30);
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Mini Tennis - Sunset");
		Game game = new Game();
		frame.add(game);
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			game.moveBall();
			game.repaint();
			Thread.sleep(10);
		}
	}
}
