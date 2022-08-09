import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class Homescr extends JFrame {

    public Homescr() {
        initComponents();
        jLabel1.setText("Break it up " + "!!");
        // jLabel1.setText("Hello "+login.name+" !");
        jPanel2.setBackground(new Color(240, 240, 240, 159));
    }

    // function to close the screen after switching scenes
    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    public void initComponents() {

        jLabel5 = new JLabel();
        jPanel3 = new JPanel();
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton4 = new JButton();
        jPanel2 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel1 = new JLabel();
        jLabel6 = new JLabel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jLabel5.setIcon(new ImageIcon(getClass().getResource("/resources/bg.jpg"))); // NOI18N
        jLabel5.setText("jLabel4");
        jLabel5.setPreferredSize(new Dimension(692, 592));

        jPanel3.setBorder(new MatteBorder(null));

        jPanel1.setMinimumSize(new Dimension(692, 592));
        jPanel1.setPreferredSize(new Dimension(692, 592));
        jPanel1.setLayout(null);

        jButton1.setBackground(new Color(102, 102, 102));
        jButton1.setFont(new Font("Comic Sans MS", 0, 22)); // NOI18N
        jButton1.setForeground(new Color(255, 255, 255));
        jButton1.setIcon(new ImageIcon(getClass().getResource("/resources/Knob Play Green.png"))); // NOI18N
        jButton1.setText("PLAY");
        jButton1.setHorizontalTextPosition(SwingConstants.RIGHT);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(280, 280, 140, 41);

        jButton2.setBackground(new Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 22)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Knob Help.png"))); // NOI18N
        jButton2.setText("HOW TO PLAY");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonhActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(240, 480, 230, 41);

        jButton4.setBackground(new Color(102, 102, 102));
        jButton4.setFont(new Font("Comic Sans MS", 0, 22)); // NOI18N
        jButton4.setForeground(new Color(255, 255, 255));
        jButton4.setIcon(new ImageIcon(getClass().getResource("/resources/Knob Favorite.png"))); // NOI18N
        jButton4.setText("SCORES");
        jButton4.setHorizontalTextPosition(SwingConstants.RIGHT);
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(270, 380, 157, 41);

        jPanel2.setBackground(new Color(204, 204, 204));
        jPanel2.setBorder(new MatteBorder(null));
        jPanel2.setLayout(null);
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/resources/logo5.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 20, 160, 80);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo6.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(250, 60, 120, 93);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo7.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 140, 430, 105);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(120, 20, 470, 250);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 29)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 540, 290, 41);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bg.jpg"))); // NOI18N
        jLabel6.setText("jLabel4");
        jLabel6.setPreferredSize(new java.awt.Dimension(692, 592));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(-170, 0, 920, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        pack();
        setResizable(false);
        setDefaultCloseOperation(Homescr.EXIT_ON_CLOSE);
    }// </editor-fold>//GEN-END:initComponents

    public void start(int level) {
        new Gameplay(true, level);
        JFrame jFrame = new JFrame();

        JDialog jd = new JDialog(jFrame);

        jd.setBounds(200, 200, 350, 200);
        JButton jButton = new JButton();

        JLabel t = new JLabel();
        JLabel t1 = new JLabel();

        t.setText("Press (enter) to play ");
        t1.setText("Use side arrow keys to move paddle ");
        t.setFont(new Font("Serif", Font.BOLD, 20));
        t1.setFont(new Font("Serif", Font.BOLD, 20));

        jButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jd.setVisible(false);
            }
        });

        jd.add(jButton);
        JButton jButtonre = new JButton("play");

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 200, 100);
        panel.setBackground(Color.gray);

        jButtonre.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButtonre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Knob Play.png"))); // NOI18N
        jButtonre.setText("play");
        jButtonre.setBackground(Color.BLACK);
        jButtonre.setForeground(Color.white);
        jButtonre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }

            /**
             * @param evt
             */
            public void jButton1ActionPerformed(ActionEvent evt) {
                jd.setVisible(false);

            }
        });

        jButtonre.setBounds(10, 10, 10, 10);
        panel.add(t);
        panel.add(t1);
        panel.add(jButtonre);
        jd.add(panel);
        jd.setVisible(true);
        jd.setAlwaysOnTop(true);

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        level = 1;
        start(level);
        
        this.setVisible(false);

    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButtonhActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        instructions i1 = new instructions();
        i1.setVisible(true);
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        scores s1 = new scores();
        s1.setVisible(true);
    }// GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Homescr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homescr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homescr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homescr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homescr().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public int level;
    // End of variables declaration//GEN-END:variables

}
