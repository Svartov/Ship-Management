package Docks;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private int shipNumber;
    private boolean shipInPort = false;
    private int numberGate;
    private List<Container> containers = new ArrayList<>();

    public Ship(int shipNumber) {
        this.shipNumber = shipNumber;
    }

    public int getShipNumber() {
        return shipNumber;
    }

    public boolean getShipInPort() {
        return shipInPort;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setShipNumber(int shipNumber) {
        this.shipNumber = shipNumber;
    }

    public void setContInBot(Container container){
        containers.add(container);
    }

    public Container getContInBot(){
        containers.get(0);
        containers.remove(0);
        return null;
    }

    public void setShipInPort(boolean shipInPort) {
        this.shipInPort = shipInPort;
    }

    public void setNumberGate(int numberGate) {
        this.numberGate = numberGate;
    }

    public boolean isShipInPort() {
        return shipInPort;
    }

    public int getNumberGate() {
        return numberGate;
    }

    @Override
    public String toString() {
        return "Ship[" + "shipNumber: " + shipNumber + ", shipInPort: " + shipInPort + ", containers: " + containers + ']';
    }
}
