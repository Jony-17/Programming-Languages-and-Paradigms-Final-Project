package lpp.projetofinal;

public class DevFrontEnd extends Desenvolvedor{
    private boolean acessibilidade;
    private boolean usabilidade;

    //Construtor com parâmetros
    public DevFrontEnd(String nome, int salarioHora, int cc, String cargo, int horas_feitas, boolean acessibilidade, boolean usabilidade, String niveldeExperiência, String tipo) {
        super(nome, salarioHora, cc, cargo, horas_feitas, niveldeExperiência, tipo);
        this.acessibilidade = acessibilidade;
        this.usabilidade = usabilidade;
    }
    
    //Construtor sem parâmetros
    public DevFrontEnd() {
        this("", 0, 0, "", 0, false, false, "", "");
    }

    //Construtor de cópia
    public DevFrontEnd(DevFrontEnd DevFrontEnd_copia) {
        super(DevFrontEnd_copia);
        usabilidade = DevFrontEnd_copia.usabilidade;
        usabilidade = DevFrontEnd_copia.usabilidade;
    }
    
    //Métodos getters e setters
    public boolean isAcessibilidade() {
        return acessibilidade;
    }

    public void setAcessibilidade(boolean acessibilidade) {
        this.acessibilidade = acessibilidade;
    }

    public boolean isUsabilidade() {
        return usabilidade;
    }

    public void setUsabilidade(boolean usabilidade) {
        this.usabilidade = usabilidade;
    }      
    
    //Sobreposição do método print()
    @Override
    public void print(){
        super.print();
        System.out.println("Acessibilidade: "+acessibilidade);
        System.out.println("Usabilidade: "+usabilidade);
    }
}
