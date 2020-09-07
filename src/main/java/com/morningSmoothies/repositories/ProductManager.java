package com.morningSmoothies.repositories;

import com.morningSmoothies.pojos.FreshSmoothie;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private List<FreshSmoothie> productStorage;

    public ProductManager() {
        productStorage = new ArrayList<FreshSmoothie>();
    }
    // TODO: you can add any fancy business logic before performing any of the CRUD operations

    public boolean addProduct(FreshSmoothie smoothie) {
        return productStorage.add(smoothie);
    }

    public FreshSmoothie getProduct(int id){
        for(FreshSmoothie s : productStorage){
            if(s.equals(id)){
                return s;
            }
        }
        return null;
    }

    public boolean deleteProduct(final int id){
        return productStorage.removeIf(e -> e.equals(id));
    }

    public List<FreshSmoothie> getAllProducts() {
        return productStorage;
    }
}