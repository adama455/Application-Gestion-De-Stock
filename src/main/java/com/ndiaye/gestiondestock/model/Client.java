package com.ndiaye.gestiondestock.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name = "client")
public class Client extends AbstractEntity {

    @Column(name = "name")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;

}
