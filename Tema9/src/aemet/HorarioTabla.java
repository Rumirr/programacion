/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemet;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo Pereira Kurpel
 */
public class HorarioTabla extends JFrame {
    
    private JTable tabla;
    private DefaultTableModel modelo;
    
    public HorarioTabla() {
        setTitle("Horario");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        tabla = new JTable();
        String[] cabecera = {"Horas", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        String[][] filas = {
            {"15:10", "PROG", "SI", "SI", "PROG", "SI"},
            {"16:05", "FOL", "PROG", "SI", "PROG", "SI"},
            {"17:00", "FOL", "BD", "BD", "BD", "PROG"},
            {"17:55", "PATIO", "PATIO", "PATIO", "PATIO", "PATIO"},
            {"18:15", "LM", "BD", "FOL", "BD", "BD"},
            {"19:10", "LM", "LM", "PROG", "ED", "BD"},
            {"20:05", "BD", "LM", "PROG", "ED", "ED"},};
        
        modelo = new DefaultTableModel(filas, cabecera);
        tabla.setModel(modelo);
        
        JScrollPane panelTabla = new JScrollPane(tabla);
        panelTabla.setPreferredSize(new Dimension(500, 150));
        
        add(panelTabla);

        setVisible(true);
    }
    
    public static void main(String[] args) {
        new HorarioTabla();
    }
}
