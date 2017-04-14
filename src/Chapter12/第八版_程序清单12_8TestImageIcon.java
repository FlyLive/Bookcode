package Chapter12;

import javax.swing.*;
import java.awt.*;

public class 第八版_程序清单12_8TestImageIcon  extends JFrame{
	private ImageIcon usIcon = new ImageIcon
			("D:/Important/JAVA/MyEclipse(Java程序)/image/us.gif");
	private ImageIcon myIcon = new ImageIcon
			("D:/Important/JAVA/MyEclipse(Java程序)/image/my.jpg");
	private ImageIcon frIcon = new ImageIcon
			("D:/Important/JAVA/MyEclipse(Java程序)/image/fr.gif");
	private ImageIcon ukIcon = new ImageIcon
			("D:/Important/JAVA/MyEclipse(Java程序)/image/uk.gif");
	
	public 第八版_程序清单12_8TestImageIcon(){
		setLayout(new GridLayout(1, 4, 5, 5));
		add(new JLabel(usIcon));
		add(new JLabel(myIcon));
		add(new JLabel(frIcon));
		add(new JLabel(ukIcon));
	}
	
	public static void main(String[] args){
		第八版_程序清单12_8TestImageIcon frame = new 第八版_程序清单12_8TestImageIcon();
		frame.setTitle("TestImageIcon");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
