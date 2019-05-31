/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya;

import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Gustavo Pereira Kurpel
 */
public class Ventana extends javax.swing.JFrame {

    private enum xOc {
        x, c
    }
    private static xOc turno = xOc.x;
    private static ArrayList<JLabel> casillas = new ArrayList<JLabel>();

    private static ImageIcon x_icon = new ImageIcon("img/x.svg");
    private static ImageIcon c_icon = new ImageIcon("img/circulo.png");

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();

        casillas.add(lblCasilla1);
        casillas.add(lblCasilla2);
        casillas.add(lblCasilla3);
        casillas.add(lblCasilla4);
        casillas.add(lblCasilla5);
        casillas.add(lblCasilla6);
        casillas.add(lblCasilla7);
        casillas.add(lblCasilla8);
        casillas.add(lblCasilla9);

        c_icon = new ImageIcon(c_icon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH));
    }

    private JLabel getClickedJLabel(Point mousePosition) {

        for (JLabel casilla : casillas) {

            if (casilla.getX() < mousePosition.getX()
                    && (casilla.getWidth() + casilla.getX()) > mousePosition.getX()
                    && casilla.getY() < mousePosition.getY()
                    && (casilla.getHeight() + casilla.getY()) > mousePosition.getY()) {

                return casilla;
            }

        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCasilla1 = new javax.swing.JLabel();
        lblCasilla2 = new javax.swing.JLabel();
        lblCasilla3 = new javax.swing.JLabel();
        lblCasilla4 = new javax.swing.JLabel();
        lblCasilla5 = new javax.swing.JLabel();
        lblCasilla6 = new javax.swing.JLabel();
        lblCasilla7 = new javax.swing.JLabel();
        lblCasilla8 = new javax.swing.JLabel();
        lblCasilla9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tres en raya");
        setMinimumSize(new java.awt.Dimension(403, 452));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(3, 3));

        lblCasilla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla1.setText("jLabel1");
        lblCasilla1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla1);

        lblCasilla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla2.setText("jLabel4");
        lblCasilla2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla2);

        lblCasilla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla3.setText("jLabel2");
        lblCasilla3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla3);

        lblCasilla4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla4.setText("jLabel3");
        lblCasilla4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla4);

        lblCasilla5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla5.setText("jLabel7");
        lblCasilla5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla5);

        lblCasilla6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla6.setText("jLabel5");
        lblCasilla6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla6);

        lblCasilla7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla7.setText("jLabel6");
        lblCasilla7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla7);

        lblCasilla8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla8.setText("jLabel8");
        lblCasilla8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla8);

        lblCasilla9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla9.setText("jLabel9");
        lblCasilla9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla9);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

        JLabel lbltmp = getClickedJLabel(evt.getPoint());

        if (lbltmp != null) {
            lbltmp.setText("");
            if (turno == xOc.x) {
                lbltmp.setIcon(x_icon);
                turno = xOc.c;
            } else {
                lbltmp.setIcon(c_icon);
                turno = xOc.x;
            }

        }

    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCasilla1;
    private javax.swing.JLabel lblCasilla2;
    private javax.swing.JLabel lblCasilla3;
    private javax.swing.JLabel lblCasilla4;
    private javax.swing.JLabel lblCasilla5;
    private javax.swing.JLabel lblCasilla6;
    private javax.swing.JLabel lblCasilla7;
    private javax.swing.JLabel lblCasilla8;
    private javax.swing.JLabel lblCasilla9;
    // End of variables declaration//GEN-END:variables
}
