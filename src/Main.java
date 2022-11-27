public class Main {
    public static void main(String[] args) {

        int initialAmount = 500;
        //Cумма на счете
        int amount = 1500;
        //Сумма поступления
        int bonus = amount / 100;
        // Суммф бонуса
        if (amount < 1000) {
            bonus = 0;
        }

        if (amount < 1000) {
            bonus = amount / 100;

        }

        int endAmount = initialAmount + amount + bonus;
        //Конечная сумма на счете


        System.out.println("Сумма на счете " + initialAmount);
        System.out.println("Сумма поступлений  " + amount);
        System.out.println("Бонус  " + bonus);
        System.out.println("Конечная сумма на счете   " + endAmount);
    }
}