package org.acme;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Pessoa extends PanacheEntity{

    public String nome;

    public Integer idade;

    public String cpf;

    @OneToOne(cascade = CascadeType.ALL)
    public Endereco endereco;

    @Email 
    public String email;
   
}
