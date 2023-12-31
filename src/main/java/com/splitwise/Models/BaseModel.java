package com.splitwise.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.exception.DataException;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @CreatedDate
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date CreatedAt;

    @CreatedDate
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date UpdatedAt;
}
