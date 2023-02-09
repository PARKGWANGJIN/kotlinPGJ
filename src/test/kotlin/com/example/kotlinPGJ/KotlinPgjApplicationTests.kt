package com.example.kotlinPGJ

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KotlinPgjApplicationTests {

	@Test
	fun contextLoads(): String {
		var name: String = "테스트2";
		return name
	}

}
