// для первого задачия:

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("привет, мир");
//        System.out.println("2+3");
//    }
//}

// Домашнее задание к занятию «Testability. Введение в ООП»
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}