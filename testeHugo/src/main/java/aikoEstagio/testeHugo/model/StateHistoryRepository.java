package aikoEstagio.testeHugo.model;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateHistoryRepository extends CrudRepository<StateHistory, UUID>{
    
}
