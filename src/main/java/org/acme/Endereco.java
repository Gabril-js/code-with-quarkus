package org.acme;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Endereco extends PanacheEntity{

    public Integer numero;

    public String rua;
    
    public Integer cep;
}
