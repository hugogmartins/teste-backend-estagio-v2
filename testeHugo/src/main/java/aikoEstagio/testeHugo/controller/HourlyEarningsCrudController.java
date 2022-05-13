package aikoEstagio.testeHugo.controller;

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

import aikoEstagio.testeHugo.model.Equipment;
import aikoEstagio.testeHugo.model.HourlyEarnings;
import aikoEstagio.testeHugo.service.HourlyEarningsService;

@RestController
@RequestMapping("equipment_hourly_earning")
public class HourlyEarningsCrudController {
    
    @Autowired
    HourlyEarningsService hourlyEarningsService;

    @GetMapping
    public ResponseEntity<Iterable<HourlyEarnings>> searchAll(){
        return ResponseEntity.ok(hourlyEarningsService.searchAll());
    }

/*    @GetMapping("/{id}")
    public ResponseEntity<HourlyEarnings> searchByEquipment(@PathVariable Equipment equipment){
        return ResponseEntity.ok(hourlyEarningsService.searchByEquipment(equipment));
    }*/

    @PostMapping
    public ResponseEntity<HourlyEarnings> insert(@RequestBody HourlyEarnings hourlyEarnings){
        hourlyEarningsService.insert(hourlyEarnings);
        return ResponseEntity.ok(hourlyEarnings);
    }
/*
    @PutMapping("/{id}")
    public ResponseEntity<HourlyEarnings> update(@PathVariable Equipment equipment, @RequestBody HourlyEarnings hourlyEarnings){
        hourlyEarningsService.update(equipment, hourlyEarnings);
        return ResponseEntity.ok(hourlyEarnings);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Equipment equipment){
        hourlyEarningsService.delete(equipment);
        return ResponseEntity.ok().build();
    }
    */
}
