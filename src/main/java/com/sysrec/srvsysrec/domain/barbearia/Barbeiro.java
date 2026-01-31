package com.sysrec.srvsysrec.domain.barbearia;

import com.sysrec.srvsysrec.domain.core.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "barbeiros")
public class Barbeiro extends BaseEntity {
    @Column(nullable = false)
    private UUID usuarioId;

    @Column(nullable = false)
    private UUID unidadeId;

    @Column(nullable = false)
    private boolean ativo;
}
