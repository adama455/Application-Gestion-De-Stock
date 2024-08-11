package com.ndiaye.gestiondestock.validator;

import ch.qos.logback.core.util.StringUtil;
import com.ndiaye.gestiondestock.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {

    public static List<String> validate(CategoryDto categoryDto) {

        List<String> errors = new ArrayList<>();

        if (!StringUtils.hasLength(categoryDto.getCode())){
            errors.add("Veuillez renseigner le code de la categorie");
        }
        return errors;
    }
}
