public class Desenvolvedor extends Funcionarios{
    private double horaExtra;
    private double valorHoraExtra;

    public Desenvolvedor(String nome, double salarioBase, double horaExtra, double valorHoraExtra){
        super(nome, salarioBase); 
        this.horaExtra = horaExtra;
        this.valorHoraExtra = valorHoraExtra;
    }

    public double getHoraExtra(){
        return this.horaExtra;
    }

    public void setHoraExtra(double horaExtra){
        this.horaExtra = horaExtra;
    }

    public double getValorHoraExtra(){
        return this.valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra){
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public void calcularSalario(){
        double salarioFinal;
        salarioFinal = getSalario() + (valorHoraExtra * horaExtra);
        System.out.println("Nome: " + getNome());
        System.out.println("Salário Final: " + salarioFinal);
        System.out.println(" ");
    }
}
