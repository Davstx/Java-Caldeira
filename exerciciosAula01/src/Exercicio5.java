import java.util.Calendar;

public class Exercicio5 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        int horaAtual = agora.get(Calendar.HOUR_OF_DAY);
        int minutoAtual = agora.get(Calendar.MINUTE);
        int segundoAtual = agora.get(Calendar.SECOND);

        int segundosPassados = horaAtual * 3600 + minutoAtual * 60 + segundoAtual;
        int segundosFaltando = 86400 - segundosPassados;

        System.out.println("Desde 0h00min00s se passaram " + segundosPassados + " segundos.");
        System.out.println("Faltam: " + segundosFaltando + " segundos para a meia-noite.");
    }
}