package com.dell.api.consumers.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data

@Entity
@Table(name="consumers")
public class Consumers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;
    @Column(name="username")
    private String username;
    @Column(name="mobilenumber")
    private double mobilenumber;
    @Column(name="rewardpoints")
    private double rewardpoints;

}
