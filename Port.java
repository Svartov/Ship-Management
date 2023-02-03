package Docks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Port{
    Scanner in = new Scanner(System.in);
    private boolean gataEn = false;
    private boolean getaTo = false;
    private List<Container> containers = new ArrayList<>();

    public Port() {
    }

    protected boolean getGateEn() {
        return gataEn;
    }

    protected boolean getGetaTo() {
        return getaTo;
    }

    protected void setGateEn(boolean gateEn) {
        this.gataEn = gateEn;
    }

    protected void setGetaTo(boolean geteTo) {
        this.getaTo = geteTo;
    }
    protected List<Container> getContainers() {
        return containers;
    }

    protected void shipToPort(Ship ship){
        System.out.print("Введите гейт: ");
        int gate = in.nextInt();
        if(!ship.getShipInPort()) {
            if (gate == 1 && !getGateEn()) {
                ship.setShipInPort(true);
                ship.setNumberGate(gate);
                setGateEn(true);
                System.out.println("Корабль номер: "  + ship.getShipNumber() + ". Удачно зашёл в порт: " + ship.getNumberGate());
            }else if (gate == 2 && !getGetaTo()) {
                ship.setShipInPort(true);
                ship.setNumberGate(gate);
                setGetaTo(true);
                System.out.println("Корабль номер: "  + ship.getShipNumber() + ". Удачно зашёл в порт: " + ship.getNumberGate());
            } else if (gate > 2 || gate < 0) {
                System.out.println("Не верно введён гейт");
            }else {
                System.out.println("Гейт: " + gate + " занят, список гейтов 1 / 2: " + gataEn + " " + getaTo);
            }
        }else{
            System.out.println("Данный корабль находится уже в порту - " + ship.getNumberGate() + ", загружность коробля: " + ship.getContainers().size());
        }
    }

    protected void exitToPort(Ship ship){
        System.out.print("Введите гейт: ");
        int shipNum = in.nextInt();
        if(ship.getShipInPort()) {
            if (shipNum == 1 && getGateEn()) {
                ship.setShipInPort(false);
                ship.setNumberGate(0);
                setGateEn(false);
                System.out.println("Корабль номер: "  + ship.getShipNumber() + ". Удачно вышел из порта: " + ship.getNumberGate());
            }else if (shipNum == 2 && getGetaTo()) {
                ship.setShipInPort(false);
                ship.setNumberGate(0);
                setGetaTo(false);
                System.out.println("Корабль номер: "  + ship.getShipNumber() + ". Удачно вышел из порта: " + ship.getNumberGate());
            } else if (shipNum > 2 || shipNum < 0) {
                System.out.println("Не верно введён гейт");
            }else {
                System.out.println("Гейт: " + shipNum + " пустой, список гейтов 1 / 2: " + gataEn + " " + getaTo);
            }
        }else{
            System.out.println("Данный корабль не находится в порту - " + ship.getNumberGate() + ", загружность коробля: " + ship.getContainers().size());
        }
    }

    protected void addContainer(Ship ship){
        System.out.print("Введите количество контейнеров: ");
        int num = in.nextInt();
        if(ship.getShipInPort()) {
            if (num <= 10 && (!(ship.getContainers().size() + num > 10))) {
                for (int i = 0; i < num; i++) {
                    ship.setContInBot(containers.get(0));
                    try {
                        Thread.sleep(5000);
                        System.out.println("Загружено: " + ship.getContainers().size() + " контейнеров");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(ship.toString());
            }else {
                System.out.println("Ошибка, вы ложите контейнеров больше чем может хранить корабль!");
                System.out.println("Контейнеров на борту: " + ship.getContainers().size() + " " + "Можно положить: " + (10 - ship.getContainers().size()));
            }
        }else{
            System.out.println("Ошибка, кобраль не в порту!");
        }
    }

    protected void getContainer(Ship ship){
        System.out.print("Введите количество контейнеров: ");
        int num = in.nextInt();
        if(ship.getShipInPort()) {
            if (num <= 10 && ship.getContainers().size() > 0 && ship.getContainers().size() >= num) {
                for (int i = 0; i < num; i++) {
                containers.add(ship.getContInBot());
                    try {
                        Thread.sleep(5000);
                        System.out.println("Осталось: " + ship.getContainers().size() + " контейнеров");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Корабль был разгружен");
            } else {
                System.out.println("Ошибка, забираете контейнеров больше чем есть на корабле!");
                System.out.println("Контейнеров на борту: " + ship.getContainers().size() + " " + "Можно положить: " + ship.getContainers().size());
            }
        }else{
            System.out.println("Ошибка, кобраль не в порту!");
        }
    }

    protected void statusGate(){
        System.out.println("Gate 1 = " + gataEn + " " + "Gate 2 = " + getaTo);
        System.out.println("false - cвободно, true - занято");
    }

    protected void addCont(){
        for(int i = 0; i < 50; i++){
            containers.add(new Container(500, "Car", i));
        }
    }
}
