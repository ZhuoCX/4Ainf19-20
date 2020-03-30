/*
Autore: Zhuo Chenxi
Data: 2020/3/30
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


class ListaPersone extends JFrame implements ActionListener {

    JLabel lNome, lCognome;
    JTextField tNome, tCognome;
    JButton bAdd;
    JList<String> jClasseLista;
    DefaultListModel<String> classeModel;
    JComboBox<String> jComboBoxLista;
    DefaultComboBoxModel<String> comboBoxModelLista;
    ArrayList<String> lLista;

    public ListaPersone() {
        setTitle("Classe lista");
        lLista = new ArrayList<String>();
        initComponents();
        setSize(605,400);
        setLocation(570,550);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void initComponents() {
        Container container = this.getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,
                BoxLayout.Y_AXIS));

        lCognome = new JLabel("Cognome:");
        tCognome = new JTextField();
        tCognome.setMaximumSize(new Dimension(200,20));
        panel.add(lCognome);
        panel.add(tCognome);
        lNome = new JLabel("Nome:");
        tNome = new JTextField();
        tNome.setMaximumSize(new Dimension(200,20));
        panel.add(lNome);
        panel.add(tNome);


        JPanel panelLista = new JPanel();
        panelLista.setLayout(new FlowLayout());
        classeModel = new DefaultListModel<>();
        jClasseLista= new JList<>(classeModel);
        jClasseLista.setVisibleRowCount(5);
        JScrollPane scrollList = new JScrollPane(jClasseLista);
        panelLista.add(scrollList);
        comboBoxModelLista = new DefaultComboBoxModel<>();
        jComboBoxLista = new JComboBox<>(comboBoxModelLista);
        jComboBoxLista.setPrototypeDisplayValue("                            ");
        jComboBoxLista.setMaximumRowCount(3);
        JScrollPane scrollComboBox = new JScrollPane(jComboBoxLista);
        panelLista.add(scrollComboBox);
        panel.add(panelLista);

        JPanel panel2 = new JPanel();
        bAdd = new JButton("Aggiungi");
        bAdd.setAlignmentX(CENTER_ALIGNMENT);


        bAdd.addActionListener(this);
        panel2.add(bAdd);
        panel.add(panel2);

        container.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bAdd) add();
    }

    public void add() {
        lLista.add(lLista.size(), tCognome.getText() + " " + tNome.getText());
        classeModel.add(classeModel.getSize(), tCognome.getText() + " " + tNome.getText());
        comboBoxModelLista.addElement(tCognome.getText() + " " + tNome.getText());

        tCognome.setText("");
        tNome.setText("");
    }

    public static void main(String[] args) {
        ListaPersone lp = new ListaPersone();
    }
}