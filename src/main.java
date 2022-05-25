public class main {

    public static void main(String[] args) {
        int accountAmount = 1_500;
        int replenishmentAmount = 1_300;
        int bonus;
        if (replenishmentAmount > 1_000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }
        int balans = accountAmount + replenishmentAmount + bonus;
        System.out.println("Итоговый баланс: " + balans + " Бонус: " + bonus);
    }
}

