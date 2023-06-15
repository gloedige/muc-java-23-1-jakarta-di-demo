package de.neuefische.mucjava231jakartadidemo.exception;

public class CatNotFoundException extends RuntimeException{
    public CatNotFoundException(String id) {
        super("Cat with id " + id + " not found!");
    }
}
