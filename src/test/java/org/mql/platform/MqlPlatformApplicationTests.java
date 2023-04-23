package org.mql.platform;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MqlPlatformApplicationTests {

	@Test
	void test1() {
		String name1 = "Amine";
		String name2 = "karim";

		assertEquals(name1, name2);
	}

}
