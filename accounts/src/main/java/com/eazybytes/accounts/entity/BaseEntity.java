package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @Column(updatable = false,name = "created_at")
    @CreatedDate
    private LocalDateTime createdAt;

    @Column(updatable = false,name = "created_by")
    @CreatedBy
    private String createdBy;

    @Column(insertable  = false,name = "modified_at")
    @LastModifiedDate
    private LocalDateTime modifiedAt;

    @Column(insertable  = false,name = "modified_by")
    @LastModifiedBy
    private String modifiedBy;
}
