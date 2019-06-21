package practical_lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumNumTest {

	@Test
	void test() {
		SumNum obj = new SumNum();
		assertEquals(5,obj.sum(3, 2));
	}

}
