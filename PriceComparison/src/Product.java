
import java.io.IOException;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Product implements Comparable<Product> {
	
	// Should support amazon website first
	private double price;
	public URL link;

	
	public Product(URL link) throws IOException {
		String url = link.toString();
		Document document = Jsoup.connect(url).followRedirects(false).timeout(60000/*wait up to 60 sec for response*/).get();
		
		// select element that comes from the html id price_inside_buybox 
		// specific to amazon sites
		String value = document.body().select("#price_inside_buybox" /*id for price on amazon website*/).get(0).text();
		
		
		// Since price taken from html is a string of "$400.00" must parse and 
		// remove dollar sign
		this.price = Double.parseDouble(value.substring(1));
	}
	
	
	// Getter for price of product
	public double getPrice() {
		return price;
	}
	
	// Compare to uses prices
	public int compareTo(Product p) {
		if(p.price==this.price) {
			return 0;
		}
		if(p.price>this.price) {
			return -1;
		}else {
			return 1;
		}
	}
	
	// If links are identical then products are considered equal
	@Override
	public boolean equals(Object x) {
		if(x==this) {
			return true;
		}
		if(!(x instanceof Product)) {
			return false;
		}
		Product p = (Product) x;
		return p.link.equals(this.link);
	}
}
