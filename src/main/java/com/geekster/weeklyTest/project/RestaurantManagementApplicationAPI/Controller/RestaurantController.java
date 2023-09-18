package com.geekster.weeklyTest.project.RestaurantManagementApplicationAPI.Controller;

import com.geekster.weeklyTest.project.RestaurantManagementApplicationAPI.Model.Restaurant;
import com.geekster.weeklyTest.project.RestaurantManagementApplicationAPI.Service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("restaurants")
    public List<Restaurant> getRestaurants(){
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("restaurant/{id}")
        public Restaurant getRestaurant(@PathVariable Integer id){
            return restaurantService.getRestaurant(id);
        }

        @PostMapping("restaurant")
            public String addRestaurant(@Valid @RequestBody Restaurant r){

                return restaurantService.addRestaurant(r);
            }


        @PostMapping("restaurants")
            public String addRestaurant(@Valid @RequestBody List<Restaurant> r){

                return restaurantService.addRestaurants(r);
            }

            @PutMapping("restaurant/id/{id}/specialty/{updatedSpecial}")
              public String updateSpecialty(@PathVariable Integer id, @PathVariable String updatedSpecial){

                 return restaurantService.updateSpecialty(id, updatedSpecial);

        }

                @DeleteMapping("restaurant/{id}")
                    public String deleteRestaurant(@PathVariable Integer id){
                        return restaurantService.deleteRestaurant(id);
        }

    }


