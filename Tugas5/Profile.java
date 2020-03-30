/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


class Profile extends JFrame {

    String nama, jenkel, agama, hobby;
    final JTextField fnama = new JTextField(10);

    JLabel lnama = new JLabel(" Nama Lengkap ");
    JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");

    JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
    JRadioButton rbWanita = new JRadioButton("Perempuan ");

    JLabel lagama = new JLabel(" Agama ");
    String[] namaAgama
            = {"Islam", "Hindu", "Buddha", "Kristen", "Katholik"};
    JComboBox cmbAgama = new JComboBox(namaAgama);

    JLabel lhobby = new JLabel(" Hobby ");

    JCheckBox cbSepakbola = new JCheckBox(" Sepakbola ");
    JCheckBox cbBasket = new JCheckBox(" Basket ");

    JButton btnSave = new JButton("OK");


    public Profile() {
        setTitle("Profile");
        setDefaultCloseOperation(3);
        setSize(350, 200);

        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);

        setLayout(null);
        add(lnama);
        add(fnama);
        add(ljeniskelamin);
        add(rbPria);
        add(rbWanita);
        add(lagama);
        add(cmbAgama);
        add(lhobby);
        add(cbSepakbola);
        add(cbBasket);
        add(btnSave);
    

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fnama.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Isi Nama Anda");
                } else {
                    nama = fnama.getText();
                }

                if (rbPria.isSelected()) {
                    jenkel = rbPria.getText();
                } else if (rbWanita.isSelected()) {
                    jenkel = rbWanita.getText();
                }

                agama = (String) cmbAgama.getSelectedItem();

                if (cbBasket.isSelected()) {
                    hobby = cbBasket.getText();
                } else if (cbSepakbola.isSelected()) {
                    hobby = cbSepakbola.getText();
                } else {
                    JOptionPane.showMessageDialog(null, "Isi Hobby Anda");
                }
                new Halamanakhir(nama, jenkel, agama, hobby);

                dispose();

            }
        });

        lnama.setBounds(10, 10, 120, 20);
        fnama.setBounds(130, 10, 150, 20);
        ljeniskelamin.setBounds(10, 35, 120, 20);
        rbPria.setBounds(130, 35, 100, 20);
        rbWanita.setBounds(230, 35, 100, 20);
        lagama.setBounds(10, 60, 150, 20);
        cmbAgama.setBounds(130, 60, 150, 20);
        lhobby.setBounds(10, 85, 120, 20);
        cbSepakbola.setBounds(130, 85, 100, 20);
        cbBasket.setBounds(230, 85, 150, 20);
        btnSave.setBounds(100, 130, 120, 20);
        

        setVisible(true);

    }
}