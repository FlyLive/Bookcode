package Chapter12;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;

public class 第八版_程序清单12_5ShowBorderLayout extends JFrame{
	public 第八版_程序清单12_5ShowBorderLayout(){
		setLayout(new BorderLayout(5,10));
		
		add(new JButton("East"), BorderLayout.EAST);
		add(new JButton("South"),BorderLayout.SOUTH);
		add(new JButton("West"),BorderLayout.WEST);
		add(new JButton("North"),BorderLayout.NORTH);
		add(new JButton("Center"),BorderLayout.CENTER);
	}
	
	public static void main(String[] args){
		第八版_程序清单12_5ShowBorderLayout frame = new 第八版_程序清单12_5ShowBorderLayout();
		frame.setTitle("ShowBorderLayout");
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
