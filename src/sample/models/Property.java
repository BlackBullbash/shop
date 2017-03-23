package sample.models;

import sample.models.interfaces.ICostable;
import sample.models.interfaces.IPrintable;

public abstract class Property implements IPrintable, ICostable {
    protected float price;
    protected float weight;
    protected String color;
    protected String model;

    public Property(float price, float weight, String color, String model) {
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Property property = (Property) o;

        if (Float.compare(property.price, price) != 0) return false;
        if (Float.compare(property.weight, weight) != 0) return false;
        if (color != null ? !color.equals(property.color) : property.color != null) return false;
        return model != null ? model.equals(property.model) : property.model == null;

    }

    @Override
    public int hashCode() {
        int result = (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Property{" +
                "price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public float getCost() {
        return price;
    }
}
