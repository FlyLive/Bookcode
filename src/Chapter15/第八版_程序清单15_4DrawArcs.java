package Chapter15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class 第八版_程序清单15_4DrawArcs extends JFrame{
	public 第八版_程序清单15_4DrawArcs(){
		JPanel p = new ArcsPanel();
		setTitle("DrawArcs");
		p.setForeground(Color.red);
		add(p);
	}
	
	public static void main(String[] args){
		第八版_程序清单15_4DrawArcs frame = new 第八版_程序清单15_4DrawArcs();
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	class ArcsPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			int xCenter = getWidth() / 2;
			int yCenter = getHeight() / 2;
			int radius = (int)(Math.min(getWidth(),getHeight() * 0.4));
			
			int x = xCenter - radius;
			int y = yCenter - radius;
			
			g.fillArc(x,y,2 * radius,2 * radius,0,30);
			g.fillArc(x,y,2 * radius,2 * radius,90,30);
			g.fillArc(x,y,2 * radius,2 * radius,180,30);
			g.fillArc(x,y,2 * radius,2 * radius,270,30);
		}
	}
}