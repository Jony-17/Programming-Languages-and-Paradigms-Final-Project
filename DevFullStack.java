package lpp.projetofinal;

public class DevFullStack extends Desenvolvedor{
    private boolean database;
    private boolean seguranca;
    private boolean otimizacao;
    private boolean acessibilidade;
    private boolean usabilidade;

    //Construtor com parâmetros
    public DevFullStack(String nome, int salarioHora, int cc, String cargo, int horas_feitas, boolean database, boolean seguranca, boolean otimizacao, boolean acessibilidade, boolean usabilidade, String niveldeExperiência, String tipo) {
        super(nome, salarioHora, cc, cargo, horas_feitas, niveldeExperiência, tipo);
        this.database = database;
        this.seguranca = seguranca;
        this.otimizacao = otimizacao;
        this.acessibilidade = acessibilidade;
        this.usabilidade = usabilidade;
    }
    
    //Construtor sem parâmetros
    public DevFullStack() {
        this("", 0, 0, "", 0, false, false, false, false, false, "", "");
    }

    //Construtor de cópia
    public DevFullStack(DevFullStack DevFullStack_copia) {
        super(DevFullStack_copia);
        database = DevFullStack_copia.database;
        seguranca = DevFullStack_copia.seguranca;
        otimizacao = DevFullStack_copia.otimizacao;
        acessibilidade = DevFullStack_copia.acessibilidade;
        usabilidade = DevFullStack_copia.usabilidade;
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
        System.out.println("Database: "+database);
        System.out.println("Segurança: "+seguranca);
        System.out.println("Otimização: "+otimizacao);
        System.out.println("Acessibilidade: "+acessibilidade);
        System.out.println("Usabilidade: "+usabilidade);
    }

}
