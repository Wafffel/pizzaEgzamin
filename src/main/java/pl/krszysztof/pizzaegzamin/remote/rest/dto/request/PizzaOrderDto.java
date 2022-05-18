package pl.krszysztof.pizzaegzamin.remote.rest.dto.request;

public class PizzaOrderDto {
    private int sizeId;
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public int getCount() {
        return count;
    }

    public int getSizeId() {
        return sizeId;
    }

    public PizzaOrderDto() {
    }

    public PizzaOrderDto(int sizeId, int count) {
        this.sizeId = sizeId;
        this.count = count;
    }
}
