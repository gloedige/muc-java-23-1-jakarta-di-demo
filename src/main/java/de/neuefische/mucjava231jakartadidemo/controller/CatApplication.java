package de.neuefische.mucjava231jakartadidemo.controller;

import de.neuefische.mucjava231jakartadidemo.exception.CatNotFoundExceptionMapper;
import de.neuefische.mucjava231jakartadidemo.exception.ConstraintViolationExceptionMapper;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class CatApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();

        classes.add(CatController.class);
        classes.add(CatNotFoundExceptionMapper.class);
        classes.add(ConstraintViolationExceptionMapper.class);

        return classes;
    }
}
