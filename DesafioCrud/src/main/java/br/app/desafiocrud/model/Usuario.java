package br.app.desafiocrud.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;


@Builder
@Getter
@Entity
@Data

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nome")
    private String nome;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "email")
    private String email;
    @Column (name = "cpf")
    private String cpf;





}

