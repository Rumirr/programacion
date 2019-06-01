/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya;

import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.Icon;
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
    private static int casillasMarcadas = 0;

    private static ArrayList<JLabel> casillas = new ArrayList<JLabel>();

    private static ImageIcon x_icon = new ImageIcon("img/x.png");
    private static ImageIcon c_icon = new ImageIcon("img/circulo.png");

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();

        setLocationRelativeTo(null);

        casillas.add(lblCasilla1);
        casillas.add(lblCasilla2);
        casillas.add(lblCasilla3);
        casillas.add(lblCasilla4);
        casillas.add(lblCasilla5);
        casillas.add(lblCasilla6);
        casillas.add(lblCasilla7);
        casillas.add(lblCasilla8);
        casillas.add(lblCasilla9);
        casillas.forEach((casilla) -> {
            Double d = Math.random();

            casilla.setName(d.toString());
        });

        x_icon = new ImageIcon(x_icon.getImage().getScaledInstance(48, 48, Image.SCALE_SMOOTH));
        c_icon = new ImageIcon(c_icon.getImage().getScaledInstance(48, 48, Image.SCALE_SMOOTH));
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

    private void resetea() {
        casillasMarcadas = 0;
        casillas.forEach((casilla) -> {
            Double d = Math.random();

            casilla.setName(d.toString());
            casilla.setIcon(null);
        });
    }

    private JLabel compruebaGanador(ArrayList<JLabel> lista) {

        // lineas horizontales
        //arriba
        if ((lista.get(0).getName().equalsIgnoreCase(lista.get(1).getName()) && lista.get(0).getName().equalsIgnoreCase(lista.get(2).getName()))) {
//            System.out.println("lineas horizontales: arriba");

            return lista.get(0);
        } else //medio
        if (lista.get(3).getName().equalsIgnoreCase(lista.get(4).getName()) && lista.get(3).getName().equalsIgnoreCase(lista.get(5).getName())) {
//            System.out.println("lineas horizontales medio");
            return lista.get(3);
        } else //abajo
        if (lista.get(6).getName().equalsIgnoreCase(lista.get(7).getName()) && lista.get(6).getName().equalsIgnoreCase(lista.get(8).getName())) {
//            System.out.println("lineas horizontales: abajo");
            return lista.get(6);
        } else // lineas verticales
        //
        if (lista.get(0).getName().equalsIgnoreCase(lista.get(3).getName()) && lista.get(0).getName().equalsIgnoreCase(lista.get(6).getName())) {
//            System.out.println("lineas verticales izquierda");
            return lista.get(0);
        } else //medio
        if (lista.get(1).getName().equalsIgnoreCase(lista.get(4).getName()) && lista.get(1).getName().equalsIgnoreCase(lista.get(7).getName())) {
//            System.out.println("lineas verticales medio");
            return lista.get(1);
        } else //derecha
        if (lista.get(2).getName().equalsIgnoreCase(lista.get(5).getName()) && lista.get(2).getName().equalsIgnoreCase(lista.get(8).getName())) {
//            System.out.println("lineas verticales derecha");
            return lista.get(2);
        } else // linesa diagonales
        //arriba izquierda
        if (lista.get(0).getName().equalsIgnoreCase(lista.get(4).getName()) && lista.get(0).getName().equalsIgnoreCase(lista.get(8).getName())) {
//            System.out.println("linesa diagonales arriba izquierda");
            return lista.get(0);
        } else //arriba derecha
        if (lista.get(2).getName().equalsIgnoreCase(lista.get(4).getName()) && lista.get(2).getName().equalsIgnoreCase(lista.get(6).getName())) {
//            System.out.println("linesa diagonales arriba derecha");
            return lista.get(2);
        } else {
//            System.out.println("nada");
            return null;
        }

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
        lblCasilla1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla1);

        lblCasilla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla2);

        lblCasilla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla3);

        lblCasilla4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla4);

        lblCasilla5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla5);

        lblCasilla6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla6);

        lblCasilla7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla7);

        lblCasilla8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla8);

        lblCasilla9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasilla9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCasilla9);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

        JLabel lbltmp = getClickedJLabel(evt.getPoint());

        if (lbltmp != null && lbltmp.getIcon() == null) {
            if (casillasMarcadas <= 9) {

                if (turno == xOc.x) {
                    // añadiendo la imagen a label
                    lbltmp.setIcon(x_icon);
                    lbltmp.setName("x");

                    // cambiado en turno
                    turno = xOc.c;

                    compruebaGanador(casillas);
                } else {
                    lbltmp.setIcon(c_icon);
                    lbltmp.setName("c");
                    turno = xOc.x;

                    compruebaGanador(casillas);
                }
                casillasMarcadas++;
            }
        }

        if (casillasMarcadas == 9) {
            resetea();
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
