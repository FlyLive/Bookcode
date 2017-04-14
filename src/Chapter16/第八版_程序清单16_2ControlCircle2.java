package Chapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class 第八版_程序清单16_2ControlCircle2 extends JFrame{
	public static void main(String[] args){
		JFrame frame = new 第八版_程序清单16_2ControlCircle2();
		frame.setTitle("程序清单16_2ControlCircle2");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.setVisible(true);
	}

	private JButton jbtEnlarge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();

	public 第八版_程序清单16_2ControlCircle2(){
		JPanel panel = new JPanel();
		panel.add(jbtEnlarge);
		panel.add(jbtShrink);

		this.add(canvas,BorderLayout.CENTER);
		this.add(panel,BorderLayout.SOUTH);

		jbtEnlarge.addActionListener(new EnlargeListener());
		jbtShrink.addActionListener(new EnlargeListener());
	}

	class EnlargeListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == jbtEnlarge)
				canvas.enlarge();
			else if(e.getSource() == jbtShrink)
				canvas.Shrink();
		}
	}

	class CirclePanel extends JPanel{
		private int radius = 5;

		public void enlarge(){
			radius++;
			repaint();
		}
		
		public void Shrink(){
			radius--;
			repaint();
		}
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawOval(getWidth() / 2 - radius,getHeight()
				/ 2 - radius,2 * radius,2 * radius);
		}
	}
}