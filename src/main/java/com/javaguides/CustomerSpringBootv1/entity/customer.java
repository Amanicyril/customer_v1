package com.javaguides.CustomerSpringBootv1.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customers")
public class customer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(name="first_name")
    private String first_name;

    @Column(name = "last_name")
    private  String last_name;

    @Column(name = "address")
    private String address;

    @Column (name="contact")
    private String contact;

    public long getId() {
        return id;
    }


}
