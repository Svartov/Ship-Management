package Docks;

public class Container{
    private int weight;
    private String typeContainer;
    private int numberContainer;

    public Container(int weight, String typeContainer, int numberContainer) {
        this.weight = weight;
        this.typeContainer = typeContainer;
        this.numberContainer = numberContainer;
    }

    public int getWeight() {
        return weight;
    }

    public String getTypeContainer() {
        return typeContainer;
    }

    public int getNumberContainer() {
        return numberContainer;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setTypeContainer(String typeContainer) {
        this.typeContainer = typeContainer;
    }

    public void setNumberContainer(int numberContainer) {
        this.numberContainer = numberContainer;
    }
}
