package Step7;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class AddingNumbersTest {

	@Test
	public void testGetResult() {
		AddingNumbers add = new AddingNumbers();
		add.setNumbers(2, 3);
		int res = add.getResult();
		assertEquals(5, res);
	}
	
	@Test
	public void testGetResultMockito() {
		AddingNumbers add = Mockito.mock(AddingNumbers.class);
		int left = 2;
		int right = 3;
		add.setNumbers(2, 3);
		int actualRes = left + right;
		Mockito.when(add.getResult()).thenReturn(actualRes);
	}

}
