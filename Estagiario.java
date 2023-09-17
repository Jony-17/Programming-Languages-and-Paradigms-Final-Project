package lpp.projetofinal;

public class Estagiario extends Funcionarios {
    
    private int tempototal_estagio;

    //Construtor sem parâmetros
    public Estagiario() {
        this("", 0, 0, "", 0, 0);
    }
    
    //Construtor com parâmetros
    public Estagiario (String nome, int salarioHora, int cc, String cargo, int horas_feitas, final int tempototal_estagio) {
        super(nome, salarioHora, cc, cargo, horas_feitas);
        this.tempototal_estagio = tempototal_estagio;
    }

    //Construtor de cópia
    public Estagiario(Estagiario Estagiario_copia) {
        super(Estagiario_copia);
        tempototal_estagio = Estagiario_copia.tempototal_estagio;
    }

    //Métodos get
    public int getTempototal_estagio() {
        return tempototal_estagio;
    }
    
    //Método set

    public void setTempototal_estagio(int tempototal_estagio) {
        this.tempototal_estagio = tempototal_estagio;
    }
    
 
    //Sobreposição do método print()
    @Override
    public void print(){
        super.print();
        System.out.println("Tempo total de estágio: "+tempototal_estagio);
    }
    
     public final int CalcularHorasRestantes() {
        int horasRestantes = tempototal_estagio - horas_feitas;
        //System.out.println("Horas restantes de estágio: " + horasRestantes);
        return horasRestantes;
    }
    
}
