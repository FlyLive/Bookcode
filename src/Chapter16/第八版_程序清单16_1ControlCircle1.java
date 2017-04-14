package Chapter16;

import javax.swing.*;
import java.awt.*;

public class 第八版_程序清单16_1ControlCircle1 extends JFrame{
	public static void main(){
		JFrame frame = new 第八版_程序清单16_1ControlCircle1();
		frame.setTitle("ControlCirclr1");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.setVisible(true);
	}

	private JButton jbtEnlarge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();

	public 第八版_程序清单16_1ControlCircle1(){
		JPanel panel = new JPanel();
		panel.add(jbtEnlarge);
		panel.add(jbtShrink);

		this.add(canvas,BorderLayout.CENTER);
		this.add(panel,BorderLayout.SOUTH);
	}
}

class CirclePanel extends JPanel{
	private int radius = 5;

	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawOval(getWidth() / 2 - radius,getHeight() / 2 -
			radius,2 * radius,2 * radius);
	}
}