package org.itstep.mywebapp.repository;

import org.itstep.mywebapp.model.Pet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MockPetRepository implements PetRepository {

    private Map<Integer, Pet> pets = new ConcurrentHashMap<>();

    {
        pets.put(1,new Pet(1,"Lucky",new Date(2015,06,16),2,true,25));
    }

    @Override
    public List<Pet> getAll() {
        return new ArrayList(pets.values());
    }

    @Override
    public void delete(Integer id) {
        pets.remove(id);
    }
}
