package com.sysrec.srvsysrec.application.service;

import com.sysrec.srvsysrec.domain.barbearia.Usuario;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public Usuario criarUsario(Usuario usuario, String senhaTexto) {
        usuario.setSenha(passwordEncoder.encode(senhaTexto));
        usuario.setAtivo(true);
        return usuario;
    }
}
