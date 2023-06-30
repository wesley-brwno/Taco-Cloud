package tacos.domain;

import lombok.Data;

import java.util.List;

@Data
public class Taco {
    private String name;
    List<Ingredient> ingredients;
}
