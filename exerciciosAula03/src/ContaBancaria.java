import java.util.Date;
import java.util.GregorianCalendar;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    GregorianCalendar calendar = new GregorianCalendar();
    private int horarioAtual = calendar.get(calendar.HOUR_OF_DAY);



    public void saque(double valor) {
        if (valor >= saldo) {
            this.saldo = saldo - valor;
        }
    }

    public void deposito(double valor) {
        this.saldo = saldo - valor;
    }

    public void pix(double valor) {
        if (valor >= saldo) {
            this.saldo = saldo - valor;
        }
    }

    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int horarioAtual = calendar.get(calendar.HOUR_OF_DAY);
        System.out.println(horarioAtual);
    }



}
