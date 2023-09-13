import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int nivelUrgencia = 0;
        String perguntainicial;
        String perguntaIdosa;
        String perguntaGestante;
        String perguntaDeficiente;

        System.out.println("Oi, nós somos o Programa do sistema de prioridade do SUS \n você gostaria de perguntar se tem prioridade?");
        perguntainicial = scan.next();
        perguntainicial = perguntainicial.toLowerCase();
        if (perguntainicial.equals("sim")) {

            System.out.println("Você é idoso(a)?");
            perguntaIdosa = scan.next();
            perguntaIdosa = perguntaIdosa.toLowerCase();

            if (perguntaIdosa.equals("sim")) {
                nivelUrgencia++;
            }

            System.out.println("Você é gestante?");
            perguntaGestante = scan.next();
            perguntaGestante = perguntaGestante.toLowerCase();

            if (perguntaGestante.equals("sim")) {
                nivelUrgencia++;
            }

            System.out.println("Você possui alguma deficiência?");
            perguntaDeficiente = scan.next();
            perguntaDeficiente = perguntaDeficiente.toLowerCase();

            if (perguntaDeficiente.equals("sim")) {
                nivelUrgencia++;
            }

            if (nivelUrgencia == 3) {
                System.out.println("Você é prioridade Máxima (Grau 1)");
            } else if (nivelUrgencia == 2) {
                System.out.println("Você é nossa Prioridade de Grau 2");
            } else if (nivelUrgencia == 1) {
                System.out.println("Você é nossa prioridade de grau 3");

                if (perguntaIdosa.equals("sim")) {
                    System.out.println("E dentro do grau 3, Idoso é o primeira prioridade");
                } else if (perguntaGestante.equals("sim")) {
                    System.out.println("E dentro do grau 3, Gestante é o segunda prioridade");
                }else{
                    System.out.println("E dentro do grau 3, Deficiente é o terceira prioridade");
                }

            }else{
                System.out.println("Você não tem prioridade nenhuma");
            }
        }else {
            System.out.println("Fim do Programa");
        }



    }
}