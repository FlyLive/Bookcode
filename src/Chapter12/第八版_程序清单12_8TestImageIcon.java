package Chapter12;

import javax.swing.*;
import java.awt.*;

public class �ڰ˰�_�����嵥12_8TestImageIcon  extends JFrame{
	private ImageIcon usIcon = new ImageIcon
			("D:/Important/JAVA/MyEclipse(Java����)/image/us.gif");
	private ImageIcon myIcon = new ImageIcon
			("D:/Important/JAVA/MyEclipse(Java����)/image/my.jpg");
	private ImageIcon frIcon = new ImageIcon
			("D:/Important/JAVA/MyEclipse(Java����)/image/fr.gif");
	private ImageIcon ukIcon = new ImageIcon
			("D:/Important/JAVA/MyEclipse(Java����)/image/uk.gif");
	
	public �ڰ˰�_�����嵥12_8TestImageIcon(){
		setLayout(new GridLayout(1, 4, 5, 5));
		add(new JLabel(usIcon));
		add(new JLabel(myIcon));
		add(new JLabel(frIcon));
		add(new JLabel(ukIcon));
	}
	
	public static void main(String[] args){
		�ڰ˰�_�����嵥12_8TestImageIcon frame = new �ڰ˰�_�����嵥12_8TestImageIcon();
		frame.setTitle("TestImageIcon");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
