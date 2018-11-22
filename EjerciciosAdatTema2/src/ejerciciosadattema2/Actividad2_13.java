/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosadattema2;

import com.mysql.jdbc.CommunicationsException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Canales-PC
 */
public class Actividad2_13 {
    public static void main(String[] args) {
		String reportSource = "./plantilla_Actividad2.jrxml";
		String reportHTML = "./Informe.html";
		String reportPDF = "./Informe.pdf";
		String reportXML = "./Informe.xml";

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("titulo", "RESUMEN DATOS DE DEPARTAMENTOS.");
		params.put("autor", "ARM");
		params.put("fecha", (new java.util.Date()).toString());
		try {
			JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ejemplo", "root", "");
			JasperPrint MiInforme = JasperFillManager.fillReport(jasperReport, params, conn);
			// Visualizar en pantalla
			JasperViewer.viewReport(MiInforme);
			// Convertir a HTML
			JasperExportManager.exportReportToHtmlFile(MiInforme, reportHTML);
			// Convertir a PDF
			JasperExportManager.exportReportToPdfFile(MiInforme, reportPDF);
			// Convertir a XML, false es para indicar que no hay im�genes
			// (isEmbeddingImages)
			JasperExportManager.exportReportToXmlFile(MiInforme, reportXML, false);
			System.out.println("ARCHIVOS CREADOS");
		} catch (CommunicationsException c) {
			System.out.println(" Error de comunicaci�n con la BD. No est� arrancada.");
		} catch (ClassNotFoundException e) {
			System.out.println(" Error driver. ");
		} catch (SQLException e) {
			System.out.println(" Error al ejecutar sentencia SQL ");
		} catch (JRException ex) {
			System.out.println(" Error Jasper.");
			ex.printStackTrace();
		}
	}
}
