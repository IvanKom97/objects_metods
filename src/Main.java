public class Main {
    public static int yearsVis(int years) {
        if (years % 4 == 0 && years != 100) {
            throw new RuntimeException("Год високосный");
        } else throw new RuntimeException("Год не високосный");
    }

    public static boolean distance(int way) {
        if (way >= 0 && way <= 20) {
            System.out.println("Время доставки занимает один день. ");
        } else if (way > 20 && way <= 60) {
            System.out.println("Время доставки занимает два дня");
        } else if (way > 60 && way <= 100) {
            System.out.println("Время доставки занимает три дня");
        } else if (way > 100) {
            System.out.println("Доставка на эту дистанцию не осуществляется");
        }
        return true;
    }

    public static boolean system(int system) {
        if (system == 0) {
            System.out.println("Ваша операционная система iOs.");
        } else if (system == 1) {
            System.out.println("Ваша операционная система Android");
        } else throw new RuntimeException("Выберите корректный номер");
        return true;
    }

    public static boolean yearOfSystem(int yearOfSystem) {
        if (yearOfSystem >= 2015) {
            System.out.println("У вас новая операционная система. \nПройдите по ссылке для скачивания");
        } else if (yearOfSystem <= 2015) {
            System.out.println("У вас старая операционная система. \nПройдите по ссылке для скачивания");
        }
        return true;
    }
    public static void main(String[] args) {
        int year = 1956;
        int check = yearsVis(year);
        System.out.println(check);

        int choice = 1;
        int year_Of_System = 2010;
        boolean something = system(choice);
        boolean valume = yearOfSystem(year_Of_System);


        int deliveryDistance = 95;
        boolean determine = distance(deliveryDistance);
    }
}