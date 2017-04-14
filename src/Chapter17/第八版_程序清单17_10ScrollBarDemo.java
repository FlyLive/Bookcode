package Chapter17;

import javax.swing.*;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.*;

public class �ڰ˰�_�����嵥17_10ScrollBarDemo extends JFrame{
	private JScrollBar jscbHort = new JScrollBar(JScrollBar.HORIZONTAL);
	private JScrollBar jscbVert = new JScrollBar(JScrollBar.VERTICAL);
	
	/*private MessagePanel messagePanel =
			new MessagePanel("Welcome to Java");*/
	
	public static void main(String[] args){
		�ڰ˰�_�����嵥17_10ScrollBarDemo f =
				new �ڰ˰�_�����嵥17_10ScrollBarDemo();
		f.setTitle("Fan");
		f.pack();
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	public �ڰ˰�_�����嵥17_10ScrollBarDemo(){
		setLayout(new BorderLayout());
		//add(messagePanel,BorderLayout.CENTER);
		add(jscbVert,BorderLayout.EAST);
		add(jscbHort,BorderLayout.SOUTH);
		
		jscbHort.addAdjustmentListener(new AdjustmentListener(){
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				double value = jscbHort.getValue();
				double maximumValue = jscbHort.getMaximum();
		/*		double newX = (value * messagePanel.getWidth() /
						maximumValue);
				messagePanel.setXCoordinate((int)newX);*/
			}
		});
		
		jscbVert.addAdjustmentListener(new AdjustmentListener(){
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				double value = jscbVert.getValue();
				double maximumValue = jscbVert.getMaximum();
				/*double newY = (value * messagePanel.getWidth() /
						maximumValue);
				messagePanel.setXCoordinate((int)newY);*/
			}
		});
	}
}