package entities;

import javax.persistence.*;

@Entity
@Table(name="cars")
public class Car {
    @Id
  //  @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="model")
    private String model;

    @Column(name="color")
    private String color;

    @Column(name="price")
    private Integer price;

    public Car(){}
    public Car(Integer id,String model, String color, Integer price) {
this.id=id;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return id+" "+model+" "+color+" "+price;
    }
}
