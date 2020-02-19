import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Finestra extends  JFrame implements ActionListener {
	
	
	public Finestra()
	{
		setSize(800,600);
		setLocation(200, 200);
		setTitle("Calcolatrice");

		JPanel centerPanel = new JPanel();
		centerPanel = initComponets();
		//pack();

		//myPanel.setBackground(Color.BLUE);
		Container container = this.getContentPane();
		container.add(centerPanel);
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 }
	
	private JPanel initComponets() {
		// TODO Auto-generated method stub

		JPanel centerPanel = new JPanel();
		BoxLayout centerPanelLayout = new BoxLayout(centerPanel,
				BoxLayout.Y_AXIS);

		BoxLayout PanelLayout = new BoxLayout(centerPanel,
				BoxLayout.LINE_AXIS);

		centerPanel.setLayout(centerPanelLayout);
		JButton button = new JButton("button");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton shortButton = new JButton("short");
		shortButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton IongButton = new JButton("long-long - long button");
		IongButton.setAlignmentX(Component.CENTER_ALIGNMENT);

		JButton okButton = new JButton("ok");
		okButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
		JButton cancelButton = new JButton("cancel");
		cancelButton.setAlignmentX(Component.LEFT_ALIGNMENT);

		centerPanel.add(button);
		centerPanel.add(shortButton);
		centerPanel.add(IongButton);
		centerPanel.add(okButton);
		centerPanel.add(cancelButton);

		return  centerPanel;
	}
	
	//@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub


	}
	
	public static void main(String[] args)
	{
		Finestra fs = new Finestra();
	}
}
