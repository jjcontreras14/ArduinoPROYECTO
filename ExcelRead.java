package LecturaExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) {
	
		File archivo = new File("BPM.xlsx");
		
		try {
			FileInputStream input = new FileInputStream(archivo);
			
			XSSFWorkbook libro = new XSSFWorkbook(input);
			
			XSSFSheet hoja = libro.getSheetAt(0);
			
			Row fila = hoja.getRow(2);
			
			Iterator<Cell> columnas = fila.cellIterator();
			
			while(columnas.hasNext()) {
				
				Cell celda = columnas.next();
				
				if(celda.getCellType()== CellType.NUMERIC) {
					
					double valor = celda.getNumericCellValue();
					
					System.out.println(valor);
				}
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
				

	}

}
