public class Gerentes extends Funcionarios{
    private double bonusSalarial;

    public Gerentes(String nome, double salarioBase, double bonusSalarial){
        super(nome, salarioBase);
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonus(){
        return this.bonusSalarial;
    }

    public void setBonus(double bonusSalarial){
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public void calcularSalario(){
        double salarioFinal;
        salarioFinal = getSalario() + bonusSalarial;
        System.out.println("Nome: " + getNome());
        System.out.println("Salário Final: " + salarioFinal);
        System.out.println(" ");
    }
} 
