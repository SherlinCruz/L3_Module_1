package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class sherlinCruz {

	@Test
	public void test() {
		assertEquals(0, subtract(5, 5));

		// assertEquals(expectedResponse,acutalResponse )

	}

	int subtract(int x, int y) {

		return x - y;
	}

}
