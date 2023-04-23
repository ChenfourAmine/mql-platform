package org.mql.platform;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MqlPlatformApplicationTests {

	@Test
	void test1() {
		String name1 = "Amine";
		String name2 = "karim";

		assertNotEquals(name1, name2);
	}

}
