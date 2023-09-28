interface Tributavel {
    double calculaTributos();
}

class Conta {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public double obterSaldo() {
        return saldo;
    }
}

class ContaPoupanca extends Conta implements Tributavel {
    @Override
    public double calculaTributos() {
        return 0;
    }
}

class ContaCorrente extends Conta implements Tributavel {
    @Override
    public double calculaTributos() {
        return saldo * 0.01;
    }
}

class SeguroDeVida implements Tributavel {
    @Override
    public double calculaTributos() {
        return 42.0;
    }
}

class GerenciadorDeImpostoDeRenda {
    private double totalTributos = 0;

    public void adicionar(Tributavel tributavel) {
        totalTributos += tributavel.calculaTributos();
    }

    public double getTotalTributos() {
        return totalTributos;
    }
}

class TestaTributavel {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(1000);

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(2000);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        gerenciador.adicionar(contaPoupanca);
        gerenciador.adicionar(contaCorrente);
        gerenciador.adicionar(seguroDeVida);

        System.out.println("Total de tributos a pagar: R$" + gerenciador.getTotalTributos());
    }
}