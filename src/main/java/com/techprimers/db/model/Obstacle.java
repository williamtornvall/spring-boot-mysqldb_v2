package com.techprimers.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Obstacle {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "position_id")
    private Double positionId;
    @Column(name = "comment")
    private String comment;
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "status")
    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPositionId() {
        return positionId;
    }

    public void setPositionId(Double positionId) {
        this.positionId = positionId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getCategoryId(){
        return categoryId;
    }

    public void setCategoryId(Integer categoryId){
        this.categoryId = categoryId;
    }

    public Boolean getStatus(){
        return status;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }


}

