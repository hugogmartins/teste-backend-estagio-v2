package aikoEstagio.testeHugo.model;

import java.util.Collection;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepository extends CrudRepository<Equipment, UUID>{
    @Query("SELECT e FROM equipment e")
    public Collection<Equipment> findAll();
}
