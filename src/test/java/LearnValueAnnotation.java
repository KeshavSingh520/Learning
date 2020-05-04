import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.Test;

public class LearnValueAnnotation {

	@Autowired
	@Value("ABC")
	private String url;
	
	@Test
	public void testValueAnnotation() {
		
		System.out.println(this.url);
	}
}
