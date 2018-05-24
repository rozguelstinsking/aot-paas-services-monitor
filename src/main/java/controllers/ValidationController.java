package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import repositories.NamespaceRepository;
import repositories.RequestRepository;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("validation")
public class ValidationController {
	
	@Autowired
	private NamespaceRepository namespaceRepository;
	
	@Autowired
	private RequestRepository requestRepository;
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public Long createValidation(@RequestParam String name, @RequestParam Long requestId, @RequestParam String response ) {
		
		
		
		
		return null;
		
		
	}
	

}
