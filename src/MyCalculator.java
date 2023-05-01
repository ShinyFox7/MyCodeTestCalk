import java.util.Scanner;


class Calculator {


    public static void main(String[] args) { //
        String row = getRow();  // получаем строку введенную пользователем
        String[] rowArray;  //обьявляем массив строк с числами
        Integer first; //обьявляем первое число
        Integer last; // объявляем второе число
        Integer result; //объявляем переменную результата математической операции
        if (row.contains("+")) {  //проверяем содержит ли строка символ математ опервации в данном случае +
            rowArray = row.split("\\+"); //делим строку с разделителем +
            first = Integer.valueOf(rowArray[0]); //парсим первое число
            last = Integer.valueOf(rowArray[1]);  //парсим второе число
            result = first + last;  // проводим математ опер
        } else if (row.contains("-")) {
            rowArray = row.split("\\-");
            first = Integer.valueOf(rowArray[0]);
            last = Integer.valueOf(rowArray[1]);
            result = first - last;
        } else if (row.contains("/")) {
            rowArray = row.split("/");
            first = Integer.valueOf(rowArray[0]);
            last = Integer.valueOf(rowArray[1]);
            result = first / last;
        } else if (row.contains("\\*")) {
            rowArray = row.split("\\*");
            first = Integer.valueOf(rowArray[0]);
            last = Integer.valueOf(rowArray[1]);
            result = first * last;
        } else {
            throw new IllegalArgumentException();  //кидаем исключение если операция введена неправильно
        }
        System.out.println(result); //выводим результат
    }

    public static String getRow() {
        System.out.println("Введите оперцию");
        Scanner scanner = new Scanner(System.in); //создаем объект типа сканер
        String row = scanner.nextLine(); //при помощи объекта типа сканер считываем строку
        row = row.replace(" ", ""); //избавляемся от пробелов
        return row; //возвращаем полученную строку без пробелов

    }


}



