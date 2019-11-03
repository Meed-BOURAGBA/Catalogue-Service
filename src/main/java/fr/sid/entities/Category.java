package fr.sid.entities;

import java.util.ArrayList;
import java.util.Collection;

public class Category {
    private String id;
    private String name;
    private Collection<Product> products = new ArrayList<>();

}
