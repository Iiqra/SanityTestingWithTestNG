package com.morningSmoothies.pojos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FreshSmoothie {

    private int ID;
    private String Name;
    private float Price;

    public FreshSmoothie() {
    }

    public FreshSmoothie(int ID, String name, float price) {
        this.ID = ID;
        Name = name;
        Price = price;
    }
}