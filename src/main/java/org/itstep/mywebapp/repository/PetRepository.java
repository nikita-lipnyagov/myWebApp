package org.itstep.mywebapp.repository;

import org.itstep.mywebapp.model.Pet;

import java.util.List;

public interface PetRepository {
    List<Pet> getAll();

    void delete(Integer id);
}
