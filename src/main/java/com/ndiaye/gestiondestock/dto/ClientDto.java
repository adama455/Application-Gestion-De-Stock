package com.ndiaye.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ndiaye.gestiondestock.model.Client;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;


    private AdresseDto adresse;


    private String photo;


    private String email;


    private String telephone;

    private Integer idEntreprise;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients;

    public static ClientDto fromEntity(Client client) {
        if (client == null) {
            return null;
        }
        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .adresse(AdresseDto.fromEntity(client.getAdresse()))
                .photo(client.getPhoto())
                .email(client.getEmail())
                .telephone(client.getTelephone())
                .idEntreprise(client.getIdEntreprise())
                .build();
    }

    public static Client toEntity(ClientDto dto) {
        if (dto == null) {
            return null;
        }
        Client client = new Client();
        client.setId(dto.getId());
        client.setNom(dto.getNom());
        client.setPrenom(dto.getPrenom());
        client.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
        client.setPhoto(dto.getPhoto());
        client.setEmail(dto.getEmail());
        client.setTelephone(dto.getTelephone());
        client.setIdEntreprise(dto.getIdEntreprise());
        return client;
    }

}
