package de.neuefische.mucjava231jakartadidemo.repository;

import de.neuefische.mucjava231jakartadidemo.model.Cat;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@ApplicationScoped
public class CatRepository {

    private final List<Cat> catList;

    public CatRepository() {
        catList = new ArrayList<>();
    }

    public List<Cat> getCatList(){
        return catList;
    }

    public Cat getCatById(String id){
        for(Cat cat : catList){
            if(cat.id().equals(id)){
                return cat;
            }
        }
        throw new NoSuchElementException("Cat with id " + id + " does not exist!");
    }

    public Cat addCat(Cat cat){
        catList.add(cat);
        return cat;
    }
}
