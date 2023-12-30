public class Main {
    public static void main(String[] args) {

        int amountTicket = 1_000;
        int amountOneMiles = 20;

        System.out.println("Стоимость билета составляет: " + amountTicket + " рублей");

        System.out.println("У нас работает бонусная программа, за кажные потраченные 20 рублей за билет" +
                " Вам начисляется 1 бонусная миля.");

        System.out.println("При покупке этого билета Вам будет начислен бонус: " + amountTicket / amountOneMiles);
    }

}
