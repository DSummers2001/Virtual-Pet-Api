package com.wcci.virtualpetapi.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "virtualpet")
@Table(name = "virtualpet")
@NoArgsConstructor
public class VirtualPet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    @SequenceGenerator(name = "sequence_generator", sequenceName = "VIRTUALPET_SEQ", allocationSize = 1)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String pet_name;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String pet_description;

    @Column(nullable = false, columnDefinition = "INTEGER")
    private String pet_hunger;

    @Column(nullable = false, columnDefinition = "INTEGER")
    private String pet_thirst;

    @Column(nullable = false, columnDefinition = "INTEGER")
    private String pet_boredom;

    public VirtualPet(String pet_name, String pet_description, String pet_hunger, String pet_thirst,
            String pet_boredom) {
        this.pet_name = pet_name;
        this.pet_description = pet_description;
        this.pet_hunger = pet_hunger;
        this.pet_thirst = pet_thirst;
        this.pet_boredom = pet_boredom;
    }
}