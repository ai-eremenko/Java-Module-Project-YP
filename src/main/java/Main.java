import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);
        for (int carNumber = 1; carNumber <= 3; carNumber++) {
            System.out.println("Введите название машины №" + carNumber + ":");
            String carName = scanner.next();
            int carSpeed;
            while (true) {
                System.out.println("Введите скорость машины №" + carNumber + ":");
                carSpeed = scanner.nextInt();
                if (carSpeed <= 250 && carSpeed > 0) {
                    break;
                } else {
                    System.out.println("Неправильная скорость");
                }
            }
            race.addNewCar(new Car(carName, carSpeed));
        }
        System.out.println("Самая быстрая машина: " + race.getLeaderName());
        scanner.close();
    }
}