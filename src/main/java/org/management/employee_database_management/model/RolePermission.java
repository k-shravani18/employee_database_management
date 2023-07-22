package org.management.employee_database_management.model;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public enum RolePermission {

    HR_READ("hr:read"),
    HR_UPDATE("hr:update"),
    HR_CREATE("hr:create"),
    HR_DELETE("hr:delete"),

    MANAGER_READ("manager:read"),
    MANAGER_UPDATE("manager:update"),
    MANAGER_CREATE("manager:create"),
    MANAGER_DELETE("manager:delete"),

    DEVELOPER_READ("developer:read"),
    DEVOPS_READ("devops:read"),
    DEVELOPMENT("development:read"),
    INFRASTRUCTURE_READ("infrastructure:read"),
    CTO_READ("cto:read"),
    APPSUPPORT_READ("appsupport:read"),
    ACCOUNTANT_READ("accountant:read");

    private final String permission;
    public String getPermission() {
        return permission;
    }

}
