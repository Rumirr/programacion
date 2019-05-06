/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemet;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo Pereira Kurpel
 */
public class Tablas extends JFrame {
    
    private JTable tabla;
    private DefaultTableModel modelo;
    
    public Tablas() {
        setTitle("Ejemplo 1");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        tabla = new JTable();
        
        String[] cabecera = {"Fecha", "Temperatura (ºC)", "Humedad (%)"};
        String[][] datos = {
            {"15/04/2019, 08:00", "19", "45"},
            {"16/04/2019, 08:00", "20", "48"},
            {"17/04/2019, 08:00", "21", "48"}
        };
        
        modelo = new DefaultTableModel(datos, cabecera);
        tabla.setModel(modelo);
        
        JScrollPane panelTabla = new JScrollPane(tabla);
        panelTabla.setPreferredSize(new Dimension(550, 200));
        
        JButton btnAddFila = new JButton("Añadir fila");
        btnAddFila.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // añade una fila a la tabla.
                String[] fila = {"22/04/2019, 08:00", "21", "50"};
                modelo.addRow(fila);
            }
        });
        
        JButton btnDelFila = new JButton("Eliminar fila");
        btnDelFila.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // Borra la última fila de la tabla.
                int ultimafila = modelo.getRowCount() - 1;
                if (ultimafila >= 0) {
                    modelo.removeRow(ultimafila);
                }
            }
        });
        
        
        JButton btnEditFila = new JButton("Editar fila");
        btnEditFila.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (modelo.getRowCount() > 0) {
                    modelo.setValueAt(15, 0, 1);
                }
            }
        });
        
        
        
        add(panelTabla);
        add(btnAddFila);
        add(btnDelFila);
        add(btnEditFila);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Tablas();
    }
    
}
