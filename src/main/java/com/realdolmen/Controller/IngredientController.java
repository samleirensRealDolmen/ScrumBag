package com.realdolmen.Controller;

import com.realdolmen.Domain.Ingredient;
import com.realdolmen.Service.IngredientService;
import org.hibernate.service.spi.InjectService;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class IngredientController {
	@Inject
	IngredientService ingredientService;

	private List<Ingredient> ingredients = new ArrayList<>();

	@PostConstruct
	public void initList()
	{
		ingredients = ingredientService.getAllIngredients();
	}

}
