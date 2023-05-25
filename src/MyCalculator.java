import java.util.Scanner;


class Calculator {


    public static void main(String[] args) {
        System.out.println("Введите операцию");
        Scanner scanner = new Scanner(System.in); //создаем объект типа сканер
        String row = scanner.nextLine(); //при помощи объекта типа сканер считываем строку
        row = row.replace(" ", ""); //избавляемся от пробелов
        String[] rowArray = row.split("\\D");  //любой не чисовой символ
        Integer result; //объявляем переменную результата математической операции, резалт - целое чсло
        Integer first = Integer.valueOf(rowArray[0]); //обьявляем первую переменную и парсим первое число
        Integer last = Integer.valueOf(rowArray[1]);  //объявляем вторую переменную и парсим второе число
        if (first < 1 || first > 10) {
            throw new IllegalArgumentException("Ошибка в первом числе! Число меньше 1 или больше 10");
        }
        if (last < 1 || last > 10) {
            throw new IllegalArgumentException("Ошибка во втором числе! Число меньше 1 или больше 10");
        }
        if (row.contains("+")) { //проверяем содержит ли строка символ математ опервации в данном случае +
            result = first + last;  // проводим математ опер
        } else if (row.contains("-")) {
            result = first - last;
        } else if (row.contains("/")) {
            result = first / last;
        } else if (row.contains("\\*")) {
            result = first * last;
        } else {
            throw new IllegalArgumentException("Ошибка! Неправильная операция.");  //кидаем исключение операции
        }
        System.out.println(result); //выводим результат

    }

}



