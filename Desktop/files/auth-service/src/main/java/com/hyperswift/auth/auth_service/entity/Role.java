package com.hyperswift.auth.auth_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name; // Example: ROLE_ADMIN, ROLE_VENDOR

    // Constructors
    public Role() {}
    public Role(String name) {
        this.name = name;
    }

    // Getters & Setters
    // (use Lombok @Data if preferred)
}

