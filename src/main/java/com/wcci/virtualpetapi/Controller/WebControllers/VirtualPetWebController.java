package com.wcci.virtualpetapi.Controller.WebControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.wcci.virtualpetapi.Model.VirtualPet;
import com.wcci.virtualpetapi.Repository.VirtualPetRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class VirtualPetWebController {
    @Autowired
    VirtualPetRepo virtualPetRepo;

    @GetMapping("/virtualpets")
    public String displayPets(@ModelAttribute("virtualpet") VirtualPet virtualpet, Model model){
        List<VirtualPet> virtualpets = virtualPetRepo.findAll();

        model.addAttribute("virtualpets", virtualpets);
        model.addAttribute("virtualpet", virtualpet);
        return "virtualpets";
    }
    
}
