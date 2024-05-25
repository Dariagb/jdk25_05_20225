//Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(),
// multiply(), divide(), subtract().
// Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
// Методы должны возвращать результат своей работы.

public class Kalcul {


    public static <T extends Number> T sum(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else {
            throw new IllegalArgumentException("Неизвестный тип числа");
        }
    }
    public static <T extends Number> T multiply(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() * num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Неизвестный тип числа");
        }
    }

    public static <T extends Number> T divide(T num1, T num2) {
        if (num1 instanceof Integer) {
            T t = (T) Integer.valueOf(num1.intValue() / num2.intValue());
            return t;
        } else if (num1 instanceof Double) {
            T t = (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
            return t;
        } else {
            throw new IllegalArgumentException("Неизвестный тип числа");
        }
    }

    public static <T extends Number> T subtract(T num1, T num2) {
        if (num1 instanceof Integer) {
            T t = (T) Integer.valueOf(num1.intValue() - num2.intValue());
            return t;
        } else if (num1 instanceof Double) {
            T t = (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
            return t;
        } else {
            throw new IllegalArgumentException("Неизвестный тип числа");
        }
    }

    public static void main(String[] args) {
        System.out.println("Сумма: " + sum(7, 3));
        System.out.println("Произведение: " + multiply(59.5, 4.2));
        System.out.println("Деление: " + divide(20, 2));
        System.out.println("Разность: " + subtract(7.8, 2.3));
    }
}