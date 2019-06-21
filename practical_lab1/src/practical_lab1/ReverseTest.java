package practical_lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {

	@Test
	void test() {
		ReverseNum obj = new ReverseNum();
		assertEquals(1345,obj.reverse(5431));
	}

}
