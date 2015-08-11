package graficos;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 * @author maximilianou
 */
public class TestGraphics {

    public static void main(String[] args) {
        System.out.println("[....]TestGraphics");

        DefaultPieDataset dpdata = new DefaultPieDataset();
        dpdata.setValue("Julio", 8);
        dpdata.setValue("Agosto", 14);
        dpdata.setValue("Septiembre", 27);
        dpdata.setValue("Octubre", 32);
        dpdata.setValue("Noviembre", 45);
        dpdata.setValue("Diciembre", 35);
        dpdata.setValue("Enero", 2);
        dpdata.setValue("Febrero", 5);
        dpdata.setValue("Marzo", 15);

        JFreeChart chart = ChartFactory.createPieChart(
                "Ejemplo Grafico de Torta", dpdata, true, true, true);

        ChartFrame marco = new ChartFrame("Primer Reporte", chart);
        marco.pack();
        marco.setVisible(true);

        String sitio = "http://www.maximilianou.com";
        DefaultCategoryDataset cddata = new DefaultCategoryDataset();
        cddata.setValue(8, sitio, "Julio");
        cddata.setValue(14, sitio, "Agosto");
        cddata.setValue(27, sitio, "Septiembre");
        cddata.setValue(32, sitio, "Octubre");
        cddata.setValue(45, sitio, "Noviembre");
        cddata.setValue(35, sitio, "Diciembre");
        cddata.setValue(2, sitio, "Enero");
        cddata.setValue(5, sitio, "Febrero");
        cddata.setValue(15, sitio, "Marzo");


        JFreeChart chart2 = ChartFactory.createLineChart(
                "Primer Grafico De Linea", "Meses", "Personas", cddata, PlotOrientation.VERTICAL, true, true, true);

        ChartFrame marco2 = new ChartFrame("Segundo Reporte", chart2);
        marco2.pack();
        marco2.setVisible(true);
        marco2.setSize(1200,500);


        System.out.println("[ OK ]TestGraphics");
    }
}
