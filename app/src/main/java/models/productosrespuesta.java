package models;

import java.util.ArrayList;
import java.util.Date;

public class productosrespuesta {

    private String id;
    private String name;
    private String descripcio;
    private String data;
    private String representant;
    private String stock;


    // Getter Methods

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public String getData() {
        return data;
    }

    public String getRepresentant() {
        return representant;
    }

    public String getStock() {
        return stock;
    }

    // Setter Methods

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setRepresentant(String representant) {
        this.representant = representant;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
