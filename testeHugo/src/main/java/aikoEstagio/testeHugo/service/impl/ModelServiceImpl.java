package aikoEstagio.testeHugo.service.impl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import aikoEstagio.testeHugo.model.Model;
import aikoEstagio.testeHugo.model.ModelRepository;
import aikoEstagio.testeHugo.service.ModelService;

@Repository
public class ModelServiceImpl implements ModelService{
    @Autowired
    ModelRepository modelRepository;

    @Override
    public Iterable<Model> searchAll() {
        return modelRepository.findAll();
    }

    @Override
    public Model searchById(UUID id) {
        Optional<Model> model = modelRepository.findById(id);
        return model.get();
    }

    @Override
    public void insert(Model model) {
        modelRepository.save(model);
    }

    @Override
    public void update(UUID id, Model model) {
        Optional<Model> modelBd = modelRepository.findById(id);
        if(modelBd.isPresent()){
            modelRepository.save(model);
        }
    }

    @Override
    public void delete(UUID id) {
        modelRepository.deleteById(id);
    }
    
}
