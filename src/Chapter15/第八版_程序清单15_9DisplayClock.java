package Chapter15;

import java.awt.*;

import javax.swing.*;

public class 第八版_程序清单15_9DisplayClock {
	public static void main(String[] args){
		JFrame f = new JFrame();
		f.add(new 第八版_程序清单15_10StillClock());
		f.setTitle("Clock");
		f.pack();
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
