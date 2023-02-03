package Docks;

public class Container{
    private int weight;
    private String typeContainer;
    private int numberContainer;

    protected Container(int weight, String typeContainer, int numberContainer) {
        this.weight = weight;
        this.typeContainer = typeContainer;
        this.numberContainer = numberContainer;
    }

    protected int getWeight() {
        return weight;
    }

    protected String getTypeContainer() {
        return typeContainer;
    }

    protected int getNumberContainer() {
        return numberContainer;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }

    protected void setTypeContainer(String typeContainer) {
        this.typeContainer = typeContainer;
    }

    protected void setNumberContainer(int numberContainer) {
        this.numberContainer = numberContainer;
    }
}
