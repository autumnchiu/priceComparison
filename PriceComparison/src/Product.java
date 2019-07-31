import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Product {
	
	// Should support amazon website first
	private double price;
	public URL link;

	
	public Product(URL link) throws IOException {
		String url = link.toString();
		Document document = Jsoup.connect(url).followRedirects(false).timeout(60000/*wait up to 60 sec for response*/).get();
		String value = document.body().select("#element1" /*css selector*/).get(0).text();
		// plan to use jsoup
	}
	
}
