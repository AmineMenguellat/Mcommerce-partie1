package com.ecommerce.microcommerce.dto;

public class ProductMargeDto {

	private int id;
	private String nom;
	private Double marge;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getMarge() {
		return marge;
	}

	public void setMarge(Double marge) {
		this.marge = marge;
	}

	public ProductMargeDto(int id, String nom, Double marge) {
		super();
		this.id = id;
		this.nom = nom;
		this.marge = marge;
	}

	public ProductMargeDto() {
		super();
	}

}
