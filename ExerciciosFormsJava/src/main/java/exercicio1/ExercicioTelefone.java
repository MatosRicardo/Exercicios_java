package exercicio1;

public class ExercicioTelefone {
    String modelo;
    String cor;
    int ano;
    int carga;
    int ram;


    //Enviando os dados com o elemento GET
    String getModelo(){
        return modelo;
    }
    //Recebendo com o Void
    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    String getCor(){
        return cor;
    }
    void setCor(String cor) {
        this.cor = cor;
    }
    int getAno(){
        return ano;
    }
    void setAno(int ano) {
        this.ano = ano;
    }
    int getCarga(){
        return carga;
    }
    void setCarga(int carga) {
        this.carga = carga;
    }
    int getRam(){
        return ram;
    }
    void setRam(int ram) {
        this.ram = ram;
    }

    //colocando um estado atual para o celular novo
    void estado(){
        System.out.println("Esse celular é do modelo: " + modelo);
        System.out.println("Esse celular tem a cor: " + cor);
        System.out.println("Esse celular foi fabricado no ano: " + ano);
        System.out.println("Esse celular está com a carga atual de : " + carga + "%");
        System.out.println("Esse celular tem a memória ram de: " + ram + " ram");
    }

}
