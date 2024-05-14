import java.util.Scanner;

public class Usuario {
  
    public static void main(String[] args) throws Exception {
        

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        
        smartTv.ligar ();

        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.desligar(); 

        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();

        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Volume Atual: " + smartTv.volume);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o novo canal?");

        smartTv.mudarCanal(scanner.nextInt());

        System.out.println("Canal atual: " + smartTv.canal);



    }
}
