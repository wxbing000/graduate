package com.artpri.offical.pojo;

public class ArtistAuctionpojo {
	private String productImg;
	private String aaName;
	private String productName;
	private Double aaBargainPrice;
	private Double aaEstimatPrice;
	@Override
	public String toString() {
		return "ArtistAuctionpojo [productImg=" + productImg + ", aaName="
				+ aaName + ", productName=" + productName + ", aaBargainPrice="
				+ aaBargainPrice + ", aaEstimatPrice=" + aaEstimatPrice + "]";
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public String getAaName() {
		return aaName;
	}
	public void setAaName(String aaName) {
		this.aaName = aaName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getAaBargainPrice() {
		return aaBargainPrice;
	}
	public void setAaBargainPrice(Double aaBargainPrice) {
		this.aaBargainPrice = aaBargainPrice;
	}
	public Double getAaEstimatPrice() {
		return aaEstimatPrice;
	}
	public void setAaEstimatPrice(Double aaEstimatPrice) {
		this.aaEstimatPrice = aaEstimatPrice;
	}
	public ArtistAuctionpojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArtistAuctionpojo(String productImg, String aaName,
			String productName, Double aaBargainPrice, Double aaEstimatPrice) {
		super();
		this.productImg = productImg;
		this.aaName = aaName;
		this.productName = productName;
		this.aaBargainPrice = aaBargainPrice;
		this.aaEstimatPrice = aaEstimatPrice;
	}
	
}
