package Docks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    protected static void menu(Port port){
        Scanner in = new Scanner(System.in);
        List<Ship> ship = new ArrayList<>();
        ship.add(new Ship(0));
        ship.add(new Ship(1));
        ship.add(new Ship(2));
        port.addCont();
        int num;
        for(;;) {
            System.out.println(ship);
            System.out.print("Какой корабль будете использовать: ");
            int verb = in.nextInt();
            System.out.println();
            System.out.println("Войти в порт - 1");
            System.out.println("Выйти из порта - 2");
            System.out.println("Загрузить корабль - 3");
            System.out.println("Разгрузить корабль - 4");
            System.out.println("Состояние Gate - 5");
            System.out.println("Выйти - 6");
            System.out.print("Что вы хотите сделать: ");
            num = in.nextInt();
            switch (num){
                case 1:
                    port.shipToPort(ship.get(verb));
                    break;
                case 2:
                    port.exitToPort(ship.get(verb));
                    break;
                case 3:
                    port.addContainer(ship.get(verb));
                    break;
                case 4:
                    port.getContainer(ship.get(verb));
                    break;
                case 5:
                    port.statusGate();
                    break;
                case 6:
                    System.out.println("See you!");
                    System.exit(1);
                default:
                    System.out.println("Error");
                    break;
            }
            System.out.println();
        }
    }
}
