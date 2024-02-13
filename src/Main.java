public class Main {
    public static int yearsVis(int years) {
        if (years % 4 == 0 && years != 100) {
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");
        return years;
    }


    public static int distance(int way) {
        if (way >= 0 && way <= 20) {
            System.out.println("Время доставки занимает один день. ");
        } else if (way > 20 && way <= 60) {
            System.out.println("Время доставки занимает два дня");
        } else if (way > 60 && way <= 100) {
            System.out.println("Время доставки занимает три дня");
        } else if (way > 100) {
            System.out.println("Доставка на эту дистанцию не осуществляется");
        }
        return way;
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
        int year = 2020;
        int check = yearsVis(year);


        int choice = 1;
        int yearOfSystems = 2010;
        boolean something = system(choice);
        boolean valume = yearOfSystem(yearOfSystems);


        int deliveryDistance = 95;
        int determine = distance(deliveryDistance);
    }
}