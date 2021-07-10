package test.ashishjaintechg.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class SpringTestApplication {

	@Autowired
	private RestTemplate restTemplate;
	
//	@Autowired
//	private ClientHttpRequestInterceptorTest clientHttpRequestInterceptorTest;
	
	
    @GetMapping(value="/")
	public String getGreeting() {
		Coupon coupon = restTemplate.getForObject("http://localhost:8081/couponapi/coupons/"+"SUPER10", Coupon.class);
		
    	System.out.println("method called "+coupon);
		return "hello";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}

}
