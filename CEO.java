package lpp.projetofinal;

public class CEO extends Funcionarios {
    
    private String departamento;
            
    //Construtor sem parâmetros
     public CEO() {
         this("", 0, 0, "", 0, "");
    }
     
    //Construtor com parâmetros
     public CEO (String nome, int salarioHora, int cc, String cargo, int horas_feitas, String departamento) {
        super(nome, salarioHora, cc, cargo, horas_feitas);
        this.departamento = departamento;
     }
     
    //Construtor de cópia
    public CEO(CEO CEO_copia) {
        super(CEO_copia);
        departamento = CEO_copia.departamento;
    }

    //Método get
    public String getDepartamento() {
        return departamento;
    }
    //Método set
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    //Sobreposição do método print()
    @Override
    public void print(){
        super.print();
        System.out.println("Departamento do CEO: "+departamento);
    }
}
