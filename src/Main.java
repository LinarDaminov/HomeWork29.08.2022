public class Main {
    public static <string> void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1.1");
        int age = 14;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершенолетием! ");
        }
        if (age < 18) {
            System.out.println("Возраст совершенолетия еще не наступил, нужно немного подождать!");
        }

        //Задача 1.2
        System.out.println("Задача 1.2 ");
        int manAge = 24;
        if (manAge >= 7 && 18 > manAge) {
            System.out.println("Ребенок ходит в школу!");
        }
        if (manAge >= 18 && 24 > manAge) {
            System.out.println("Человек уже закончил школу и ходит в университет!");
        }
        if (manAge >= 24) {
            System.out.println("Человек уже окончил университет и ему пора искать первую работу!");
        }
        //Задача 1.3
        System.out.println("Задача 1.3");
        int capacity = 102;
        int sitSeat = 60;
        int staySeat = capacity - sitSeat;
        int sitBusy = 60;
        int stayBusy = 42;
        if (sitSeat > sitBusy) {
            System.out.println("Есть еще " + (sitSeat - sitBusy) + " сидячих мест");
        }
        if (staySeat > stayBusy) {
            System.out.println("Есть еще " + (staySeat - stayBusy) + " стоячих мест");
        }
        if (staySeat == stayBusy) {
            System.out.println("Стоячих мест нет! ");
        }
        if (sitSeat == sitBusy) {
            System.out.println("Сидячих мест нет!");
        }
        //Задача 2.1
        System.out.println("Задача 2.1");
        int userAge = 14;
        if (userAge >= 18) {
            System.out.println("Поздравляем Вас с совершенолетием!");
        } else {
            System.out.println("Возраст совершенолетия еще не наступил, нужно немного подождать!");
        }
        //Задача 2.2
        System.out.println("Задача 2.2.");
        int ageUser = 9;
        if (ageUser >= 7 && 18 > ageUser) {
            System.out.println("Ребенок ходит в школу!");
        } else if (ageUser >= 18 && 24 > ageUser) {
            System.out.println("Человек уже закончил школу и ходит в университет");
        } else
            System.out.println("Человек уже окончил университет и ему пора искать первую работу!");


        // Задача 2.3
        System.out.println("Задача 2.3");
        int capacity1 = 102;// В названиях переменных добавлена цифра 1
        int sitSeat1 = 60;
        int staySeat1 = capacity1 - sitSeat1;
        int sitBusy1 = 50;
        int stayBusy1 = 42;
        if (sitSeat1 > sitBusy1) {
            System.out.println("Есть еще " + (sitSeat1 - sitBusy1) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет!");
        }
        if (staySeat1 > stayBusy1) {
            System.out.println("Есть еще " + (staySeat1 - stayBusy1) + " стоячих мест");
        } else {
            System.out.println("Стоячих мест нет! ");
        }

        // Задача 3.1
        System.out.println("Задача 3.1");
        int howOldAreYou = 26;
        if (howOldAreYou > 2 && 6 >= howOldAreYou) {
            System.out.println("Если возраст человека " + howOldAreYou + " лет, то ему нужно ходить в детский сад");
        } else if (howOldAreYou >= 7 && 18 >= howOldAreYou) {
            System.out.println("Если возраст человека " + howOldAreYou + " лет, то ему нужно ходить в школу");
        } else if (howOldAreYou >= 19 && 24 >= howOldAreYou) {
            System.out.println("Если возраст человека " + howOldAreYou + " лет, то ему нужно ходить в университет");
        } else if (howOldAreYou >= 25) {
            System.out.println("Если возраст человека " + howOldAreYou + " лет, то ему нужно ходить на работу");
        }

        // Задача 3.2
        System.out.println("Задача 3.2");
        int yearsOld = 15;
        if (yearsOld < 5) {
            System.out.println("Нельзя кататься на атракционе");
        } else if (yearsOld >= 5 && 14 > yearsOld) {
            System.out.println("Можно кататься на атракционе в сопровождении взрослого");
        } else if( yearsOld>14)       {
            System.out.println("Можно кататься на атракционе");
        }
        // Задача 3.3
        System.out.println("Задача 3.3");
        int one = 5;
        int two = 5;
        int three = 5;
        if (one>two){
             if (one>=three) {
                System.out.println("Большее число " + one);
            } else System.out.println("Большее число " + three);
            }
        else if (one<two){
            if (two>=three) {
                System.out.println("Большее число " + two);
            } else System.out.println("Большее число " + three);
        }
        else {
            if (one>three) {
            System.out.println("Большее число " + one);  }
        else if (three>one){
                System.out.println("Большее число " + three);
            } else {
                System.out.println("Все числа равны");
            }
    }
    }
}