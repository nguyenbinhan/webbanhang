package com.tdt.spring;

public class Banner {

	private String src;
	private String ten;
	private String noidung;
	private String background;

	public Banner() {
		
	}

	public Banner(String src, String ten, String noidung, String background) {
		
		this.src = src;
		this.ten = ten;
		this.noidung = noidung;
		this.background = background;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

}
