/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Gustavo Pereira Kurpel
 */
public class IngresosEmpresa extends JFrame {

    private enum meses{
            Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre
        };
    
    public IngresosEmpresa() throws HeadlessException {
        setTitle("Ingresos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JFreeChart chart = crearGrafica();
        
        ChartPanel chartPanel = new ChartPanel(chart);
        add(chartPanel);
        
        pack();
        
        setVisible(true);
        

    }

    public JFreeChart crearGrafica() {
        
        String empresaA = "Empresa A";
        
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.setValue(500, empresaA, meses.Enero);
        dataset.setValue(650.25, empresaA, meses.Febrero);
        dataset.setValue(500.89, empresaA, meses.Marzo);
        dataset.setValue(1000.00, empresaA, meses.Abril);
        dataset.setValue(2000.00, empresaA, meses.Mayo);
        dataset.setValue(5000.00, empresaA, meses.Junio);
        dataset.setValue(5000.00, empresaA, meses.Julio);
        dataset.setValue(5000.00, empresaA, meses.Agosto);
        dataset.setValue(5000.00, empresaA, meses.Septiembre);
        dataset.setValue(5000.00, empresaA, meses.Octubre);
        dataset.setValue(5000.00, empresaA, meses.Noviembre);
        dataset.setValue(5000.00, empresaA, meses.Diciembre);
        
        JFreeChart chart = ChartFactory.createBarChart3D("Ingresos de 2018", "Meses", "Euros (€)", dataset, PlotOrientation.VERTICAL, true, true, false);

        return chart;
    }

    public static void main(String[] args) {
        new IngresosEmpresa();
    }
}
