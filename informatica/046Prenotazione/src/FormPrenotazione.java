/*
Autore: Zhuo Chenxi
Data: 2020/3/05
Compito Informatica
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Component;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;


public class FormPrenotazione extends  JFrame implements ActionListener {

    public static final String FILE_PATH = ".\\prenotazioni.csv";
    private List <Prenotazione> aPrenotazioni;
    JLabel lNome, lCognome, lTelefono, lCitta1, lCitta2, lData;
    JTextField tNome, tCognome, tTelefono, tCitta1, tCitta2, tData;
    JButton okButton, cancelButton, saveButton, stampaButton;
    public FormPrenotazione()
    {
        aPrenotazioni = new ArrayList<>();
        setSize(500,300);
        setLocation(200, 200);
        setTitle("Prenotazione");

        initComponets();
        //pack();

        //myPanel.setBackground(Color.BLUE);
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    private void initComponets() {
        // TODO Auto-generated method stub

        Container container = this.getContentPane();

        JPanel centerPanel = new JPanel();
        BoxLayout centerPanelLayout = new BoxLayout(centerPanel,
                BoxLayout.Y_AXIS);

        BoxLayout PanelLayout = new BoxLayout(centerPanel,
                BoxLayout.LINE_AXIS);

        centerPanel.setLayout(centerPanelLayout);
        centerPanel.add(Box.createVerticalStrut(50));

        //Panel per il cognome
        lCognome = new JLabel(" Cognome:  ");
        lCognome.setAlignmentX(Component.CENTER_ALIGNMENT);


        tCognome = new JTextField();
        tCognome.setAlignmentX(Component.CENTER_ALIGNMENT);
        tCognome.setMaximumSize(new Dimension(250,20));

        JPanel cognomePanel = new JPanel();
        cognomePanel.setLayout(new BoxLayout(cognomePanel, BoxLayout.X_AXIS));

        cognomePanel.add(lCognome);
        cognomePanel.add(tCognome);

        //Panel per il nome
        lNome = new JLabel("       Nome:   ");
        lNome.setAlignmentX(Component.CENTER_ALIGNMENT);

        tNome = new JTextField();
        tNome.setAlignmentX(Component.CENTER_ALIGNMENT);
        tNome.setMaximumSize(new Dimension(250,20));

        JPanel nomePanel = new JPanel();
        nomePanel.setLayout(new BoxLayout(nomePanel, BoxLayout.X_AXIS));
        nomePanel.add(lNome);
        nomePanel.add(tNome);

        //Panel per il telefono
        lTelefono = new JLabel("Telefono:    ");
        lTelefono.setAlignmentX(Component.CENTER_ALIGNMENT);

        tTelefono = new JTextField();
        tTelefono.setAlignmentX(Component.CENTER_ALIGNMENT);
        tTelefono.setMaximumSize(new Dimension(250,20));

        JPanel telefonoPanel = new JPanel();
        telefonoPanel.setLayout(new BoxLayout(telefonoPanel, BoxLayout.X_AXIS));
        telefonoPanel.add(lTelefono);
        telefonoPanel.add(tTelefono);

        //Panel per la città di partenza
        lCitta1 = new JLabel("citta'partenza:");
        lCitta1.setAlignmentX(Component.CENTER_ALIGNMENT);

        tCitta1 = new JTextField(20);
        tCitta1.setAlignmentX(Component.CENTER_ALIGNMENT);
        tCitta1.setMaximumSize(new Dimension(250,20));

        JPanel cittaPanel = new JPanel();
        cittaPanel.setLayout(new BoxLayout(cittaPanel, BoxLayout.X_AXIS));
        cittaPanel.add(lCitta1);
        cittaPanel.add(tCitta1);

        //Panel per la città di destinazione
        lCitta2 = new JLabel("citta'destinazione:");
        lCitta2.setAlignmentX(Component.CENTER_ALIGNMENT);

        tCitta2 = new JTextField(20);
        tCitta2.setAlignmentX(Component.CENTER_ALIGNMENT);
        tCitta2.setMaximumSize(new Dimension(250,20));

        JPanel cittaPanel2 = new JPanel();
        cittaPanel2.setLayout(new BoxLayout(cittaPanel2, BoxLayout.X_AXIS));
        cittaPanel2.add(lCitta2);
        cittaPanel2.add(tCitta2);

        //Panel per la data
        lData = new JLabel("citta'destinazione:");
        lData.setAlignmentX(Component.CENTER_ALIGNMENT);

        tData = new JTextField(20);
        tData.setAlignmentX(Component.CENTER_ALIGNMENT);
        tData.setMaximumSize(new Dimension(250,20));

        JPanel dataPanel = new JPanel();
        dataPanel.setLayout(new BoxLayout(dataPanel, BoxLayout.X_AXIS));
        dataPanel.add(lData);
        dataPanel.add(tData);

        centerPanel.add(cognomePanel);
        centerPanel.add(nomePanel);
        centerPanel.add(telefonoPanel);
        centerPanel.add(cittaPanel);
        centerPanel.add(cittaPanel2);
        centerPanel.add(dataPanel);

         okButton = new JButton("conferma");
         cancelButton = new JButton("annula");
        saveButton = new JButton("save");
        stampaButton = new JButton("stampa");
        JPanel south_Panel = new JPanel();

        south_Panel.add(okButton);
        south_Panel.add(cancelButton);
        south_Panel.add(saveButton);
        south_Panel.add(stampaButton);

        container.add(centerPanel);
        container.add(south_Panel, BorderLayout.SOUTH);

        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
        saveButton.addActionListener(this);
        stampaButton.addActionListener(this);


    }

    //@Override
    public void actionPerformed(ActionEvent ae) {
        // TODO Auto-generated method stub
        if (ae.getSource() == okButton){
            salva();
        }
        if (ae.getSource() == cancelButton){
            cancella();
        }
        if(ae.getSource() == saveButton){
            salvaCSV();
        }
        if(ae.getSource() == stampaButton)
        {
            stampa();
        }


    }

    public void salva() {
        aPrenotazioni.add(new Prenotazione(tCognome.getText(), tNome.getText(), tTelefono.getText(), tCitta1.getText(), tCitta2.getText(), tData.getText()));
        JOptionPane.showMessageDialog(null, "prenotazione salvata");
    }

    public void salvaCSV() {
        String str = "";
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(FILE_PATH));

            for (Prenotazione prenotazione : aPrenotazioni) {
                str += prenotazione.csv();
            }
            bw.write(str);
            bw.close();
            JOptionPane.showMessageDialog(null, "prenotazione scaricata");
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void cancella() {
        tCognome.setText("");
        tNome.setText("");
        tTelefono.setText("");
        tCitta1.setText("");
        tCitta2.setText("");
        tData.setText("");
    }

    public void stampa() {
        String str = "";
        for (Prenotazione prenotazione : aPrenotazioni) str += prenotazione.csv() + "\n";
        JOptionPane.showMessageDialog(null, str);
    }



    public static void main(String[] args)
    {
        FormPrenotazione fs = new FormPrenotazione();
    }
}
