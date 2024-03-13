package co.com.beca.microservice.resolveEnigmaApi.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class OrquestadorService {
	
	public String pasos(){
	RestTemplate restTemplate = new RestTemplate();
	RestTemplate restTemplate2 = new RestTemplate();
	RestTemplate restTemplate3 = new RestTemplate();
	
	String step1ResourceUrl = "http://localhost:8080/v1/getOneEnigma/mensajePaso";
	String step2ResourceUrl = "http://localhost:8081/v1/getOneEnigma/mensajePaso";
	String step3ResourceUrl = "http://localhost:8082/v1/getOneEnigma/mensajePaso";
	
	ResponseEntity<String> response = restTemplate.getForEntity(step1ResourceUrl, String.class);
	ResponseEntity<String> response2 = restTemplate2.getForEntity(step2ResourceUrl, String.class);
	ResponseEntity<String> response3 = restTemplate3.getForEntity(step3ResourceUrl, String.class);
	
	String steps = response.getBody().concat(response2.getBody()).concat(response3.getBody());
	return steps;
	}

}
