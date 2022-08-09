
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class scores extends javax.swing.JFrame {
    /*
     * Creates new form scores
     */
    public scores() {
        initComponents();
        getScore();
    }

    /*
     * function to close the screen after switching scenes
     */
    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    String score;
    public int s;

    public void getScore() {

        try {
            // SELECT , `SCORE` FROM `login` ORDER BY `Score` DESC LIMIT 3
            PreparedStatement ps;
            ResultSet rs;
            String query = "SELECT * FROM login ORDER BY score DESC;";
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/brick_game", "root", "");
            // Connection c = dbconnect.getConnection();
            ps = c.prepareStatement(query);
            rs = ps.executeQuery();
            rs.next();
            score = rs.getString("Score");
            jLabels1.setText(score);
            rs.next();
            score = rs.getString("Score");
            jLabels2.setText(score);
            rs.next();
            score = rs.getString("Score");
            jLabels3.setText(score);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelhead = new javax.swing.JLabel();
        jLabels1 = new javax.swing.JLabel();
        jLabels2 = new javax.swing.JLabel();
        jLabels3 = new javax.swing.JLabel();
        jButtonbk = new javax.swing.JButton();
        jButtonrefr = new javax.swing.JButton();
        jButtonreset = new javax.swing.JButton();
        jLabeli = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(692, 592));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabelhead.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabelhead.setText("Leaderboard");

        jLabels1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabels1.setText("Top score 1   " + score);

        jLabels2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabels2.setText("Top score 2   " + score);

        jLabels3.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabels3.setText("Top score 3   " + score);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(169, 169, 169)
                                                .addComponent(jLabelhead))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(51, 51, 51)

                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabels2)
                                                        .addComponent(jLabels1)
                                                        .addComponent(jLabels3))))
                                .addContainerGap(70, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabelhead)
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabels1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabels2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabels3))
                                .addContainerGap(75, Short.MAX_VALUE)));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 20, 640, 441);

        jButtonbk.setBackground(new java.awt.Color(102, 102, 102));
        jButtonbk.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButtonbk.setForeground(new java.awt.Color(255, 255, 255));
        jButtonbk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Knob Left.png"))); // NOI18N
        jButtonbk.setText("Return");
        jButtonbk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonbk);
        jButtonbk.setBounds(30, 490, 160, 43);

        jButtonrefr.setBackground(new java.awt.Color(102, 102, 102));
        jButtonrefr.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButtonrefr.setForeground(new java.awt.Color(255, 255, 255));
        jButtonrefr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Knob Loop On.png"))); // NOI18N
        jButtonrefr.setText("Refresh");
        jButtonrefr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonrefr);
        jButtonrefr.setBounds(490, 490, 160, 43);

        jButtonreset.setBackground(new java.awt.Color(102, 102, 102));
        jButtonreset.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButtonreset.setForeground(new java.awt.Color(255, 255, 255));
        jButtonreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Knob Remove Red.png"))); // NOI18N
        jButtonreset.setText("reset");
        jButtonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonrstActionPerformed(evt);
            }

            private void jButtonrstActionPerformed(ActionEvent evt) {
                // Connection con = null;

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/brick_game", "root", "");
                    // the mysql insert statement
                    String query = " DELETE FROM login;";
                    // create the mysql insert preparedstatement
                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    // execute the preparedstatement
                    preparedStmt.execute();

                    con.close();

                } catch (Exception ex) {

                }

            }
        });
        getContentPane().add(jButtonreset);
        jButtonreset.setBounds(250, 490, 160, 43);

        jLabeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bg.jpg"))); // NOI18N
        jLabeli.setText("jLabel4");
        jLabeli.setPreferredSize(new java.awt.Dimension(692, 592));
        getContentPane().add(jLabeli);
        jLabeli.setBounds(-170, 0, 880, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        getScore();
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        close();
    }// GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonrefr;
    private javax.swing.JButton jButtonbk;
    private javax.swing.JButton jButtonreset;

    private javax.swing.JLabel jLabelhead;
    private javax.swing.JLabel jLabels1;
    private javax.swing.JLabel jLabels2;
    private javax.swing.JLabel jLabels3;
    private javax.swing.JLabel jLabeli;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
/*
 * Data base queries to:
 * create database brick_game;
 * use brick_game;
 * create table login(score int(5) default 0);
 */