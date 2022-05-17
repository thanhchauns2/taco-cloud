package com.example.demo.tacos.web.api;

//import java.util.Optional;
//import org.springframework.hateoas.server.EntityLinks;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import tacos.data.IngredientRepository;
//
//@RestController
//@RequestMapping(path = "/ingredients", produces = "application/json")
//@CrossOrigin(origins = "*")
//public class IngredientController {
//	private IngredientRepository ingredientRepo;
//	@Autowired
//	EntityLinks entityLinks;
//
//	public IngredientController(IngredientRepository ingredientRepo) {
//		this.ingredientRepo = ingredientRepo;
//	}
//
//	@GetMapping
//	public Iterable<Ingredient> getAllIngredients() {
//		return ingredientRepo.findAll();
//	}
//
//	@GetMapping("/{id}")
//	public Ingredient ingredientById(@PathVariable("id") String id) {
//		Optional<Ingredient> optIngredient = ingredientRepo.findById(id);
//		if (optIngredient.isPresent()) {
//			return optIngredient.get();
//		}
//		return null;
//	}
//}
import java.util.Optional;

import com.example.demo.tacos.web.api.*;
import com.example.demo.tacos.data.IngredientRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.hateoas.server.EntityLinks;


@RestController
@RequestMapping(path = "/ingredients", produces = "application/json")
@CrossOrigin(origins = "*")
public class IngredientController {
    private IngredientRepo ingredientRepo;

//    @Autowired
//    EntityLinks entityLinks;

    public IngredientController(IngredientRepo ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @GetMapping
    public Iterable<Ingredient> getAllIngredients() {
        return ingredientRepo.findAll();
    }

    @GetMapping("/{id}")
    public Ingredient ingredientById(@PathVariable("id") String id) {
        Optional<Ingredient> optIngredient = ingredientRepo.findById(id);
        return optIngredient.orElse(null);
    }
}
