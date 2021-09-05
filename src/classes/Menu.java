package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    public static int option;
    public static Scanner scanner = new Scanner(System.in);
    
    public static ArrayList<LandLine> landLineCalls = new ArrayList<LandLine>();
    public static ArrayList<CellphoneLine> cellphoneLineCalls = new ArrayList<CellphoneLine>();
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
                    System.out.println(landLineCalls);
                    break;
                case 3:
                    System.out.println(cellphoneLineCalls);
                    break;
                case 4:
                    System.out.println(vozIPCalls);
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
        
        int optionLine;
        int optionCall;
        double time;        

        System.out.println("\nSelect call line");
        System.out.println("1. Land line");
        System.out.println("2. Cellphone line");
        System.out.println("3. VozIP line");
        System.out.println();
        optionLine = scanner.nextInt();
        System.out.println();

        System.out.println("Enter time in minutes: ");
        time = scanner.nextDouble();
        
        System.out.println("\nSelect call type");
        
        switch (optionLine) {
            case 1:
                System.out.println("1. Local");
                System.out.println("2. Long distance");
                System.out.println("3. Cellphone");
                optionCall = scanner.nextInt();
                System.out.println();
                addLandLineCall(time, optionCall);
                break;
            case 2:
                System.out.println("1. Local");
                System.out.println("2. Cellphone");
                optionCall = scanner.nextInt();
                System.out.println();
                addCellphoneLineCall(time, optionCall);
                break;
            case 3:
                System.out.println("1. Local");
                System.out.println("2. Long distance");
                System.out.println("3. Cellphone");
                optionCall = scanner.nextInt();
                System.out.println();
                addLandLineCall(time, optionCall);
                break;
            default:
                break;
        }

    }

    public static void addLandLineCall(double time, int callType) {
        
        LandLine landLineCall;
        
        switch (callType) {
            case 1:
                landLineCall = new LandLine(time, "Local");
                break;       
            case 2:
                landLineCall = new LandLine(time, "Long distance");
                break;
            case 3:
                landLineCall = new LandLine(time, "Cellphone");
                break;
            default:
                landLineCall = new LandLine(time, null);
                break;
        }

        landLineCalls.add(landLineCall);
        
    }

    public static void addCellphoneLineCall(double time, int callType) {
        
        CellphoneLine landLineCall;
        
        switch (callType) {
            case 1:
                landLineCall = new CellphoneLine(time, "Local");
                break;       
            case 2:
                landLineCall = new CellphoneLine(time, "Cellphone");
                break;
            default:
                landLineCall = new CellphoneLine(time, null);
                break;
        }

        cellphoneLineCalls.add(landLineCall);
        
    }

    public static void addVozIPCall(double time, int callType) {
        
        VozIP vozIPCall;
        
        switch (callType) {
            case 1:
                vozIPCall = new VozIP(time, "Local");
                break;       
            case 2:
                vozIPCall = new VozIP(time, "Long distance");
                break;
            case 3:
                vozIPCall = new VozIP(time, "Cellphone");
                break;
            default:
                vozIPCall = new VozIP(time, null);
                break;
        }

        vozIPCalls.add(vozIPCall);
        
    }

}
