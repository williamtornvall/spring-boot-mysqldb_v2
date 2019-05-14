package com.techprimers.db.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
//@Table(schema = "Obstacle")
public class Obstacle {

    @Id
    @GeneratedValue             // genererar värde i kronologisk ordning
    @Column(name = "id")
    private Integer id;

    @Column(name = "lng")
    private Double lng;

    @Column(name = "lat")
    private Double lat;

    //@NotNull                               // förbjuder användaren att lämna fält tomt (null)
    //@Size(min = 5, max = 256)              // sätter krav på att kommentar är minimum 5 tecken
    @Column(name = "comment")
    private String comment;

    @Column(name = "status")
    private Boolean status;

    @ManyToOne
    private Category category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getLng () {
        return lng;
    }

    public void setLng (Double lng){
        this.lng = lng;
    }

    public Double getLat () {
        return lat;
    }

    public void setLat (Double lat){
        this.lat = lat;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getStatus(){
        return status;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }


}