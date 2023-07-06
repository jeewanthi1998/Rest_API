package Repository;

import Model.RestModel;
import org.springframework.data.repository.CrudRepository;

public interface RestRepository extends CrudRepository<RestModel, Integer> {

    RestModel getById(Integer id);
}
