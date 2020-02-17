import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Squadra extends  JFrame implements ActionListener {
	
	JLabel Squadra1;
	JLabel Squadra2;
	JLabel Squadra3;
	JLabel Squadra4;
	JTextField tSquadra1;
	JTextField tSquadra2;
	JTextField tSquadra3;
	JTextField tSquadra4;
	JButton bInvia;
	JLabel lCompleto;
	JButton bInvia2;
	JLabel lCompleto2;
	
	public Squadra()
	{
		setSize(800,600);
		setLocation(200, 200);
		setTitle("Squadra Calcio");
		initComponets();
		//pack();
		JPanel myPanel = new JPanel();
		myPanel.setBackground(Color.RED);
		Container container = this.getContentPane();
		container.add(myPanel);
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 }
	
	private void initComponets() {
		// TODO Auto-generated method stub
		this.setLayout(new FlowLayout());
		Squadra1 = new JLabel("Nome Squadra 1: ");
		this.add(Squadra1);
		tSquadra2 = new JTextField(20);
		this.add(tSquadra2);
		Squadra2 = new JLabel("Nome Squadra 2: ");
		this.add(Squadra2);
		tSquadra1 = new JTextField(20);
		this.add(tSquadra1);
		bInvia= new JButton("Invia");
		this.add(bInvia);
		lCompleto = new JLabel("squadra1 vs squadra2");
		this.add(lCompleto);
		bInvia.addActionListener(this);

		this.setLayout(new FlowLayout());
		Squadra3 = new JLabel("Nome Squadra 3: ");
		this.add(Squadra3);
		tSquadra4 = new JTextField(20);
		this.add(tSquadra4);
		Squadra2 = new JLabel("Nome Squadra 4: ");
		this.add(Squadra2);
		tSquadra3 = new JTextField(20);
		this.add(tSquadra3);
		bInvia2= new JButton("Invia");
		this.add(bInvia2);
		lCompleto2 = new JLabel("squadra3 vs squadra4");
		this.add(lCompleto2);
		bInvia2.addActionListener(this);


	}
	
	//@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (ae.getSource() == bInvia)
		{
			lCompleto.setText(tSquadra2.getText()+" "+ tSquadra1.getText());
		}
	}
	
	public static void main(String[] args)
	{
		Squadra fs = new Squadra();
	}
}
