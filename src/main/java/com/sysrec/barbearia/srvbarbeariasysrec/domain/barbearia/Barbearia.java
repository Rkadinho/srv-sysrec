package com.sysrec.barbearia.srvbarbeariasysrec.domain.barbearia;

import com.sysrec.barbearia.srvbarbeariasysrec.domain.core.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "barbearias")
public class Barbearia extends BaseEntity {
    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private boolean ativa;
}
