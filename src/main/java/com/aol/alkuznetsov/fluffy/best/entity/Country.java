package com.aol.alkuznetsov.fluffy.best.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Country {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_id_sequence")
    @SequenceGenerator(name = "global_id_sequence", allocationSize = 5)
    private Long id;

    @Column(name = "alpha_two_code")
    private String alphaTwoCode;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "name")
    private String name;
}
