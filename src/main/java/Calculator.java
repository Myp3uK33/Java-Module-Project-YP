import java.util.Scanner;

public class Calculator {
    double sum = 0;
    String name = "";
    int quantity;
    Scanner scanner = new Scanner(System.in);
    public int quantityOfGuest(){
        System.out.println("Введите количество людей для разделения счета: ");
        while (true) {
            if (scanner.hasNextInt()) {
                quantity = scanner.nextInt();
                if (quantity<=1){
                    System.out.println("Нет смысла считать и делить счет для одного человека. Введите другое значение.");
                }else {
                    return quantity;
                }
            } else {
                System.out.println("Введено не корректное значение.Повторите ввод.");
            }
            scanner.nextLine();
        }
    }
    public void cheque(String name, double cost) {
        if (cost < 1) {
            System.out.println("Товар не добавлен.\nТовар не может быть бесплатным.Повторите ввод.");
        } else {
            sum += cost;
            this.name = this.name + name + "\n";
            System.out.println("Товар успешно добавлен.");
        }
    }
    public void finalAccount(int quantity){
        System.out.println("Добавленные товары: \n" + name );
        sum = sum / quantity;
        System.out.println("Каждый человек должен : \n" + String.format("%.2f",sum) + price());
    }
    public String price(){
        if ((int)(sum % 100 / 10) == 1){
            return " рублей.";
        }
        if ((int) (sum % 10) == 1){
            return " рубль.";
        } else if ((int) (sum % 10) >= 2 && (int) (sum % 10) <= 4){
            return " рубля.";
        } else {
            return " рублей.";
        }
    }
}