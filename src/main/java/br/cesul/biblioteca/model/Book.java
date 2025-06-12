package br.cesul.biblioteca.model;

public record Book(
        String id,
        String titulo,
        String autor,
        String categoria,
        String status,
        String emprestadoPara
) {}
