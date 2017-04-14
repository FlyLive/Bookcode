package Chapter16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 第八版_程序清单16_11AnimationDemo extends JFrame{
	public 第八版_程序清单16_11AnimationDemo(){
		add(new MovingMessagePanel("Message moving?"));
	}

	public static void main(String[] args){
		第八版_程序清单16_11AnimationDemo frame = new 第八版_程序清单16_11AnimationDemo();
		frame.setTitle("AnimationDemo");
		frame.setSize(280,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	static class MovingMessagePanel extends JPanel{
		private String message = "Welcome to java";
		private int xCoordinate = 0;
		private int yCoordinate = 20;

		public MovingMessagePanel(String message){
			this.message = message;
			Timer timer = new Timer(1000,new TimerListener());
			timer.start();
		}

		protected void paintComponent(Graphics g){
			super.paintComponent(g);

			if(xCoordinate > getWidth()){
				xCoordinate = -20;
			}
			xCoordinate += 5;
			g.drawString(message,xCoordinate,yCoordinate);
		}

		class TimerListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				repaint();
			}
		}
	}
}