package com.LibrasTils.LibrasTils.models;

public record UsuarioResponse( Long id,String idade, String email) {
    public UsuarioResponse(Usuario usuario){
        this(usuario.getId(), usuario.getNomeCompleto(), usuario.getEmail());
//AQUI VC COLOCA OQ FOR NECESSÁRIO, PODE SER TUDO
    }

}
