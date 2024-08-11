package com.ndiaye.gestiondestock.validator;

import com.ndiaye.gestiondestock.dto.ClientDto;
import com.ndiaye.gestiondestock.dto.FournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {

    public static List<String> validate(FournisseurDto fournisseurDto) {

        List<String> errors = new ArrayList<>();

        if (fournisseurDto == null) {
            errors.add("Veuillez renseigner le nom du fournisseur");
            errors.add("Veuillez renseigner le Prénom du fournisseur");
            errors.add("Veuillez renseigner l'email du fournisseur");
            errors.add("Veuillez renseigner le numéro de téléphone du fournisseur");
            errors.addAll(AdresseValidator.validate(null));
            return errors;
        }

        if (!StringUtils.hasLength(fournisseurDto.getNom())) {
            errors.add("Veuillez renseigner le nom du client");
        }
        if (!StringUtils.hasLength(fournisseurDto.getPrenom())) {
            errors.add("Veuillez renseigner le Prénom du client");
        }
        if (!StringUtils.hasLength(fournisseurDto.getEmail())) {
            errors.add("Veuillez renseigner l'email du client");
        }
        if (!StringUtils.hasLength(fournisseurDto.getTelephone())) {
            errors.add("Veuillez renseigner le numéro de téléphone du client");
        }
        errors.addAll(AdresseValidator.validate(fournisseurDto.getAdresse()));
        return errors;
    }
}
