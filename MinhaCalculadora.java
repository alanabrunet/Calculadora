interface Operacao {
    double calcular(double num1, double num2);
}

abstract class OperacaoBinaria implements Operacao {
    @Override
    public double calcular(double num1, double num2) {
        return 0; 
    }
}

class Adicao extends OperacaoBinaria {
    @Override
    public double calcular(double num1, double num2) {
        return num1 + num2;
    }
}

class Subtracao extends OperacaoBinaria {
    @Override
    public double calcular(double num1, double num2) {
        return num1 - num2;
    }
}

class Multiplicacao extends OperacaoBinaria {
    @Override
    public double calcular(double num1, double num2) {
        return num1 * num2;
    }
}

class Divisao extends OperacaoBinaria {
    @Override
    public double calcular(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
    }
}

class Calculadora {
    private Operacao operacao;

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public double calcular(double num1, double num2) {
        if (operacao != null) {
            return operacao.calcular(num1, num2);
        } else {
            throw new IllegalStateException("Nenhuma operação definida.");
        }
    }
}