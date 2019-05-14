package com.techprimers.db.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(schema = "Category")
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    //@NotNull
    //@Size(min = 1, max = 64)
    @Column(name = "name")
    private String name;

    @OneToMany
    @JoinColumn(name = "category_id")
    private List<Obstacle> obstacles = new ArrayList<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

