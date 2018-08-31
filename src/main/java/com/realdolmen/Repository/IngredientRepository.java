package com.realdolmen.Repository;

import com.realdolmen.Domain.Ingredient;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Stateless
public class IngredientRepository {

	@PersistenceContext
	EntityManager em;


	public List<Ingredient> getall()
	{
		return em.createQuery("select p from Ingredient p", Ingredient.class).getResultList();
	}
}
