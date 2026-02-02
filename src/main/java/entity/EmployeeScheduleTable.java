package entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.DayOfWeek;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "employee_schedule")
@Data
public class EmployeeScheduleTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private EmployeesTable employee_id;

    @Column(name = "day_of_week", nullable = false)
    @Enumerated(EnumType.STRING)
    private DayOfWeek day_of_week;

    @Column(name = "duraction", nullable = false)
    private int duraction;

    @Column(name = "start_time", nullable = false)
    private Date start_time;

    @Column(name = "end_time", nullable = false)
    private Date end_time;
}
