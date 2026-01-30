package com.sysrec.srvsysrec.infrastructure.controller;

import com.sysrec.srvsysrec.domain.context.TenantContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TenantTestController {

    @GetMapping("/tenant-test")
    public String tenantTest() {
        return "Tenant atual: " + TenantContext.getTenantId();
    }
}
