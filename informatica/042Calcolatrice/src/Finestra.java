import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Finestra extends  JFrame implements ActionListener {
	
	JLabel lNum1;
	JLabel lNum2;
	JTextField tNum1;
	JTextField tNum2;
	JButton somma;
	JButton differenza;
	JButton moltiplicazione;
	JButton divisione;
	JLabel lRisultato;
	JTextField tRisultato;
	
	public Finestra()
	{
		setSize(800,600);
		setLocation(200, 200);
		setTitle("Calcolatrice");
		initComponets();
		//pack();
		JPanel myPanel = new JPanel();
		//myPanel.setBackground(Color.BLUE);
		Container container = this.getContentPane();
		container.add(myPanel);
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 }
	
	private void initComponets() {
		// TODO Auto-generated method stub
		this.setLayout(new FlowLayout());

		lNum1 = new JLabel("numero 1 ");
		this.add(lNum1);

		tNum2 = new JTextField(5);
		this.add(tNum2);

		lNum2 = new JLabel("numrero 2: ");
		this.add(lNum2);

		tNum1 = new JTextField(5);
		this.add(tNum1);


		somma = new JButton("somma");
		this.add(somma);

		differenza = new JButton("differenza");
		this.add(differenza);

		moltiplicazione = new JButton("moltiplicazione");
		this.add(moltiplicazione);

		divisione = new JButton("divisione");
		this.add(divisione);

		lRisultato = new JLabel("Risultato");
		this.add(lRisultato);

		tRisultato = new JTextField(5);
		this.add(tRisultato);


		somma.addActionListener(this);
		differenza.addActionListener(this);
		moltiplicazione.addActionListener(this);
		divisione.addActionListener(this);
	}
	
	//@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		double num;
		if (ae.getSource() == somma)
		{
			num = Integer.parseInt(tNum1.getText()) + Integer.parseInt(tNum2.getText());

			tRisultato.setText(String.valueOf(num));
		}

		if (ae.getSource() == differenza)
		{
			num = Integer.parseInt(tNum1.getText()) - Integer.parseInt(tNum2.getText());

			tRisultato.setText(String.valueOf(num));
		}

		if (ae.getSource() == moltiplicazione)
		{
			num = Integer.parseInt(tNum1.getText()) * Integer.parseInt(tNum2.getText());

			tRisultato.setText(String.valueOf(num));
		}

		if (ae.getSource() == divisione)
		{
			num = Integer.parseInt(tNum1.getText()) / Integer.parseInt(tNum2.getText());

			tRisultato.setText(String.valueOf(num));
		}

	}
	
	public static void main(String[] args)
	{
		Finestra fs = new Finestra();
	}
}
