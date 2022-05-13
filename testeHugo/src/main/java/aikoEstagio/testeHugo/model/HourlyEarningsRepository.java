package aikoEstagio.testeHugo.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HourlyEarningsRepository extends CrudRepository<HourlyEarnings,Equipment>{

}
