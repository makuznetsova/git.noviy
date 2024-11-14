public class Test2Service {
    public static void main(String[] args) {
        int a = 1000;
        // a - начальный счет
        int b = 50;
        // b - сумма пополнения
        if (b > 1000) {
            int d = b / 100;
            // d - сколько рублей в подарок
            int c = a + b + d;
            // с - итоговая сумма на счету клиента
            System.out.println("На вашем счету " + c + " рублей");
            } else {
            int q = a + b;
            // q - итоговая сумма на счету клиента без подарка
            System.out.println("На вашем счету " + q + " рублей");

        }
    }
}
