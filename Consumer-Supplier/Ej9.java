package Ejercicios;

public class Ej9 {
    public static void main(String[] args) {
        Operation multiplicar = (a, b) -> a * b;
        Operation dividir = (a, b) -> a / b;
        Operation sumar = (a, b) -> a + b;
        Operation restar = (a, b) -> a - b;

        System.out.println(calculator(-9, 7, multiplicar));
        System.out.println(calculator(-9, 7, dividir));
        System.out.println(calculator(-9, 7, sumar));
        System.out.println(calculator(-9, 7, restar));
    }

    public static int calculator(int a, int b, Operation op) {
        return op.operate(a, b);
    }

    @FunctionalInterface
    interface Operation {
        int operate(int a, int b);
    }
}
