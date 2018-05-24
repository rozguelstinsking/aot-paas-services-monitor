package hello;

import org.springframework.web.bind.annotation.RestController;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@CrossOrigin
@RequestMapping("")
public class HelloController {

    @RequestMapping("/")
    public Greetings index() {
        return new Greetings("Hola", 3);
    }
    
    @RequestMapping("/keys")
    public ArrayList<String> getKeysByEnv(@RequestParam(required= true) String env){
    	
    	ArrayList<String> lista= new ArrayList<String>();
    	if(env.compareTo("dev") == 0) {
        	lista.add("La manga");
        	lista.add("La tanga");
        	lista.add("La guaanga");
        	lista.add("jajajajajaa");
        		
    	}
    	
    	return lista;
    	
    }
    

}