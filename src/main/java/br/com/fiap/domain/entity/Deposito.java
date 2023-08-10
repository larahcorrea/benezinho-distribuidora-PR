package br.com.fiap.domain.entity;

import jakarta.persistence.*;

//import jakarta.persistence.*;
@Entity
@Table(name = "TB_DEPOSITO")
public class Deposito {

    @Id
    @SequenceGenerator(name = "SQ_DEPOSITO",sequenceName = "SQ_DEPOSITO",allocationSize = 1,initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SQ_DEPOSITO")
    @Column(name = "ID_DEPOSITO")
    Long id;
@Column(name = "NM_DEPOSITO")
    String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Deposito() {
    }

    @Override
    public String toString() {
        return "Deposito{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
