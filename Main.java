public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Operação de adição
        calculadora.setOperacao(new Adicao());
        System.out.println("5 + 3 = " + calculadora.calcular(5, 3));

        // Operação de subtração
        calculadora.setOperacao(new Subtracao());
        System.out.println("5 - 3 = " + calculadora.calcular(5, 3));

        // Operação de multiplicação
        calculadora.setOperacao(new Multiplicacao());
        System.out.println("5 * 3 = " + calculadora.calcular(5, 3));

        // Operação de divisão
        calculadora.setOperacao(new Divisao());
        System.out.println("5 / 3 = " + calculadora.calcular(5, 3));
    }
}