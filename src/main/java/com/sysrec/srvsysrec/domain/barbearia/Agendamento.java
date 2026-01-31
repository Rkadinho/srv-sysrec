package com.sysrec.srvsysrec.domain.barbearia;

import com.sysrec.srvsysrec.domain.barbearia.enums.FormaPagamentoBarbearia;
import com.sysrec.srvsysrec.domain.core.BaseEntity;
import com.sysrec.srvsysrec.domain.enums.StatusServico;
import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "agendamentos")
public class Agendamento extends BaseEntity {
    @Column(nullable = false)
    private UUID clienteId;

    @Column(nullable = false)
    private UUID barbeiroId;

    @Column(nullable = false)
    private UUID unidadeId;

    @Column(nullable = false)
    private OffsetDateTime dataHora;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FormaPagamentoBarbearia formaPagamento;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusServico status;

    @Column
    private Integer duracaoEstimadaMinutos;

    @Column
    private String motivoCancelamento;

}
