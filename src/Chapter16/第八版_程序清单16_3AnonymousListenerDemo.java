package Chapter16;

import javax.swing.*;
import java.awt.event.*;

public class 第八版_程序清单16_3AnonymousListenerDemo extends JFrame{
	public 第八版_程序清单16_3AnonymousListenerDemo(){
		JButton jbtNew = new JButton("New");
		JButton jbtOpen = new JButton("Open");
		JButton jbtSave = new JButton("Save");
		JButton jbtPrint = new JButton("Print"); 
		
		JPanel panel = new JPanel();
		panel.add(jbtNew);
		panel.add(jbtOpen);
		panel.add(jbtSave);
		panel.add(jbtPrint);
		
		add(panel);
		
		jbtNew.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						System.out.println("Process New");
					}
				}
			);
		
		jbtOpen.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						System.out.println("Process Open");
					}
				}
			);
		
		jbtSave.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						System.out.println("Process Save");
					}
				}
			);
		
		jbtPrint.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						System.out.println("Process Print");
					}
				}
			);
	}
	
	public static void main(String[] args){
		JFrame frame = new 第八版_程序清单16_3AnonymousListenerDemo();
		frame.setTitle("AnonymousListenerDemo");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
