package Chapter16;

import java.awt.event.*;
import javax.swing.JFrame;

public class �ڰ˰�_�����嵥16_8AdapterDemo extends JFrame{
	public static void main(String[] args){
		�ڰ˰�_�����嵥16_8AdapterDemo frame = new �ڰ˰�_�����嵥16_8AdapterDemo();
		frame.setSize(220,80);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("AdapterDemo");
		frame.setVisible(true);
	}

	public �ڰ˰�_�����嵥16_8AdapterDemo(){
		addWindowListener(new WindowAdapter(){
			public void windowActivated(WindowEvent envent){
				System.out.println("Window acticated");
			}
		});
	}
}