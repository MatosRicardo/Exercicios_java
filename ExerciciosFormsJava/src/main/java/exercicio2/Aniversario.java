package exercicio2;

public class Aniversario extends ExercicioAniversario {
    public Aniversario() {
        super("", "", 0, "", "");
    }
    @Override
    public void Festa() {
        System.out.println("O local da festa será: " + local);
        System.out.println("A data da festa será no dia: " + data);
        System.out.println("O total de convidados: " + numeroConvidados);
        System.out.println("O tema da festa é : " + tema);
        System.out.println("A hora de ínicio da feste é " + hora);
    }
}
