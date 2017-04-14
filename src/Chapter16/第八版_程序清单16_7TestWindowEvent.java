package Chapter16;

import java.awt.event.*;
import javax.swing.JFrame;

public class 第八版_程序清单16_7TestWindowEvent extends JFrame{
	public static void main(String[] args){
		第八版_程序清单16_7TestWindowEvent frame = new 第八版_程序清单16_7TestWindowEvent();
		frame.setSize(220, 80);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("TestWindowEvent");
		frame.setVisible(true);
		
	}
	
	public 第八版_程序清单16_7TestWindowEvent(){
		addWindowListener(new WindowListener() {
			
			public void windowDeiconified(WindowEvent event){
				System.out.println("Window deiconified");
			}
		
			public void windowIconified(WindowEvent event){
				System.out.println("Window iconified");
			}
		
			public void windowActivated(WindowEvent event){
				System.out.println("Window activated");
			}
			
			public void windowDeactivated(WindowEvent event){
				System.out.println("Window deactivated");
			}
			
			public void windowOpened(WindowEvent event){
				System.out.println("Window opened");
			}
			
			public void windowClosing(WindowEvent event){
				System.out.println("Window closing");
			}
			
			public void windowClosed(WindowEvent event){
				System.out.println("Window closed");
			}
		});	
	}

}
