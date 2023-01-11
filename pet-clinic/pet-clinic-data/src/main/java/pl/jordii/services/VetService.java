package pl.jordii.services;

import pl.jordii.model.Owner;
import pl.jordii.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
