/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.ImageIcon;

/**
 *
 * @author sofya
 */
public class imageFrame extends javax.swing.JFrame {

    /**
     * Creates new form imageFrame
     */
    ImageIcon sun = new ImageIcon("src/img/sun.jpg");
    ImageIcon earth = new ImageIcon("src/img/earth.jpg");
    ImageIcon moon = new ImageIcon("src/img/moon.jpg");
    ImageIcon mars = new ImageIcon("src/img/mars.jpg");
    ImageIcon venus = new ImageIcon("src/img/venus.jpg");
    ImageIcon mercury = new ImageIcon("src/img/mercury.jpg");
    ImageIcon saturn = new ImageIcon("src/img/saturn.jpg");
    ImageIcon jupiter = new ImageIcon("src/img/jupiter.jpg");
    ImageIcon neptun = new ImageIcon("src/img/neptun.jpg");
    ImageIcon pluto = new ImageIcon("src/img/pluto.jpg");
    ImageIcon uranus = new ImageIcon("src/img/uranus.jpg");
    ImageIcon comet = new ImageIcon("src/img/comet.jpg");
    
    public imageFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        labelPic.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonSun = new javax.swing.JButton();
        buttonEarth = new javax.swing.JButton();
        buttonMoon = new javax.swing.JButton();
        labelPic = new javax.swing.JLabel();
        comboPlanets = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama   :   Sofyan Assauri");

        jLabel2.setText("NPM     :   19630116");

        jLabel3.setText("Kelas   :   5B Non-Reguler Banjarmasin");

        jLabel4.setText("-------------------------------------------------------------------------------------------------------");

        buttonSun.setText("Sun");
        buttonSun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSunActionPerformed(evt);
            }
        });

        buttonEarth.setText("Earth");
        buttonEarth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEarthActionPerformed(evt);
            }
        });

        buttonMoon.setText("Moon");
        buttonMoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoonActionPerformed(evt);
            }
        });

        labelPic.setText("pic");

        comboPlanets.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mars", "Venus", "Mercury", "Jupiter", "Neptun", "Uranus", "Pluto", "Comet", "Saturn" }));
        comboPlanets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPlanetsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 7, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(buttonSun)
                        .addGap(29, 29, 29)
                        .addComponent(buttonEarth)
                        .addGap(18, 18, 18)
                        .addComponent(buttonMoon)
                        .addGap(31, 31, 31)
                        .addComponent(comboPlanets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(labelPic)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSun)
                    .addComponent(buttonEarth)
                    .addComponent(buttonMoon)
                    .addComponent(comboPlanets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelPic)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSunActionPerformed
        // TODO add your handling code here:
        labelPic.setIcon(sun);
    }//GEN-LAST:event_buttonSunActionPerformed

    private void buttonEarthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEarthActionPerformed
        // TODO add your handling code here:
        labelPic.setIcon(earth);
    }//GEN-LAST:event_buttonEarthActionPerformed

    private void buttonMoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoonActionPerformed
        // TODO add your handling code here:
        labelPic.setIcon(moon);
    }//GEN-LAST:event_buttonMoonActionPerformed

    private void comboPlanetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPlanetsActionPerformed
        // TODO add your handling code here:
        //String selectedValue = comboPlanets.getSelectedItem("Venus");
        int planet = comboPlanets.getSelectedIndex();
        if(planet == 0){
            labelPic.setIcon(mars);
        }else if(planet == 1){
            labelPic.setIcon(venus);
        }else if(planet == 2){
            labelPic.setIcon(mercury);
        }else if(planet == 3){
            labelPic.setIcon(jupiter);
        }else if(planet == 4){
            labelPic.setIcon(neptun);
        }else if(planet == 5){
            labelPic.setIcon(uranus);
        }else if(planet == 6){
            labelPic.setIcon(pluto);
        }else if(planet == 7){
            labelPic.setIcon(comet);
        }else if(planet == 8){
            labelPic.setIcon(saturn);
        }
    }//GEN-LAST:event_comboPlanetsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(imageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(imageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(imageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(imageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new imageFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEarth;
    private javax.swing.JButton buttonMoon;
    private javax.swing.JButton buttonSun;
    private javax.swing.JComboBox<String> comboPlanets;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelPic;
    // End of variables declaration//GEN-END:variables
}
