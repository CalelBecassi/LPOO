    public class Ex1 {
        public class Funcionario{
            String nome = "Calel";
            String depart = "Facom";
            double salario = 4500.50;
            String datEnt = "05/03/2018";
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
                System.out.println(datEnt);
                System.out.println(RG);
            }
        }        

        public static void main(String[] args){
            Ex1 func = new Ex1();

            func.mostra();
        }
    }