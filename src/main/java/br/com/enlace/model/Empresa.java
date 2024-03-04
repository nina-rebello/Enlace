package br.com.enlace.model;

import java.util.Random;

public record Empresa(Long id, String nome, String imagem) {
    public Empresa(Long id, String nome, String imagem){
        this.id = Math.abs( new Random().nextLong() );
        this.nome = nome;
        this.imagem = imagem;
    }
    
}
