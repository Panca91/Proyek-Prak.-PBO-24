package view;

import control.ControlTiket;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import model.ModelTiket;


public class Menu extends JFrame implements ActionListener{
    JLabel lJudul = new JLabel(" PEMESANAN TIKET KERETA API");
    JButton btnPesan = new JButton("PESAN TIKET");
    JButton btnRiwayat = new JButton("RIWAYAT PENUMPANG");
    
    public Menu(){
        setTitle("Pembelian Tiket Kereta Api");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(580,250);
	setLayout(null);
        add (lJudul);
	add(btnPesan);
        add(btnRiwayat);

        lJudul.setFont(new java.awt.Font("Couture", 5, 24));
        lJudul.setForeground(new Color(10, 100, 103));
        
	lJudul.setBounds(100,2,400,40);
	btnPesan.setBounds(100,100,180,50);
        btnRiwayat.setBounds(300,100,180,50);
        
        btnPesan.addActionListener(this);
        btnRiwayat.addActionListener(this);
        
      	setVisible(true);
        setLocationRelativeTo(null);
        

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnRiwayat) {
            dispose();
            RiwayatPerjalanan rp = new RiwayatPerjalanan();
            ModelTiket mt = new ModelTiket();
            EditData ed = new EditData();
            
            ed.dispose();
            InputData id = new InputData();
            id.dispose();

            ControlTiket ct = new ControlTiket(mt, ed, id, rp);
                
        }
        if (ae.getSource() == btnPesan) {
            RiwayatPerjalanan rp = new RiwayatPerjalanan();
            rp.dispose();
            dispose();
            ModelTiket mt = new ModelTiket();
            EditData ed = new EditData();
            ed.dispose();
            InputData id = new InputData();
         ControlTiket ct = new ControlTiket(mt, ed, id, rp);
        }
    }
}
