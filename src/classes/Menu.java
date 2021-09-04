package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    public static int option;
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<LandLine> landLineCalls = new ArrayList<LandLine>();
    public static ArrayList<CellphoneLine> CellphoneLineCalls = new ArrayList<CellphoneLine>();
    public static ArrayList<VozIP> vozIPCalls = new ArrayList<VozIP>();

    public Menu() {
        startMenu();
    }

    public static void startMenu() {
        do {
            System.out.println("\nMENU");
            System.out.println("1. Register call");
            System.out.println("2. Land line info");
            System.out.println("3. Cellphone line info");
            System.out.println("4. VozIP line info");
            System.out.println("5. Occupation percentage");
            System.out.println("6. Summary");
            System.out.println("7. Get out");
            System.out.print("Enter an option: ");
            option = scanner.nextInt();
            System.out.println();
            
            switch (option) {
                case 1:
                    registerCall();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("See you!\n");
                    return;
            }
        } while (option>= 1 && option <= 6);
    }

    public static void registerCall() {
        
        int optionCall;
        
        do {
            System.out.println("\nSelect call line");
            System.out.println("1. Land line");
            System.out.println("2. Cellphone line");
            System.out.println("3. VozIP line");
            System.out.println();
            optionCall = scanner.nextInt();
            System.out.println();

            switch (optionCall) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                default:
                    break;
            }

        } while (optionCall>= 1 && optionCall <= 3);   
    }

}
