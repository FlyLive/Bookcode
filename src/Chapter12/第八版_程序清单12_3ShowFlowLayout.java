package Chapter12;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class �ڰ˰�_�����嵥12_3ShowFlowLayout extends JFrame {
	public �ڰ˰�_�����嵥12_3ShowFlowLayout(){
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		
		add(new JLabel("First Name"));
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("Last name"));
		add(new JTextField(8));
	}
	
	public static void main(String[] args){
		�ڰ˰�_�����嵥12_3ShowFlowLayout frame = new �ڰ˰�_�����嵥12_3ShowFlowLayout();
		frame.setTitle("ShowFlowLayout");
		frame.setSize(200,200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
