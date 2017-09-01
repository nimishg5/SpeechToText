import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WavFileTest {

	@Test
	public void testMyText(){
		String inputText="accessibility testing is a subset of usablity testing it is performed to ensure that the appliation being tested is usable by people with disabilities like hearing color blindness old age and other this advantaged groups";
		String outputText=new Library().lib();
		boolean finalResult=false;
		if (StringUtils.getLevenshteinDistance(inputText, outputText) < inputText.length() / 2) {
			finalResult=true;
			}	
		assertEquals(true, finalResult);
	}
}
