package entity;


import enums.AppointmentsStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "appointments")
@Data
public class AppointmentsTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "tenant_id", nullable = false)
    private UUID tenant_id;

    @Column(name = "creator_id", nullable = false)
    private UUID creator_id;

    @JoinColumn(name = "employee_id", nullable = false)
    @OneToOne
    private EmployeesTable employee_id;

    @JoinColumn(name = "service_id", nullable = false)
    @OneToOne
    private ServicesTable service_id;

    @JoinColumn(name = "client_id", nullable = false)
    @OneToOne
    private ClientsTable client_id;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private AppointmentsStatus status;

    @Column(name = "start_time", nullable = false)
    private Date start_time;

    @Column(name = "end_time", nullable = false)
    private Date end_time;

    @Column(name = "created_at", nullable = false)
    private Date created_at;


}
