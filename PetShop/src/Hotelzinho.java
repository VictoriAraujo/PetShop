public class Hotelzinho extends Servico{
    private int horasEstadia;
    public Hotelzinho(Animal animal, int horasEstadia) {
        super(animal);
        this.horasEstadia = horasEstadia;
        setNome("Hotelzinho");
    }

    public int getHorasEstadia() {
        return horasEstadia;
    }

    public void setHorasEstadia(int horasEstadia) {
        this.horasEstadia = horasEstadia;
    }

    @Override
    public double calculaPreco() {
        double valor = 0;
        switch (getAnimal().getTamanho()){
            case "p":
                valor = 12;
                break;
            case "m":
                valor = 18;
                break;
            case "g":
                valor = 25;
                break;
            default:
                throw new RuntimeException("O tamanho do animal é invalido: "+getAnimal().getTamanho());
        }
        return valor * horasEstadia;

    }
}
