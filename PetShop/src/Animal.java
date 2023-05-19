

public class Animal {
    private String tamanho;
    private String tamanhoPelo;
    private String nomeAnimal;

    public Animal(String nomeAnimal, String tamanho, String tamanhoPelo){
        this.nomeAnimal = nomeAnimal;
        this.tamanho = tamanho.toLowerCase();
        this.tamanhoPelo = tamanhoPelo.toLowerCase();
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }


    public String getTamanhoPelo() {
        return tamanhoPelo;
    }


    public String getTamanho() {
        return tamanho;
    }
    @Override
    public String toString(){
        return "Animal: " + nomeAnimal + "\nTamanho: " + tamanho + "\nTamanho do pelo: " + tamanhoPelo;
    }
}
