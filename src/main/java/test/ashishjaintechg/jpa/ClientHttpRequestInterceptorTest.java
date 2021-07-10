package test.ashishjaintechg.jpa;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

@Component
public class ClientHttpRequestInterceptorTest implements ClientHttpRequestInterceptor {

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		// TODO Auto-generated method stub
		ClientHttpResponse response = null;
		System.out.println("ClientHttpRequestInterceptorTest -1 ");
		try {
		response = execution.execute(request, body);
		} finally {
		System.out.println("ClientHttpRequestInterceptorTest -1 back");
		}
		return response;
	}

}
