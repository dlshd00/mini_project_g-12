
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class instructions extends javax.swing.JFrame {

    /**
     * Creates new form instructions
     */
    public instructions() {
        initComponents();
        jPanel3.setBackground(new Color(0, 0, 0, 100));
        jTextArea1.setBackground(new Color(240, 240, 240, 159));
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bg.jpg"))); // NOI18N
        jLabel6.setText("jLabel4");
        jLabel6.setPreferredSize(new java.awt.Dimension(692, 592));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bg.jpg"))); // NOI18N
        jLabel7.setText("jLabel4");
        jLabel7.setPreferredSize(new java.awt.Dimension(692, 592));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(692, 592));
        setMinimumSize(new java.awt.Dimension(692, 592));
        setPreferredSize(new java.awt.Dimension(692, 592));
        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(692, 592));

        jTextArea1.setColumns(20);
        String t = " This is a brick-breaker game.\nThe bottom of the screen to move the platform. Avoid the ball from falling to the bottom of the screen.\nIt's a game in which you need to destroy all the bricks.\n\nClassic brick-breaker game.\nUse the paddle in order to keep the ball in the game & hit the bricks. Your mission is remove all the breakable bricks by hitting them with the ball. Some bricks need more than a single hit.\n\nGame controls:\n- Move paddle: side arrow keys\n- Launch ball: press enter\n\nGame Instructions:\nUse the platform to keep the ball in the screen. Break all the bricks by hitting them with the ball ";
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText(t);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setEnabled(false);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 140, 620, 320);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Knob Left.png"))); // NOI18N
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 490, 160, 43);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INSTRUCTIONS");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 20, 420, 70);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(100, 20, 470, 100);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bg.jpg"))); // NOI18N
        jLabel9.setText("jLabel4");
        jLabel9.setPreferredSize(new java.awt.Dimension(692, 592));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-170, 0, 920, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        close();
    }// GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
