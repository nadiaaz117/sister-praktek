/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadia200923;

/**
 *
 * @author user
 */
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class BannerThread extends JFrame {
    private String bannerText;
    private int xCoordinate;
    private static final int DELAY = 50; // Delay dalam milidetik

    public BannerThread(String text) {
        this.bannerText = text;
        this.xCoordinate = -getWidth(); // Mulai dari luar layar kiri
        initUI();
    }

    private void initUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 100));
        pack();
        setLocationRelativeTo(null);

        Timer timer = new Timer(DELAY, e -> {
            xCoordinate += 5; // Menggerakkan teks ke kanan
            repaint();
        });
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.clearRect(0, 0, getWidth(), getHeight());
        g.drawString(bannerText, xCoordinate, getHeight() / 2);
    }

    public static void main(String[] args) {
        String inputText = JOptionPane.showInputDialog("Masukkan teks untuk banner: ");
        SwingUtilities.invokeLater(() -> {
            BannerThread bannerThread = new BannerThread(inputText);
            bannerThread.setVisible(true);
        });

        try {
            TimeUnit.SECONDS.sleep(5); // Biarkan banner berjalan selama 5 detik (opsional)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}