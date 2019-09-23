package com.frieghthub.color;

import javax.validation.constraints.NotBlank;

public class Hexcolor{

	@NotBlank(message = "Hex Color is mandatory")
	private String colorHex;
	private String colorRgb;
	public String getColorHex() {
		return colorHex;
	}
	public void setColorHex(String colorHex) {
		this.colorHex = colorHex;
	}
	public String getColorRgb() {
		return colorRgb;
	}
	public void setColorRgb(String colorRgb) {
		this.colorRgb = colorRgb;
	}

}