package aikoEstagio.testeHugo.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aikoEstagio.testeHugo.model.Model;
import aikoEstagio.testeHugo.service.ModelService;

@RestController
@RequestMapping("model")
public class ModelCrudController {
    @Autowired
    private ModelService modelService;

    @GetMapping
    public ResponseEntity<Iterable<Model>> searchAll(){
        return ResponseEntity.ok(modelService.searchAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Model> searchById(@PathVariable UUID id){
        return ResponseEntity.ok(modelService.searchById(id));
    }

    @PostMapping
    public ResponseEntity<Model> insert(@RequestBody Model model){
        modelService.insert(model);
        return ResponseEntity.ok(model);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Model> update(@PathVariable UUID id, @RequestBody Model model){
        modelService.update(id, model);
        return ResponseEntity.ok(model);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id){
        modelService.delete(id);
        return ResponseEntity.ok().build();
    }
}
