package com.example.boyanyosifov.myapplication.com.online.shop.repository;

import java.util.List;

public interface DataManager<T> {
    T getById(int id );
    List<T> getAll();

    boolean addEntity(T entity);
    boolean addEntities(List<T> entities);

    boolean removeEntity(T entity);
    boolean updateEntity(T updatedEntity);
}
