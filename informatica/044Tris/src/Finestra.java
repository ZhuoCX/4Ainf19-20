import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Finestra extends  JFrame implements ActionListener {

	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;

	
	public Finestra()
	{
		setSize(800,600);
		setLocation(200, 200);
		setTitle("Tris");



		Container contentPane = this.getContentPane();;
		contentPane.setLayout(new GridLayout(3,3));
		//crea i pulsanti e li inserisce nella griglia 3x3



		b1 = new JButton("");
		b1.setFont(new Font("Arial", Font.PLAIN, 80));

		b2 = new JButton("");
		b2.setFont(new Font("Arial", Font.PLAIN, 80));

		b3 = new JButton("");
		b3.setFont(new Font("Arial", Font.PLAIN, 80));

		b4 = new JButton("");
		b4.setFont(new Font("Arial", Font.PLAIN, 80));

		b5 = new JButton("");
		b5.setFont(new Font("Arial", Font.PLAIN, 80));

		b6 = new JButton("");
		b6.setFont(new Font("Arial", Font.PLAIN, 80));

		b7 = new JButton("");
		b7.setFont(new Font("Arial", Font.PLAIN, 80));

		b8 = new JButton("");
		b8.setFont(new Font("Arial", Font.PLAIN, 80));

		b9 = new JButton("");
		b9.setFont(new Font("Arial", Font.PLAIN, 80));


		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
		contentPane.add(b4);
		contentPane.add(b5);
		contentPane.add(b6);
		contentPane.add(b7);
		contentPane.add(b8);
		contentPane.add(b9);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);


		contentPane.setBackground(Color.GREEN);
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 }
	

	
	//@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub

		if (ae.getSource() == b1)
		{
			if (b1.getText() == "x")
				b1.setText("o");
			else
				b1.setText("x");
		}

		if (ae.getSource() == b2)
		{
			if (b2.getText() == "x")
				b2.setText("o");
			else
				b2.setText("x");
		}

		if (ae.getSource() == b3)
		{
			if (b3.getText() == "x")
				b3.setText("o");
			else
				b3.setText("x");
		}

		if (ae.getSource() == b4)
		{
			if (b4.getText() == "x")
				b4.setText("o");
			else
				b4.setText("x");
		}

		if (ae.getSource() == b5)
		{
			if (b5.getText() == "x")
				b5.setText("o");
			else
				b5.setText("x");
		}

		if (ae.getSource() == b6)
		{
			if (b6.getText() == "x")
				b6.setText("o");
			else
				b6.setText("x");
		}
		if (ae.getSource() == b7)
		{
			if (b7.getText() == "x")
				b7.setText("o");
			else
				b7.setText("x");
		}

		if (ae.getSource() == b8)
		{
			if (b8.getText() == "x")
				b8.setText("o");
			else
				b8.setText("x");
		}

		if (ae.getSource() == b9)
		{
			if (b9.getText() == "x")
				b9.setText("o");
			else
				b9.setText("x");
		}



	}
	
	public static void main(String[] args)
	{
		Finestra fs = new Finestra();
	}
}
