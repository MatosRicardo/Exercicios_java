package exercicio1;

public class PrincipalCelular {
    public static void main(String[] args) {
        ExercicioTelefone celular1 = new ExercicioTelefone();

        celular1.ano = 2024;
        celular1.modelo = "Iphone 16";
        celular1.cor = "Vermelho";
        celular1.ram = 8;
        celular1.carga = 90;

        celular1.estado();  // chamando o estado atual do celular
    }
}
