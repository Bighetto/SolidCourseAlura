package service.promocao;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida){
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == cargoAtual){
            throw new RuntimeException("Gerentes nao podem ser promovidos!");
        }

        if (metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
            
        }else {
            throw new RuntimeException("Funcionario nao bateu a meta!");
        }
    }
}
