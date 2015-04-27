package Step7;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddingNumbersTest {

	@Test
	public void testGetResult() {
		AddingNumbers add = new AddingNumbers(2, 3);
		int res = add.getResult();
		assertEquals(5, res);
	}

}
