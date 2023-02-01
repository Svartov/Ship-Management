package Docks;

import java.util.Scanner;

public class Menu {

    protected static void menu(Port port){
        Scanner in = new Scanner(System.in);
        Ship ship = new Ship(1);
        port.addCont();
        int num;
        for(;;) {
            System.out.println("Войти в порт - 1");
            System.out.println("Выйти из порта - 2");
            System.out.println("Загрузить корабль - 3");
            System.out.println("Разгрузить корабль - 4");
            System.out.print("Что вы хотите сделать: ");
            num = in.nextInt();
            switch (num){
                case 1:
                    port.shipToPort(ship);
                    break;
                case 2:
                    port.exitToPort(ship);
                    break;
                case 3:
                    port.addContainer(ship);
                    break;
                case 4:
                    port.getContainer(ship);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            System.out.println();
        }
    }
}
