package lpp.projetofinal;

public class DevBackEnd extends Desenvolvedor{
    private boolean database;
    private boolean seguranca;
    private boolean otimizacao;
    
    //Construtor com parâmetros
    public DevBackEnd(String nome, int salarioHora, int cc, String cargo, int horas_feitas, boolean database, boolean seguranca, boolean otimizacao, String niveldeExperiência, String tipo) {
        super(nome, salarioHora, cc, cargo, horas_feitas, niveldeExperiência, tipo);
        this.database = database;
        this.seguranca = seguranca;
        this.otimizacao = otimizacao;
    }
    
    //Construtor sem parâmetros
    public DevBackEnd() {
        this("", 0, 0, "", 0, false, false, false, "", "");
    }

    //Construtor de cópia
    public DevBackEnd(DevBackEnd DevBackEnd_copia) {
        super(DevBackEnd_copia);
        database = DevBackEnd_copia.database;
        seguranca = DevBackEnd_copia.seguranca;
        otimizacao = DevBackEnd_copia.otimizacao;
    }
    
    
    //Métodos getters e setters
    public boolean isDatabase() {
        return database;
    }

    public void setDatabase(boolean database) {
        this.database = database;
    }

    public boolean isSeguranca() {
        return seguranca;
    }

    public void setSeguranca(boolean seguranca) {
        this.seguranca = seguranca;
    }

    public boolean isOtimizacao() {
        return otimizacao;
    }

    public void setOtimizacao(boolean otimizacao) {
        this.otimizacao = otimizacao;
    }
    
    //Sobreposição do método print()
    @Override
    public void print(){
        super.print();
        System.out.println("Database: "+database);
        System.out.println("Segurança: "+seguranca);
        System.out.println("Otimização: "+otimizacao);
    }
    
}