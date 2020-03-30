package Tugas5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Savepoint;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Halamanakhir extends JFrame {

    JLabel getnama = new JLabel();
    JLabel getjenkel = new JLabel();
    JLabel getagama = new JLabel();
    JLabel gethobby = new JLabel();
    String nama, jenkel, agama, hobby;

    Halamanakhir(String nama, String jenkel, String agama, String hobby) {
        setTitle("Data Anda");
        setDefaultCloseOperation(3);
        setSize(350, 200);
        setLayout(null);

        add(getnama);
        add(getjenkel);
        add(getagama);
        add(gethobby);

        nama = nama;
        jenkel = jenkel;
        agama = agama;
        hobby = hobby;
        getnama.setText("Nama  : "+nama);
        getjenkel.setText("Jenis Kelamin : "+jenkel);
        getagama.setText("Agama : "+agama);
        gethobby.setText(nama+" Hobby Bermain "+hobby);

        getnama.setBounds(10, 10, 300, 20);
        getjenkel.setBounds(10, 30, 200, 20);
        getagama.setBounds(10, 50, 200, 20);
        gethobby.setBounds(10, 70, 200, 20);

        setVisible(true);
    }

}