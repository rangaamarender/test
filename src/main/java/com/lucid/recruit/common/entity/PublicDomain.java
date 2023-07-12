package com.lucid.recruit.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = PublicDomain.TABLE_NAME)
public class PublicDomain {

    public static final String TABLE_NAME="public_domain";
    @Id
    @Column(name = "domain")
    private String domain;
}
