package com.sysrec.srvsysrec.domain.barbearia;

import com.sysrec.srvsysrec.domain.core.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "clientes")
public class Cliente extends BaseEntity {
    @Column(nullable = false)
    private String nome;

    @Column
    private String telefone;

    @Column
    private UUID usuarioId;

    @Column(nullable = false)
    private boolean ativo;
}
