package pl.krszysztof.pizzaegzamin.remote.rest.dto.response;

import java.util.List;

public class PizzaDto {
    private int Id;
    private String name;
    private List<SizeDto> sizes;

    public void setSizes(List<SizeDto> sizes) {
        this.sizes = sizes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        Id = id;
    }

    public List<SizeDto> getSizes() {
        return sizes;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public PizzaDto() {
    }

    public PizzaDto(int id, String name, List<SizeDto> sizes) {
        Id = id;
        this.name = name;
        this.sizes = sizes;
    }
}
