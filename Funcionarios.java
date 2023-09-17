package lpp.projetofinal;

import java.util.Objects;
import java.io.Serializable;

public class Funcionarios implements Serializable, Interface {

    protected String nome;
    protected int salarioHora;
    protected int cc;
    protected String cargo;
    protected int horas_feitas;

    //Construtor sem parâmetros
    public Funcionarios() {
        this("", 0, 0, "", 0);
    }

    //Construtor com parâmetros
    public Funcionarios(String nome, int salarioHora, int cc, String cargo, int horas_feitas) {
        this.nome = nome;
        this.salarioHora = salarioHora;
        this.cc = cc;
        this.cargo = cargo;
        this.horas_feitas = horas_feitas;
    }

    //Construtor de cópia
    public Funcionarios(Funcionarios Funcionarios_copia) {
        nome = Funcionarios_copia.nome;
        salarioHora = Funcionarios_copia.salarioHora;
        cc = Funcionarios_copia.cc;
        cargo = Funcionarios_copia.cargo;
        horas_feitas = Funcionarios_copia.horas_feitas;
    }

    //Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(int salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHoras_feitas() {
        return horas_feitas;
    }

    public void setHoras_feitas(int horas_feitas) {
        this.horas_feitas = horas_feitas;
    }

    //Método toString()
    @Override
    public String toString() {
        if (this instanceof CEO) {
            CEO ceo = (CEO) this;
            return "CEO{" + "nome=" + nome + " | salarioHora=" + salarioHora + " | cc=" + cc + " | cargo=" + cargo + " | departamento=" + ceo.getDepartamento() + '}';
        } else if (this instanceof Estagiario) {
            Estagiario estagiario = (Estagiario) this;
            return "Estagiario{" + "nome=" + nome + " | salarioHora=" + salarioHora + " | cc=" + cc + " | cargo=" + cargo + " | horas_feitas=" + estagiario.getHoras_feitas() + " | tempototal_estagio=" + estagiario.getTempototal_estagio() + '}';
        } else if (this instanceof DevFrontEnd) {
            DevFrontEnd devfront = (DevFrontEnd) this;
            Desenvolvedor desenvolvedor = (Desenvolvedor) this;
            return "DevFrontEnd{" + "nome=" + nome + " | salarioHora=" + salarioHora + " | cc=" + cc + " | cargo=" + cargo + " | niveldeExperiência=" + desenvolvedor.getNiveldeExperiência() + " | tipo=" + desenvolvedor.getTipo() + " | acessibilidade=" + devfront.isAcessibilidade() + " | usabilidade=" + devfront.isUsabilidade() + '}';
        }else if (this instanceof DevBackEnd) {
            DevBackEnd devback = (DevBackEnd) this;
            Desenvolvedor desenvolvedor = (Desenvolvedor) this;
            return "DevBackEnd{" + "nome=" + nome + " | salarioHora=" + salarioHora + " | cc=" + cc + " | cargo=" + cargo + " | niveldeExperiência=" + desenvolvedor.getNiveldeExperiência() + " | tipo=" + desenvolvedor.getTipo() + " | database=" + devback.isDatabase() + " | seguranca=" + devback.isSeguranca() + " | otimizacao=" + devback.isOtimizacao() +'}';
        }else if (this instanceof DevFullStack) {
            DevFullStack devfull = (DevFullStack) this;
            Desenvolvedor desenvolvedor = (Desenvolvedor) this;
            return "DevFullStack{" + "nome=" + nome + " | salarioHora=" + salarioHora + " | cc=" + cc + " | cargo=" + cargo + " | niveldeExperiência=" + desenvolvedor.getNiveldeExperiência() + " | tipo=" + desenvolvedor.getTipo() + " | acessibilidade=" + devfull.isAcessibilidade() + " | usabilidade=" + devfull.isUsabilidade() + " | database=" + devfull.isDatabase() + " | seguranca=" + devfull.isSeguranca() + " | otimizacao=" + devfull.isOtimizacao() +'}';
        } else if (this instanceof Desenvolvedor) {
            Desenvolvedor desenvolvedor = (Desenvolvedor) this;
            return "Desenvolvedor{" + "nome=" + nome + " | salarioHora=" + salarioHora + " | cc=" + cc + " | cargo=" + cargo + " | niveldeExperiência=" + desenvolvedor.getNiveldeExperiência() + /*" | tipo=" + desenvolvedor.getTipo() + */ '}';
        } else {
            return "Funcionarios{" + "nome=" + nome + " | salarioHora=" + salarioHora + " | cc=" + cc + " | cargo=" + cargo + '}';
        }
    }

    //Método clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //Método equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionarios other = (Funcionarios) obj;
        if (this.salarioHora != other.salarioHora) {
            return false;
        }
        if (this.cc != other.cc) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    /*public boolean equals(Funcionarios f) {
        if (this.nome == f.nome && this.dataNascimento == f.dataNascimento && this.salarioHora == f.salarioHora && this.cc == f.cc) {
            System.out.println("Os dados são iguais.");
            return true;
        } else {
            System.out.println("Os dados são diferentes.");
            return false;
        }
    }*/
    //Método print()
    public void print() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário por hora: " + salarioHora);
        System.out.println("Cartão de cidadão: " + cc);
        System.out.println("Cargo: " + cargo);
        System.out.println("Horas feitas: " + horas_feitas);
    }

    //Método de calcular salário
    public int calcularSalario() {
        int salario = salarioHora * horas_feitas;
        return salario;
    }
}
