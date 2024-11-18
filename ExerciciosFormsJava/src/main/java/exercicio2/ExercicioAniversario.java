package exercicio2;

public abstract class ExercicioAniversario {
    String local;
    String data;
    int numeroConvidados;
    String tema;
    String hora;

    public ExercicioAniversario(String local, String data, int numeroConvidados, String tema, String horario) {
        this.local = local;
        this.data = data;
        this.numeroConvidados = numeroConvidados;
        this.tema = tema;
        this.hora = horario;
    }

    public abstract void Festa();
}
