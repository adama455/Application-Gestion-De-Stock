package com.ndiaye.gestiondestock.validator;

import com.ndiaye.gestiondestock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public static List<String> Validate(UtilisateurDto utilisateurDto){
        List<String> errors = new ArrayList<>();

        if (utilisateurDto == null){
            errors.add("Veuillez renseigner le nom d'utilisateur");
            errors.add("Veuillez renseigner l'email de l'utilisateur");
            errors.add("Veuillez renseigner l'adresse d'utilisateur");
            errors.add("Veuillez renseigner la date de naissance de l'utilisateur");
            errors.add("Veuillez renseigner le mot de passe d'utilisateur");
            errors.add("Veuillez renseigner l'adresse d'utilisateur");
            errors.addAll(AdresseValidator.validate(null));
            return errors;
        }

        if(!StringUtils.hasLength(utilisateurDto.getNom())){
            errors.add("Veuillez renseigner le nom d'utilisateur");
        }
        if(!StringUtils.hasLength(utilisateurDto.getPrenom())){
            errors.add("Veuillez renseigner le Prénom d'utilisateur");
        }
        if(!StringUtils.hasLength(utilisateurDto.getMotDePasse())){
            errors.add("Veuillez renseigner le mot de passe d'utilisateur");
        }
        if(!StringUtils.hasLength(utilisateurDto.getEmail())){
            errors.add("Veuillez renseigner l'email d'utilisateur");
        }
        if((utilisateurDto.getDateDeNaissance() == null)){
            errors.add("Veuillez renseigner la date de naissance de l'utilisateur");
        }
        errors.addAll(AdresseValidator.validate(utilisateurDto.getAdresse()));
        return errors;
    }



}
