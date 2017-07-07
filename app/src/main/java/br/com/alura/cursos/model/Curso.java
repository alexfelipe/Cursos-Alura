package br.com.alura.cursos.model;

/**
 * Created by alex on 02/07/17.
 */

public class Curso {

    private String nome;
    private String descricao;
    private EstadoAtual estado;
    private Categoria categoria;

    public Curso(String nome, String descricao, EstadoAtual estado, Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.estado = estado;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public EstadoAtual getEstado() {
        return estado;
    }

    public void setEstado(EstadoAtual estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Curso: " + nome + " Descrição: " +
                descricao + " Estado: " + estado;
    }
}
