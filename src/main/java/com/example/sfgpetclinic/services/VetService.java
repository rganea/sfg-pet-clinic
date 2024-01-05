package com.example.sfgpetclinic.services;

import com.example.sfgpetclinic.model.Owner;
import com.example.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long>{
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
