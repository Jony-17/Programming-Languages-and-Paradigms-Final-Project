package lpp.projetofinal;

public class Desenvolvedor extends Funcionarios {
    
    private String niveldeExperiência;
    private String tipo;
    
    //Construtor sem parâmetros
    public Desenvolvedor() {
        this("", 0, 0, "", 0, "", "");
    }

    //Construtor com parâmetros
    public Desenvolvedor(String nome, int salarioHora, int cc, String cargo, int horas_feitas, String niveldeExperiência, String tipo) {
        super(nome, salarioHora, cc, cargo, horas_feitas);
        this.niveldeExperiência = niveldeExperiência;
        this.tipo = tipo;
    }

    //Construtor de cópia
    public Desenvolvedor(Desenvolvedor Desenvolvedor_copia) {
        super(Desenvolvedor_copia);
        niveldeExperiência = Desenvolvedor_copia.niveldeExperiência;
    }
    
    //Método get
    public String getNiveldeExperiência() {
        return niveldeExperiência;
    }

    //Método set
    public void setNiveldeExperiência(String niveldeExperiência) {
        this.niveldeExperiência = niveldeExperiência;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //Sobreposição do método print()
    @Override
    public void print(){
        super.print();
        System.out.println("Nível de experiência: "+niveldeExperiência);
        System.out.println("Tipo de cargo: "+tipo);
    }
}
