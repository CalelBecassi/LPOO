public class Ex6 {
    public class Funcionario{
        String nome = "Calel";
        String depart = "Facom";
        double salario = 4500.50;
        //Data data = new Data(05, 03, 2018);
        String RG = "12.345.678-90";

        void recebeAumento(double x){
            this.salario = this.salario + x;
        }

        double calculaGanhoAnual(){
            return this.salario * 12;
        }

        void mostra(){
            System.out.println(nome);
            System.out.println(depart);
            System.out.println(salario);
            //System.out.printf("%d/%d/%d\n", data.dia, data.mes, data.ano);
            System.out.println(RG);
        }
    }  
       
    public static void main(String[] args){
        Ex6 func = new Ex6();

        func.mostra();
    } 
}