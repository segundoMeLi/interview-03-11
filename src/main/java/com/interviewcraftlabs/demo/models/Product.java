package com.interviewcraftlabs.demo.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private Long id;

    private String description;
    private Long price;
    private Categories category;
}
