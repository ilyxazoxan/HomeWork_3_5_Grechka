public class BuckWheatStocks {
    public static void main(String[] args) {
        int sum = 0;
        int stock = 100; //Кг
        int price = 100; //Цена за кг
        int onemonth = 6; // Съедает в месяц кг
        int month = 14; // Сколько месяцев планирует питаться Василий
        int payment;

        do {
            payment = (stock * price);
            //System.out.println(payment + " рублей ");
            stock = stock - onemonth;
            //System.out.println();
            // stock--;
            sum = sum + payment;
            --month;
        } while (month > 0);

        System.out.println("Сумма которую должен заплатить василий за 14 месяцев = "
                + sum);
    }
}
