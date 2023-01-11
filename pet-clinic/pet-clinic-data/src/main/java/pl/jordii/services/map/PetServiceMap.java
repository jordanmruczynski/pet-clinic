package pl.jordii.services.map;

import pl.jordii.model.Owner;
import pl.jordii.model.Pet;
import pl.jordii.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return this.findAll();
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        this.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return this.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return this.findById(id);
    }
}
