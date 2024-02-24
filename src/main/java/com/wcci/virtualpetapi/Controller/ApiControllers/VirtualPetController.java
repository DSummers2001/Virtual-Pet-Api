package com.wcci.virtualpetapi.Controller.ApiControllers;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.wcci.virtualpetapi.Model.VirtualPet;
import com.wcci.virtualpetapi.Repository.VirtualPetRepo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class VirtualPetController {
    @Autowired
    VirtualPetRepo virtualPetRepo;

    // get all
    @GetMapping("/api/virtualpets")
    public ResponseEntity<List<VirtualPet>> getAllPets() {
        List<VirtualPet> virtualPets = virtualPetRepo.findAll();

        if (virtualPets.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<List<VirtualPet>>(virtualPets, HttpStatus.OK);
        }
    }

    // get by ID
    @GetMapping("/api/virtualpets/{id}")
    public ResponseEntity<VirtualPet> getByPetId(@PathVariable("id") Integer id) {
        Optional<VirtualPet> virtualPet = virtualPetRepo.findById(id);

        if (virtualPet.isPresent()){
            return new ResponseEntity<>(virtualPet.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    // create a pet
    @PostMapping("/api/virtualpets/new")
    public ResponseEntity<VirtualPet> createPet(@RequestBody VirtualPet virtualPet) {
        
        VirtualPet _virtualPet = virtualPetRepo.save(new VirtualPet(virtualPet.getPet_name(), virtualPet.getPet_description(), virtualPet.getPet_hunger(), virtualPet.getPet_thirst(), virtualPet.getPet_boredom()));
        return new ResponseEntity<>(_virtualPet, HttpStatus.CREATED);
    }
    
    // delete a pet
    @DeleteMapping("/api/virtualpets/{id}")
    public ResponseEntity<String> deletePet(@PathVariable("id") Integer id){
        Optional<VirtualPet> virtualPet = virtualPetRepo.findById(id);

        if (virtualPet.isPresent()){
            virtualPetRepo.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
