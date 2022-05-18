package pl.krszysztof.pizzaegzamin.remote.rest.dto.response;

import pl.krszysztof.pizzaegzamin.domain.model.SizeType;

public class SizeDto {
    private int id;
    private SizeType size;
    private float price;

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public SizeType getSize() {
        return size;
    }

    public int getId() {
        return id;
    }

    public SizeDto() {
    }

    public SizeDto(int id, SizeType size, float price) {
        this.id = id;
        this.size = size;
        this.price = price;
    }
}
