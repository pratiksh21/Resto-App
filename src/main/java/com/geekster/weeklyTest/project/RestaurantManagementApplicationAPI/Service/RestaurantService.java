package com.geekster.weeklyTest.project.RestaurantManagementApplicationAPI.Service;

import com.geekster.weeklyTest.project.RestaurantManagementApplicationAPI.Model.Restaurant;
import com.geekster.weeklyTest.project.RestaurantManagementApplicationAPI.Repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public List<Restaurant> getAllRestaurants(){
        return restaurantRepo.getRestaurants();
    }

    public Restaurant getRestaurant(Integer id){
        List<Restaurant>originalList = getAllRestaurants();

        for (Restaurant r : originalList){

            if(r.getRestaurantId().equals(id)){
                return r;
            }
        }

        throw new IllegalStateException("Restaurant not found");
    }

    public String addRestaurant(Restaurant r){
        List<Restaurant> originalList = getAllRestaurants();

        originalList.add(r);

        return "Restaurant added!";
    }

    public String addRestaurants(List<Restaurant> r){
        List<Restaurant> originalList = getAllRestaurants();

        originalList.addAll(r);

        return "Restaurants added!";
    }

    public String updateSpecialty(Integer id, String updatedSpecial){
        List<Restaurant> originalList = getAllRestaurants();

        for (Restaurant r: originalList){
            if(r.getRestaurantId().equals(id)){

                r.setRestaurantSpecialty(updatedSpecial);
                return "Specialty Updated!";
            }
        }
        return "Restaurant not found!";
    }

    public String deleteRestaurant(Integer id){

        List<Restaurant> originalList = getAllRestaurants();
        for(Restaurant r : originalList){
            if(r.getRestaurantId().equals(id)){
                originalList.remove(r);
                return "Restaurant Deleted!";
            }
        }

        return "Restaurant not found!";

    }
}
