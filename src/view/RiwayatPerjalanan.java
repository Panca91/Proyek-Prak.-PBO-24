package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Color;


public class RiwayatPerjalanan extends JFrame{
    JFrame frame = new JFrame("JDBC");
    JLabel lJudul = new JLabel("RIWAYAT PEMESANAN TIKET");
    public JTable tabel;
    DefaultTableModel model;
    JScrollPane scrollPane;
    public Object kolom[] = {"NIK", "Nama", "Alamat", "NoTelfon", "asal", "tujuan", "kelas", "tanggal", "Harga"};
    public JButton bKembali = new JButton("Kembali");
    
    public RiwayatPerjalanan(){
        model = new DefaultTableModel(kolom, 0);
        tabel = new JTable(model);
        scrollPane = new JScrollPane(tabel);
        add (lJudul);
        
        setTitle("Riwayat Perjalanan");
        setSize(700, 500);
        setVisible(true);
        setLayout(null);
        add(scrollPane);
        add(bKembali);

        lJudul.setFont(new java.awt.Font("Couture", 5, 24));
        lJudul.setForeground(new Color(5, 204, 153));
        lJudul.setBounds(100,15,400,40);

        
        scrollPane.setBounds(40, 70, 600, 100);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        bKembali.setBounds(40, 200, 100, 30);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
}
