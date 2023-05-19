import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Servico {
    private int codigo;
    private Animal animal;
    private String nome;
    private LocalDateTime data;
    public Servico(Animal animal){
        setAnimal(animal);
        data = LocalDateTime.now();
    }
    public abstract double calculaPreco();
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public Animal getAnimal(){
        return animal;
    }

    public void setAnimal(Animal a){
        animal = a;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String dataToString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return data.format(formatter);
    }
}
