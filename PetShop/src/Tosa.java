public class Tosa extends Servico{
    public Tosa(Animal animal) {
        super(animal);
        setNome("Tosa");
    }

    @Override
    public double calculaPreco() {
        double preco = 0;
        switch (getAnimal().getTamanho()) {
            case "p":
                preco += 22;
                break;
            case "m":
                preco += 30;
                break;
            case "g":
                preco += 40;
                break;
            default:
                throw new RuntimeException("Tamanho de animal invalido (p/m/g)");
        }

        return preco;
    }
}
