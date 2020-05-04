package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TestEnum {
	
	public enum app{
	SILVER,
	SPRO,
	SPRE
	}
	
	public enum app1{
		QS
	}
	
	
	
	
	
	@Test
	public void testEnum() {
		System.out.println(Enum.valueOf(app1.class, "QS"));
		System.out.println(app.SILVER);
	}

}
