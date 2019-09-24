package com.frieghthub.color;

import java.util.Arrays;

import org.springframework.stereotype.Service;

/**
 * @author sweta.suman
 * @Description Service class to Convert HEX color code to RGB
 */
@Service
public class ColorService {
	/**
	 * @param hex
	 * @return String 
	 */
	public String getRgb(String hex) {

		if (hex.contains("#")) {
			hex = hex.substring(1, hex.length());
		}

		final int[] ret = new int[3];
		for (int i = 0; i < 3; i++) {
			ret[i] = Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);

		}
		return Arrays.toString(ret);
	}
}
