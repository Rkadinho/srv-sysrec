package com.sysrec.barbearia.srvbarbeariasysrec.infrastructure.controller;

import com.sysrec.barbearia.srvbarbeariasysrec.domain.context.TenantContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TenantTestController {

    @GetMapping("/tenant-test")
    public String tenantTest() {
        return "Tenant atual: " + TenantContext.getTenantId();
    }
}
