package org.itstep.mywebapp.service;

import org.itstep.mywebapp.model.Pet;
import org.itstep.mywebapp.repository.MockPetRepository;
import org.itstep.mywebapp.repository.PetRepository;

import java.util.List;

public class PetServiceImpl implements Service {
    private PetRepository repository = new MockPetRepository();

    @Override
    public List<Pet> getAll() {
        return repository.getAll();
    }

    @Override
    public void delete(Integer id) {
        repository.delete(id);
    }
}
