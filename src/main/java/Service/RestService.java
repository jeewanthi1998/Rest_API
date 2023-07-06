package Service;

import Model.RestModel;
import Repository.RestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class RestService {

    @Autowired
    private RestRepository restRepository;

    public RestModel addBLMethod(RestModel restModel){
        return restRepository.save(restModel);
    }

    public Iterable<RestModel> findAll(){
        return restRepository.findAll();
    }

    public RestModel findById(Integer id){
        return restRepository.getById(id);
    }

    public void delete(RestModel restModel){
        restRepository.delete(restModel);
    }
}
