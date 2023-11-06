import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//    Задача 1
//    Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит
//    результат в консоль.
//    Эту проверку вы уже реализовывали в задании по условным операторам.
//    Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
//    Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение:
//    «...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».

        System.out.println();
        System.out.println("Результат выполнения задачи 1:");
        int year = 2020;
        if (year < 1584) {
            System.out.println("Високосный год еще не изобрели)");
        }
        else if (checkLeapYear(year)) {
                    System.out.println(year + " год - високосный год.");
                }
        else {
            System.out.println(year + " год - невисокосный год.");
        }

//        Задача 2
//        Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю облегченную версию приложения.
//        Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
//        Если устройство старше текущего года, предложите ему установить облегченную версию.
//        Текущий год можно получить таким способом:
//        int currentYear = LocalDate.now().getYear();
//        Или самим задать значение вручную — ввести в переменную числовое значение.
//        В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную)
//        и для какой ОС (Android или iOS) установить пользователю.

        System.out.println();
        System.out.println("Результат выполнения задачи 2:");
        selectApp(1, 2023);

//        Задача 3
//        Возвращаемся к задаче на расчет дней доставки банковской карты.
//        Текст прошлого задания:
//        В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том, когда будет доставлена
//        его карта, нужно знать расстояние от офиса до адреса доставки.
//        Правила доставки такие:
//         - Доставка в пределах 20 км занимает сутки.
//         - Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
//         - Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
//         - Свыше 100 км доставки нет.
//        То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
//        Напишите программу, которая выдает сообщение в консоль: «Потребуется дней: ... » + срок доставки.
//        Объявите целочисленную переменную
//        deliveryDistance = 95, которая содержит дистанцию до клиента.
//        Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое
//        количество дней доставки.

        System.out.println();
        System.out.println("Результат выполнения задачи 3:");
        int deliveryDistance = 95;
        int deliveryTime = defineDeliveryTime(deliveryDistance);
        if (0 < deliveryTime) {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else {
            System.out.println("Свыше 100 км доставки нет.");
        }

    }

    public static boolean checkLeapYear(int year) {
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) );
        return isLeapYear;
    }

    public static void selectApp(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (currentYear == clientDeviceYear) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
            else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        }
        else if (clientOS == 1) {
            if (currentYear == clientDeviceYear) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
            else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }
        else {
            System.out.println("Ваша версия ОС не поддерживается.");
        }
    }
    public static int defineDeliveryTime(int deliveryDistance) {
        byte deliveryDays = 1;
        if (deliveryDistance <= 20) {
            return deliveryDays;
        }
        else if (deliveryDistance <= 60) {
            deliveryDays++;
            return deliveryDays;
        }
        else if (deliveryDistance <= 100) {
            deliveryDays += 2;
            return deliveryDays;
        }
        else {
            deliveryDays = 0;
            return deliveryDays;
        }
    }
}