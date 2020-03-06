package com.fexample.fhub.dao.dto.Dish;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fexample.fhub.dao.model.classes.Category;
import com.fexample.fhub.dao.model.classes.Dish;
import com.fexample.fhub.dao.model.classes.DishDetails;
import com.fexample.fhub.dao.model.classes.Image;
import com.fexample.fhub.facade.interfaces.dto.DtoEntity;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DishExtended implements DtoEntity<Dish>{

    private UUID id;
    private String name;
    private int kkal;
    private int price;
    List<Category> categories;
    Image image;
    DishDetails dishDetails;

    public Dish toModel(){

        Dish dish = new Dish();

        dish.setId(id);
        dish.setName(name);
        dish.setKkal(kkal);
        dish.setPrice(price);
        dish.setCategories(categories);
        dish.setImage(image);
        dish.setDishDetails(dishDetails);

        return dish;
    }

    public static DishExtended fromModel(Dish dish){
        DishExtended extended = new DishExtended();

        extended.setId(dish.getId());
        extended.setName(dish.getName());
        extended.setKkal(dish.getKkal());
        extended.setPrice(dish.getPrice());
        extended.setCategories(dish.getCategories());
        extended.setImage(dish.getImage());
        extended.setDishDetails(dish.getDishDetails());

        return extended;
    }
}