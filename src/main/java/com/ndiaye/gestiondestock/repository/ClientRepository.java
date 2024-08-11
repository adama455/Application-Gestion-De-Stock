package com.ndiaye.gestiondestock.repository;

import com.ndiaye.gestiondestock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
