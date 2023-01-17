package pl.jordii.services.map;

import org.springframework.stereotype.Service;
import pl.jordii.model.Owner;
import pl.jordii.model.Pet;
import pl.jordii.services.CrudService;
import pl.jordii.services.PetService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

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
