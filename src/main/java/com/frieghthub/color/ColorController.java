package com.frieghthub.color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ColorController {
	@Autowired
    ColorService service;
	@RequestMapping("/color")
    public String index() {
        return "Please provide the hex code in the URL with /";
    }

	@RequestMapping("/color/{hex}")
	
	public ResponseEntity<Object> getRgb(@PathVariable("hex") String hex) {
		
		
   return new ResponseEntity<Object> (service.getRgb(hex),new HttpHeaders(), HttpStatus.OK);
		

		
		
	}
	
	



}
