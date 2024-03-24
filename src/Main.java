public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
            /* Изначальный код не работет так как при выполнении происходит деление на 0
              Для решение проблемы нужно добавить проверку деления на 0
             */
        calc.println.accept(c);
    }
}