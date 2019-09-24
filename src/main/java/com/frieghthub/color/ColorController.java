package com.frieghthub.color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sweta.suman
 * @Description Color Controller class to map Color service with Conversion
 */
@RestController

public class ColorController {
	@Autowired
	ColorService service;

	@RequestMapping("/color")
	public String index() {
		return "Please provide the hex code in the URL with /";
	}

	/**
	 * @param hex in String format
	 * @return Response object along with the RGB equivalent of Hex value passed
	 */
	@RequestMapping("/color/{hex}")
	public ResponseEntity<Object> getRgb(@PathVariable("hex") String hex) {
		return new ResponseEntity<Object>("RGB equivalent of the Provided Hex value is : " + service.getRgb(hex),
				new HttpHeaders(), HttpStatus.OK);

	}

}
