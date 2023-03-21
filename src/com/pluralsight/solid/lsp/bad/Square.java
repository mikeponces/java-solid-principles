package com.pluralsight.solid.lsp.bad;

public class Square extends Rectangle {

	@Override
	public void setHeight(int height) {
		this.height = height;
		this.width = height;
	}

	@Override
	public void setWidth(int width) {
		this.height = width;
		this.width = width;
	}

}
