package pl.jordii.services;

import pl.jordii.model.Owner;
import pl.jordii.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
