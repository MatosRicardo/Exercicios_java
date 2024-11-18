package exercicio2;

public class PrincipalAniversario {
    public static void main(String[] args) {
        Aniversario festa = new Aniversario();

        festa.local = "Copacababa";
        festa.data = "15/05/2024";
        festa.numeroConvidados = 25;
        festa.tema = "Futebol";
        festa.hora = "12:00";

        festa.Festa();
    }
}
