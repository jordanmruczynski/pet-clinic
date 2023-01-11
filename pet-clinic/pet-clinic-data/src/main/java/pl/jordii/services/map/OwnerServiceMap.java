package pl.jordii.services.map;

import pl.jordii.model.Owner;
import pl.jordii.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return this.findAll();
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        this.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return this.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return this.findById(id);
    }
}
