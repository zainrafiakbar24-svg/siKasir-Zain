/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package utmj.zainkasir;

/**
 *
 * @author RafiAkbarZain
 */
import javax.swing.JFrame;
import java.awt.Color;

public class ZainKasir extends JFrame {
    public ZainKasir() {
        setTitle("“Kasir Zain” — Aplikasi Kasir Toko");
        setSize(420, 320);
        //        Mengatur Warna Background
        getContentPane().setBackground(new Color(255, 192, 203));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);        
    }

    public static void main(String[] args) {
        new ZainKasir().setVisible(true);
    }


}
