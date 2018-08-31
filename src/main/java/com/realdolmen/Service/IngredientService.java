package com.realdolmen.Service;


import com.realdolmen.Domain.Ingredient;
import com.realdolmen.Repository.IngredientRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import java.util.List;


@Stateless
@LocalBean
public class IngredientService implements IngredientServiceRemote {

	@EJB
	IngredientRepository ingredientRepository;


	@Override
	public List<Ingredient> getAllIngredients() {
		return ingredientRepository.getall();
	}
}
