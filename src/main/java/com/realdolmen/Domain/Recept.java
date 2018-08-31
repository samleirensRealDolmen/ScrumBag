package com.realdolmen.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Recept {

	@Id
	@GeneratedValue
	private int id;
	private String naam;

	@OneToMany
	private List<Ingredient> ingredienten = new ArrayList<>();

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public List<Ingredient> getIngredienten() {
		return ingredienten;
	}

	public void setIngredienten(List<Ingredient> ingredienten) {
		this.ingredienten = ingredienten;
	}
}
