package pl.jordii.boostrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.jordii.model.Owner;
import pl.jordii.model.Vet;
import pl.jordii.services.OwnerService;
import pl.jordii.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    //@Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Anna");
        owner1.setLastName("Pieszko");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Piotr");
        owner2.setLastName("Holeczko");
        ownerService.save(owner2);

        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstName("Daniel");
        vet.setLastName("Close");
        vetService.save(vet);
    }
}
