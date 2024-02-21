package com.daofu.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "contact_message")
public class ContactMessage {
    @Id
    @GeneratedVlaue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable= false)
    private String name;

    @Column(nullable= false)
    private String company;

    @Column(nullable= false)
    private String email;

    @Column(nullable= false)
    private String comment;
}
