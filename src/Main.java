public class Main {
    public static void main(String[] args) {
        int score = 2;//счет клиента (начальные данные).
        int depositAccount = 3000; //депозитный счет клиента -счет для накопления бонусных средств.

        int bonus;

        if (depositAccount > 1000) {
            bonus = depositAccount / 100;//формула подсчета бонусных рублей за каждые доп внесенные 100р на депозит.
        } else {
            bonus = 0;
        }
        int balance = score + depositAccount + bonus;
        System.out.println("Ваш итоговый счет: " + balance + " руб.");
        System.out.println("Ваш бонус: " + bonus + " руб.");
    }
}