package org.management.employee_database_management.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.security.Permission;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.management.employee_database_management.model.RolePermission.*;

@RequiredArgsConstructor
public enum UserRole {
    HR(Set.of(
            HR_READ,
            HR_UPDATE,
            HR_CREATE,
            HR_DELETE,

            MANAGER_READ,
            MANAGER_UPDATE,
            MANAGER_CREATE,
            MANAGER_DELETE,

            DEVELOPER_READ,
            DEVOPS_READ,
            DEVELOPMENT,
            INFRASTRUCTURE_READ,
            CTO_READ,
            APPSUPPORT_READ,
            ACCOUNTANT_READ
    )),
    Manager(Set.of(
            MANAGER_READ,
            MANAGER_UPDATE,
            MANAGER_CREATE,
            MANAGER_DELETE
    )),
    Developer(Set.of(DEVELOPER_READ)),
    DevOps(Set.of(DEVOPS_READ)),
    Development(Set.of(DEVELOPMENT)),
    Infrastructure(Set.of(INFRASTRUCTURE_READ)),
    CTO(Set.of(CTO_READ)),
    AppSupport(Set.of(APPSUPPORT_READ)),
    Accountant(Set.of(ACCOUNTANT_READ));

    @Getter
    private final Set<RolePermission> permissions;
    public List<SimpleGrantedAuthority> getAuthorities(){
        var authorities=getPermissions()
                .stream()
                .map(permission->new SimpleGrantedAuthority(permission.name()))
                .toList();
        authorities.add(new SimpleGrantedAuthority("ROLE_"+this.name()));
        return authorities;

    }
}