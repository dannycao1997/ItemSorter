package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item { // instance fields
    private Long id;
    private String name;
    private Double price;


    public Item() { // nullary constructor
        this.id = 0L;
        this.name = "";
        this.price = 0.01;
    }

    public Item(Long id, String name, Double price) { // non-nullary constructor
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() { //getter
        return name;
    }

    public void setName(String name) { //setter
        this.name = name;
    }

    public Long getId() { //getter
        return id;
    }

    public void setId(Long id) { //setter
        this.id = id;
    }

    public Double getPrice() { //getter
        return price;
    }

    public void setPrice(Double price) { //setter
        this.price = price;
    }
}
