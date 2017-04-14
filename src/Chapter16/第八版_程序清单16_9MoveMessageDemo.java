package Chapter16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class �ڰ˰�_�����嵥16_9MoveMessageDemo extends JFrame{
	public �ڰ˰�_�����嵥16_9MoveMessageDemo(){
		MovableMessagePanel p =
				new MovableMessagePanel("Welcome to java");
		setLayout(new BorderLayout());
		add(p);
	}

	public static void main(String[] args){
		�ڰ˰�_�����嵥16_9MoveMessageDemo frame =
				new �ڰ˰�_�����嵥16_9MoveMessageDemo();
		frame.setTitle("MoveMessageDemo");
		frame.setSize(200,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	static class MovableMessagePanel extends JPanel{
		private String message = "Welcome to java";
		private int x = 20;
		private int y = 20;

		public MovableMessagePanel(String s){
			message = s;
			addMouseMotionListener(new MouseMotionAdapter(){
				public void mouseDragged(MouseEvent e){
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}

		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString(message,x,y);
		}
	}
}