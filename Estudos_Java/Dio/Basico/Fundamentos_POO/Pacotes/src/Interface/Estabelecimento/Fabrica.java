package Interface.Estabelecimento;

import Interface.Equipamentos.Copiadora.Copiadora;
import Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Interface.Equipamentos.Impressora.DeskJet;
import Interface.Equipamentos.Impressora.Impressora;
import Interface.Equipamentos.Impressora.LaserJet;
import Interface.Equipamentos.MultiFuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
        Impressora imp = em;
        Digitalizadora dig = em;
        Copiadora cop = em;
        

        imp.Imprimir();
        dig.Digitalizar();
        cop.Copiar();
    }
}
