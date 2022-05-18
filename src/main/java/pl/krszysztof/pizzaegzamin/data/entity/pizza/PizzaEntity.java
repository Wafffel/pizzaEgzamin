package pl.krszysztof.pizzaegzamin.data.entity.pizza;

import pl.krszysztof.pizzaegzamin.data.entity.size.SizeEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pizzas")
public class PizzaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "pizza", orphanRemoval = true)
    private Set<SizeEntity> sizes;
}

