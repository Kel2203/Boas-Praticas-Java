package br.com.alura.domain;

public class Abrigo {
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private Pet[] pets;
    public Abrigo(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Abrigo() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
    public Pet[] getPets() {
        return pets;
    }
}
