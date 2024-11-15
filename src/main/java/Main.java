import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("24 часа Ле-Мана");
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = 3;
        Race rs = new Race();

        for (int i = 0; i<numberOfCars; i++){
            System.out.println("— Введите название машины № " + (rs.getNumberCarInRace()+1));
            String brand = scanner.next();
            for(;true;) {
                System.out.println("— Введите скорость машины № " + (rs.getNumberCarInRace() + 1));
                int speed = scanner.nextInt();
                if (speed>0 && speed<=250){
                    rs.addCarToRace(new Car(brand,speed));
                    break;
                }
                System.out.println("— Неправильная скорость");
            }

        }
        System.out.println("Самая быстрая машина: " + rs.getWinner());
        scanner.close();
    }
}