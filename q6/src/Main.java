import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual eletrônico você deseja?: ");
        String escolha = s.nextLine().toLowerCase();
        switch (escolha){
            case "smartphone":
                System.out.println("Qual a marca?: ");
                String smart = s.nextLine();
                System.out.println("Qual o modelo?: ");
                String smart1 = s.nextLine();
                System.out.println("Qual o preço?: ");
                String smart2 = s.nextLine();
                System.out.println("Qual a descrição do produto?: ");
                String smart3 = s.nextLine();
                Smartphone smartphone = new Smartphone(smart,smart1,smart2,smart3);
                System.out.println(smartphone);
                break;
            case "televisao":
                System.out.println("Qual a marca da TV?: ");
                String tv = s.nextLine();
                System.out.println("Qual o modelo da TV?: ");
                String tv1 = s.nextLine();
                System.out.println("Qual o preço da TV?: ");
                String tv2 = s.nextLine();
                System.out.println("Digite uma descrição para a TV: ");
                String tv3 = s.nextLine();
                Televisao televisao = new Televisao(tv,tv1,tv2,tv3);
                System.out.println(televisao);
                break;

            case "computador":
                System.out.println("Qual a marca do computador?:");
                String pc = s.nextLine();
                System.out.println("Qual o modelo do computador?:");
                String pc1 = s.nextLine();
                System.out.println("Qual o preço do computador?:");
                String pc2 = s.nextLine();
                System.out.println("Digite uma descrição para o computador: ");
                String pc3 = s.nextLine();
                Computador computador = new Computador(pc,pc1,pc2,pc3);
                System.out.println(computador);
                break;
        }
    }
}