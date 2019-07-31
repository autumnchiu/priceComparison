import java.util.ArrayList;
import java.util.Collections;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProductOrganizer {
	
	// late night thinkin: maybe this should come in an excel sheet 
	// with the links, we read the links, and write to the same spreadsheet?
	// could potentially gather other info from link too? ---> expansion idea
	
	
	
	
	// probs: where would we read the file from? 
	
	ArrayList<Product> products;
	
	public ProductOrganizer(ArrayList<Product> products) {
		this.products = products;
		
		// automatically sorts the products given in the arraylist
		Collections.sort(products);
		
		//export to excel
		this.writeToExcel();
	}
	
	private void writeToExcel() {
	
		XSSFWorkbook workbook = new XSSFWorkbook();
	}
	
	
}
