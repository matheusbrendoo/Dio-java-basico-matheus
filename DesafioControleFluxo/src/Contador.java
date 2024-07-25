import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = sc.nextInt();

       try{
            contar(parametroUm, parametroDois);
    
        } catch (ParametrosInvalidosExeption e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            
        }
    }


        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExeption {
            
            if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosExeption();
                }
                 
            int contagem = parametroDois - parametroUm;

            for (int i=1; i<= contagem; i++){
                System.out.println("Imprimundo o número " + i);

            }

            
                  
    }
}
