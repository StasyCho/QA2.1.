public class Main {
    public static void main(String[] args) {

        int price = 500; // стоимость билета

        int mile = 20;    // количество рублей для одной бонусной мили

        int bonus = price / mile; // Рассчитываем количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняем в новую переменную

        System.out.println(bonus); // Ответ новой переменной выводим на экран

    }
}