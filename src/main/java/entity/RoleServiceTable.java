package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "role_service")
@Data
public class RoleServiceTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private EmployeeRolesTable role_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_id", nullable = false)
    private ServicesTable service_id;

    @Column(name = "tenant_id", nullable = false)
    private UUID tenant_id;

    @Column(name = "created_at", nullable = false)
    private Date created_at;
}
