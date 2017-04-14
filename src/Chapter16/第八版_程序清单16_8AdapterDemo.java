package Chapter16;

import java.awt.event.*;
import javax.swing.JFrame;

public class 第八版_程序清单16_8AdapterDemo extends JFrame{
	public static void main(String[] args){
		第八版_程序清单16_8AdapterDemo frame = new 第八版_程序清单16_8AdapterDemo();
		frame.setSize(220,80);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("AdapterDemo");
		frame.setVisible(true);
	}

	public 第八版_程序清单16_8AdapterDemo(){
		addWindowListener(new WindowAdapter(){
			public void windowActivated(WindowEvent envent){
				System.out.println("Window acticated");
			}
		});
	}
}