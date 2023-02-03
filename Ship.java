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

    protected int getShipNumber() {
        return shipNumber;
    }

    protected boolean getShipInPort() {
        return shipInPort;
    }

    protected List<Container> getContainers() {
        return containers;
    }

    protected void setShipNumber(int shipNumber) {
        this.shipNumber = shipNumber;
    }

    protected void setContInBot(Container container){
        containers.add(container);
    }

    protected Container getContInBot(){
        containers.get(0);
        containers.remove(0);
        return null;
    }

    protected void setShipInPort(boolean shipInPort) {
        this.shipInPort = shipInPort;
    }

    protected void setNumberGate(int numberGate) {
        this.numberGate = numberGate;
    }

    protected boolean isShipInPort() {
        return shipInPort;
    }

    protected int getNumberGate() {
        return numberGate;
    }

    @Override
    public String toString() {
        return "[" + "shipNumber: " + shipNumber + ", gateNumber: " + getNumberGate() + ", shipInPort: " + shipInPort + ", containers: " + containers + ']';
    }
}
