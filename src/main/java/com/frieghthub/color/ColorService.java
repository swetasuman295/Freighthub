package com.frieghthub.color;

import java.util.Arrays;

import org.springframework.stereotype.Service;
@Service
public class ColorService {
public String getRgb(String hex){

	final int[] ret = new int[3];
		for (int i = 0; i < 3; i++) {
			ret[i] = Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);

		}
		
		return Arrays.toString(ret);
	}
}
