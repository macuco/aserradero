package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public Persona index() {
        return new Persona();
    }
    
}
class Persona{
	private String name="Juan Manuel2";
	
	public String getName(){
		return name;
	}
}