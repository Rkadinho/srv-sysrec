package com.sysrec.srvsysrec.domain.barbearia;

import com.sysrec.srvsysrec.domain.barbearia.enums.CargosBarbearia;
import com.sysrec.srvsysrec.domain.core.BaseEntity;
import jakarta.persistence.*;
import org.jspecify.annotations.Nullable;

@Entity
@Table(name = "usuarios")
public class Usuario extends BaseEntity {
    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private boolean ativo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CargosBarbearia cargo;

    public void setSenha(@Nullable String encode) {
    }

    public void setAtivo(boolean b) {

    }
}
