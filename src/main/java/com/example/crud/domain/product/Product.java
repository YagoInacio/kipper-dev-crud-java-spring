package com.example.crud.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name="product")
@Entity(name="product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    @Column(name="price_in_cents")
    private Integer priceInCents;

    public Product(RequestProduct requestProduct){
        this.name = requestProduct.name();
        this.priceInCents = requestProduct.priceInCents();
    }
}
