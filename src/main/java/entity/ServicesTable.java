package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "services")
@Data
public class ServicesTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "tenant_id", nullable = false)
    private UUID tenant_id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "duraction", nullable = false)
    private int duraction;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "created_at", nullable = false)
    private Date created_at;

    @OneToMany(mappedBy = "service_id")
    private List<RoleServiceTable> roleServices;

}
