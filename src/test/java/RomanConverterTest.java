import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <br><br>
 * <b>Copyright © BSM BankingSysteme und Managementberatung GmbH, 2018</b>
 * <br><br>
 */
class RomanConverterTest {
	@Test
	@DisplayName("Covert 1 to I Roman")
	void convert_ArabicNumber_Is_One() {
		RomanConverter romanConverter = new RomanConverter();
		String one = romanConverter.convert(1);
		Assertions.assertEquals("I", one);
	}
}