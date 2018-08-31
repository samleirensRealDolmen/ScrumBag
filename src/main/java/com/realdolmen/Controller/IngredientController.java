package com.realdolmen.Controller;

import com.realdolmen.Domain.Ingredient;
import com.realdolmen.Service.IngredientService;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class IngredientController {

	@Inject
	IngredientService ingredientService;

	private List<Ingredient> ingredients = new ArrayList<>();

	@PostConstruct
	public void initList()
	{

		ingredients = ingredientService.getAllIngredients();
		System.out.println(ingredients);
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public void showList()
	{
		System.out.println(ingredients);
	}
}
