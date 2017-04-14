package Chapter12;

import javax.swing.JFrame;

public class 第八版_程序清单12_1MyFrame {
	public static void main(String[] args){
		JFrame frame = new JFrame("MyFrame");
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
