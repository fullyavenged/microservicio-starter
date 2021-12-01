package everis.com.microserviceownstarter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import everis.com.starter.Saludo;

@RestController
public class IndexController {

	@Autowired
	private Saludo saludo;
	
	public IndexController() {
		
	}
	
	@GetMapping("/")
	public ResponseEntity<String> index(){
		return new ResponseEntity<String>(HttpStatus.OK).ok(saludo.mensajeSaludo());
	}
	
	@GetMapping("/saludo")
	public ResponseEntity<String> saludo(@RequestParam("status") String status){
		return new ResponseEntity<String>(HttpStatus.OK).ok("Todo ok");
	}
}

