public class Banho extends Servico {
    public Banho(Animal animal) {
        super(animal);
        this.setNome("Banho");
    }

//    @Override
    public double calculaPreco() {
        double valor = 0;
        switch (getAnimal().getTamanho()) {
            case "p":
                valor = 20;
                break;
            case "m":
                valor = 30;
                break;
            case "g":
                valor = 40;
                break;
            default:
                throw new RuntimeException("O tamanho do animal é inválido: " + getAnimal().getTamanho());
        }

        switch (getAnimal().getTamanhoPelo()) {
            case "curto":
                break;
            case "médio":
                valor += 10;
                break;
            case "longo":
                valor += 20;
                break;
            default:
                throw new RuntimeException("O tamanho do pelo do animal é invalido: " + getAnimal().getTamanhoPelo());
        }
        return valor;
    }
}