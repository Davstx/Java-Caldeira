import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private int horaAtual;
    private Date horarioAtual;
    private double taxaDeManutencaoMensal;
    private List<String> historicoTransacoes;

    private boolean contaFechada;
    public ContaBancaria() {
        Calendar calendar = Calendar.getInstance();
        horaAtual = calendar.get(Calendar.HOUR_OF_DAY);
        horarioAtual = calendar.getTime();
        historicoTransacoes = new ArrayList<>();
        this.taxaDeManutencaoMensal = 12.0;
        aplicarTaxaDeManutencaoMensal();
        this.contaFechada = false;
    }

    public void fecharConta() {
        this.saldo = 0.0;
        this.contaFechada = true;
        System.out.println("Conta fechada com sucesso.");
    }

    public void saque(double valor) {
        if (!contaFechada && valor <= saldo) {
            this.saldo = saldo - valor;
            historicoTransacoes.add("Saque: " + valor + " em " + horarioAtual);
        } else if (contaFechada) {
            System.out.println("ERRO: A conta está fechada. Não é possível efetuar transações.");
        } else {
            System.out.println("ERRO: Saldo insuficiente.");
        }
    }

    public void deposito(double valor) {
        if (!contaFechada) {
            this.saldo = saldo + valor;
            historicoTransacoes.add("Depósito: " + valor + " em " + horarioAtual);
        } else {
            System.out.println("ERRO: A conta está fechada. Não é possível efetuar transações.");
        }
    }

    public void transferencia(ContaBancaria destino, double valor) {
        if (!contaFechada && horaAtual >= 8 && horaAtual < 19) {
            if (valor <= saldo) {
                saldo -= valor;
                destino.deposito(valor);
                historicoTransacoes.add("Transferência: " + valor + " para " + destino.nome + " em " + horarioAtual);
            } else {
                System.out.println("ERRO: Saldo insuficiente");
            }
        } else if (contaFechada) {
            System.out.println("ERRO: A conta está fechada. Não é possível efetuar transações.");
        } else {
            System.out.println("ERRO: Transferências disponíveis apenas entre 8h e 19h.");
        }
    }

    public double verificarSaldo() {
        return this.saldo;
    }

    public Date verificarHorario() {
        return this.horarioAtual;
    }

    public void VerificarInformacoes(){

    }

    public void verificarInformacoes() {
        System.out.println("Informações da Conta Bancária:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Identificador da Conta: " + identificadorConta);
        System.out.println("Banco: " + banco);
        System.out.println("Endereço: " + endereco);
        System.out.println("Saldo: " + saldo);
        System.out.println("Horário Atual: " + horarioAtual);
    }

    public boolean validarCPF() {
        return cpf.length() == 11 && cpf.matches("[0-9]+");
    }

    public void verificarHistoricoTransacoes() {
        System.out.println("Histórico de Transações:");
        for (String transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }

    public ContaBancaria(String nome, String cpf, String identificadorConta, String banco, String endereco, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.horaAtual = 0;
        this.horarioAtual = new Date();
    }

    public void alterarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public void aplicarTaxaDeManutencaoMensal() {
        if (!contaFechada) {
            Calendar calendar = Calendar.getInstance();
            int diaAtual = calendar.get(Calendar.DAY_OF_MONTH);

            if (diaAtual == 1) {
                saldo -= taxaDeManutencaoMensal;
                historicoTransacoes.add("Taxa de manutenção mensal aplicada: " + taxaDeManutencaoMensal + " em " + horarioAtual);
            }
        } else {
            System.out.println("ERRO: A conta está fechada. Não é possível aplicar a taxa de manutenção.");
        }
    }
}

