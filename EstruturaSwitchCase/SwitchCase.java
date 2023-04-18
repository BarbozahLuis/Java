package EstruturaSwitchCase;

import java.util.Scanner;

public class SwitchCase {
    
    Scanner sc= new Scanner(System.in);
    
    public void letras() {
        System.out.println("Digite  uma letra");
        String letra = sc.nextLine();
        switch (letra) {
            case "a":System.out.println(letra+"é vogal");
            break;
            case "e":System.out.println(letra+"é vogal");
            break;
            case "i":System.out.println(letra+"é vogal");
            break;
            case "o":System.out.println(letra+"é vogal");
            break;
            case "u":System.out.println(letra+"é vogal");
            break;
            default:System.out.println(letra+"é consoante");
        }
    }
    public void mes(){
        System.out.println("Digite o numero");
        int numero = sc.nextInt();
        switch (numero){
            case 1: System.out.println("Mes de janeiro");
            break;
            case 2: System.out.println("Mes de janeiro");
            break;
            case 3: System.out.println("Mes de janeiro");
            break;
            case 4: System.out.println("Mes de janeiro");
            break;
            case 5: System.out.println("Mes de janeiro");
            break;
            case 6: System.out.println("Mes de janeiro");
            break;
            case 7: System.out.println("Mes de janeiro");
            break;
            case 8: System.out.println("Mes de janeiro");
            break;
            case 9: System.out.println("Mes de janeiro");
            break;
            case 10: System.out.println("Mes de janeiro");
            break;
            case 11: System.out.println("Mes de janeiro");
            break;
            case 12: System.out.println("Mes de janeiro");
            break;
            default: System.out.println("Não corresponde a nenhum mês");
        }
        }
    }


