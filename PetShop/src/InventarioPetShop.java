import java.util.ArrayList;
import java.util.List;

public class InventarioPetShop {
    private List<Servico> servicos = new ArrayList<>();

    public void adicionaServico(Servico servico){
        servico.setCodigo(servicos.size());
        servicos.add(servico);
    }
    public double calculaTodosServicos() {
        double totalServicos = 0;
        for (Servico s : servicos) {
            totalServicos += s.calculaPreco();
        }
        return totalServicos;
    }
    public String emitirRelatorio() {

        StringBuilder sb = new StringBuilder();
        sb.append("Nome\tData\tNome do Animal\tCódigo\tPreço\n");
        sb.append("----------------------------------------------------------\n");

        for (Servico s : servicos) {
            sb.append(formatarServico(s)).append("\n");
        }

        return sb.toString();
    }


    private String formatarServico(Servico servico) {
        String nome = servico.getNome();
        String data = servico.dataToString();
        String nomeAnimal = servico.getAnimal().getNomeAnimal();
        int codigo = servico.getCodigo();
        double preco = servico.calculaPreco();

        return String.format("%s\t%s\t%s\t\t%d\tR$ %.2f", nome, data, nomeAnimal, codigo, preco);
    }
}
