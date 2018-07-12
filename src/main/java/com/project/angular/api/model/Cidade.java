package com.project.angular.api.model;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "cidade")
@Entity
public class Cidade {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nome")
    private String nome;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return id == cidade.id &&
                Objects.equals(nome, cidade.nome);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
