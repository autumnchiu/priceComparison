import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void testParseHTMLforPrice() throws MalformedURLException {
		URL url = new URL("https://www.amazon.com/Samsung-Galaxy-Unlocked-Certified-Refurbished/dp/B07C65XFBB/ref=br_asw_pdt-6?pf_rd_m=ATVPDKIKX0DER&pf_rd_s=&pf_rd_r=X2V7CNTH8HTTEZ8MWB1C&pf_rd_t=36701&pf_rd_p=18bf28d2-a367-49f5-825a-60757405e725&pf_rd_i=desktop");
		try {
			Product phone = new Product(url);
			assertTrue(phone.getPrice()==364.00);
		} catch (IOException e) {
			System.out.print("Had trouble creating product");
		}
		
		
	}

}
