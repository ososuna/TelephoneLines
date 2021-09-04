package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    public static int option;
    public static Scanner scanner = new Scanner(System.in);
    
    public static ArrayList<LandLine> landLineLocalCalls = new ArrayList<LandLine>();
    public static ArrayList<LandLine> landLineCellphoneCalls = new ArrayList<LandLine>();
    public static ArrayList<LandLine> landLineLongDistanceCalls = new ArrayList<LandLine>();
    
    public static ArrayList<CellphoneLine> cellphoneLineLocalCalls = new ArrayList<CellphoneLine>();
    public static ArrayList<CellphoneLine> cellphoneLineCellphoneCalls = new ArrayList<CellphoneLine>();
    
    public static ArrayList<VozIP> vozIPLocalCalls = new ArrayList<VozIP>();
    public static ArrayList<VozIP> vozIPCellphoneCalls = new ArrayList<VozIP>();
    public static ArrayList<VozIP> vozIPLongDistanceCalls = new ArrayList<VozIP>();


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
        
        LandLine landLineCall = new LandLine(time);
        
        switch (callType) {
            case 1:
                landLineLocalCalls.add(landLineCall);
                break;       
            case 2:
                landLineLongDistanceCalls.add(landLineCall);
                break;
            case 3:
                landLineCellphoneCalls.add(landLineCall);
                break;
            default:
                break;
        }
    }

    public static void addCellphoneLineCall(double time, int callType) {
        
        CellphoneLine cellphoneLineCall = new CellphoneLine(time);
        
        switch (callType) {
            case 1:
                cellphoneLineLocalCalls.add(cellphoneLineCall);
                break;       
            case 2:
                cellphoneLineCellphoneCalls.add(cellphoneLineCall);
                break;
            default:
                break;
        }
    }

    public static void addVozIPCall(double time, int callType) {

        VozIP vozIPCall = new VozIP(time);

        switch (callType) {
            case 1:
                vozIPLocalCalls.add(vozIPCall);
                break;
            case 2:
                vozIPLongDistanceCalls.add(vozIPCall);
                break;
            case 3:
                vozIPCellphoneCalls.add(vozIPCall);
                break;
            default:
                break;
        }

    }

}
