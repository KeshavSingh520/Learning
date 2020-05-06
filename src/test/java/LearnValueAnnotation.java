import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.Test;



public class LearnValueAnnotation {
	@Value("${Url}")
	private String url;
	
	public void print() {
	System.out.println(url);
	}
	
	@Test
	public void testValueAnnotation() {
		
		print();
	}
}
