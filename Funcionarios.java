public class Funcionarios {
    private String nome;
    private double salarioBase;

    public Funcionarios(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return this.salarioBase;
    }

    public void setSalario(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public void calcularSalario(){
        double salarioFinal;
        salarioFinal = getSalario();
        System.out.println("Nome: " + nome);
        System.out.println("Salário Final: " + salarioFinal);
    }
}
