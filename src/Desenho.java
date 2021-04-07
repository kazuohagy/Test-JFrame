import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Desenho extends JFrame {
	JLabel mario = new JLabel("TESTE");
	Font m = new Font("Serif",Font.BOLD,60);
	
	public Desenho() {
		setLayout(new BorderLayout());
		setSize(720,720);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);


		
	}
	public void paint(Graphics g) {
		int x =0;
		int y =0;
		int a = 720;
		int b = 720;
		while(x <=360) {
		g.setColor(Color.pink);
		g.drawOval(x, y, 80, 90);
		g.setColor(Color.LIGHT_GRAY);
		g.drawOval(a, b, 80, 90);
		add(mario);
		x += 1;
		y += 1;
		a -= 1;
		b -= 1;
		}
		/*
		mario.setFont(m);
		mario.setForeground(Color.pink);
		add(BorderLayout.SOUTH,mario);
		add(mario);*/
	}
}
