package pl.jordii.services.map;

import pl.jordii.model.Owner;
import pl.jordii.model.Vet;
import pl.jordii.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return this.findAll();
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        this.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return this.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return this.findById(id);
    }
}
