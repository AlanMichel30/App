package com.LibrasTils.LibrasTils.models;

import java.time.LocalDate;

public record UsuarioRequest(Long id,
                             String cpf,
                             String userName,
                             String nome,
                             String sobrenome,
                             LocalDate dataNascimento,
                             Genero genero,
                             String telefone,
                             String email,
                             String senha,
                             Endereco endereco
                            ) {
}