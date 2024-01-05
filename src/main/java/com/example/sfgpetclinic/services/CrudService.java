package com.example.sfgpetclinic.services;

import java.util.Set;

//using generics
//mimik the CrudRepository
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
