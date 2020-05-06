package test;

import org.testng.annotations.Test;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TestEnum {
	
	public enum app{
	SILVER("Hi"),
	SPRO,
	SPRE;
	
	String str;
		app() {
			this.str="hello";
		}
		
	app(String str) {
		this.str=str;
	}
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
