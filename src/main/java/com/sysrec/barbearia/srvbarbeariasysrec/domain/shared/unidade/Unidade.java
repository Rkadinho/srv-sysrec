package com.sysrec.barbearia.srvbarbeariasysrec.domain.shared.unidade;

import com.sysrec.barbearia.srvbarbeariasysrec.domain.core.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "unidades")
public class Unidade extends BaseEntity {
    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private boolean aberta;
}