import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int quantity ;
        quantity = calculator.quantityOfGuest();

        while (true) {
            System.out.println("Введите название товара.");
            String name = scanner.nextLine();
            System.out.println("Введите цену товара в формате: \"рубли,копейки\" [10,45]");
            if (scanner.hasNextDouble()) {
                double cost = scanner.nextDouble();
                calculator.cheque(name, cost);
                System.out.println("Хотите добавить еще товар? \n" +
                        "(Если да,поставте любой символ ,если нет,напишите \"Завершить\". )");
            } else {
                System.out.println("Некорректная цена.Повторите ввод.");
            }
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("завершить")) {
                calculator.finalAccount(quantity);
                break;
            }
            scanner.nextLine();
        }
    }
}