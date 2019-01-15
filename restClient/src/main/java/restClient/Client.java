package restClient;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class Client {

	public static void main(String[] args) 
	{
		
		RestTemplate nClient = new RestTemplate() ;
		
		System.out.println(nClient.getForObject("https://pegasus.greyhound.com/busTracker/dispatch/driverBusAssignment", String.class));
		
	}

}
