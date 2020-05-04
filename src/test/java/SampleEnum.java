import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SampleEnum {
	
	
	SILVER("silver"),
	SPRO("spro"),
	SPRE("spre");
	private String value;

}
