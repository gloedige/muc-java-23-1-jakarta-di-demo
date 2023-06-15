package de.neuefische.mucjava231jakartadidemo.service;

import de.neuefische.mucjava231jakartadidemo.model.Cat;
import de.neuefische.mucjava231jakartadidemo.repository.CatRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class CatService {

    private CatRepository catRepository;

    public CatService() {
    }

    @Inject // in spring = @Autowired
    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public List<Cat> getAllCats(){
        return catRepository.getCatList();
    }

    public Cat getCatById(String id){
        return catRepository.getCatById(id);
    }

    public Cat addCat(Cat cat){
        return catRepository.addCat(cat);
    }
}
