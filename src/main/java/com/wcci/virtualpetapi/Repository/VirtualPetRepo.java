package com.wcci.virtualpetapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wcci.virtualpetapi.Model.VirtualPet;

@Repository
public interface VirtualPetRepo extends JpaRepository<VirtualPet, Integer>{
    
}
