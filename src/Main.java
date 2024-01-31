public class Main {
    public static void main(String[] args) {
        int firstAmount = 500; // Начальный счет
        int newAmount = 1500;   // Сумма пополнения
        int totalAmount;    // Итоговый счет

        int bonus;
        if (newAmount > 1000){
            bonus = newAmount / 100;
        } else {
            bonus = 0;
        }

        totalAmount = firstAmount + newAmount + bonus;

        System.out.println("Начальный счет: " + firstAmount);
        System.out.println("Сумма пополнения: " + newAmount);
        System.out.println("Итоговый счет: " + totalAmount);
        System.out.println("Сумма бонусов: " + bonus);
        }
    }