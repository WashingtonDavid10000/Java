package Interface.Equipamentos.MultiFuncional;

import Interface.Equipamentos.Copiadora.Copiadora;
import Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Interface.Equipamentos.Impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Impressora, Digitalizadora{

    @Override
    public void Copiar() {
        // TODO Auto-generated method stub
        System.out.println("Copiando via equipamento multi-funcional");
    }

    @Override
    public void Imprimir() {
        // TODO Auto-generated method stub
        System.out.println("Imprimindo via equipamento multi-funcional");
    }

    @Override
    public void Digitalizar() {
        // TODO Auto-generated method stub
        System.out.println("Digitalizando via equipamento multi-funcional");
    }
    
}
