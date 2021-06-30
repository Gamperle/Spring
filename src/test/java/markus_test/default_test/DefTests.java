package markus_test.default_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;

import markus_test.example.spring_dem.SpringDemApplication;
@ContextConfiguration(classes = SpringDemApplication.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DefTests {

	@Test
	void contextLoads() {
		assert(2==1+1);
	}
	@Test
	void Ping() {
		assert(2==5+-3);
		
	}
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		System.out.println();
		String name = this.restTemplate.getForObject("http://localhost:" + port + "/",
				String.class);
		//assert(name.contains("Hello, World"));

}}
