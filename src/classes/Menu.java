package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    public static int option;
    public static Scanner scanner = new Scanner(System.in);

    public static double cellphoneLocalBalance = CellphoneLine.localBalance;
    public static double vozIPCellphoneLongDistanceBalance = VozIP.cellphoneLongDistanceBalance;
    
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
            System.out.println("5. Summary");
            System.out.println("6. Get out");
            System.out.print("Enter an option: ");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    registerCall();
                    break;
                case 2:
                    printLandLineCalls();
                    break;
                case 3:
                    printCellphoneLineCalls();
                    break;
                case 4:
                    printVozIPCalls();
                    break;
                case 5:
                    printSummary();
                    break;
                default:
                    System.out.println("\nSee you!\n");
                    return;
            }
        } while (option>= 1 && option <= 5);
    }

    public static void registerCall() {
        
        int optionLine;
        int optionCall;
        double time;        

        System.out.println("\nSelect call line");
        System.out.println("1. Land line");
        System.out.println("2. Cellphone line");
        System.out.println("3. VozIP line");
        System.out.print("Enter an option: ");
        optionLine = scanner.nextInt();
        System.out.println();
        
        System.out.println("\nSelect call type");
        
        switch (optionLine) {
            case 1:
                System.out.println("1. Local");
                System.out.println("2. Long distance");
                System.out.println("3. Cellphone");
                System.out.print("Enter an option: ");
                optionCall = scanner.nextInt();
                System.out.println();
                System.out.print("Enter time in minutes: ");
                time = scanner.nextDouble();                
                addLandLineCall(time, optionCall);
                break;
            case 2:
                System.out.println("1. Local");
                System.out.println("2. Cellphone");
                System.out.print("Enter an option: ");
                optionCall = scanner.nextInt();
                System.out.println();
                System.out.print("Enter time in minutes: ");
                time = scanner.nextDouble();

                if (optionCall == 1) {
                    if (time * CellphoneLine.minuteLocal > cellphoneLocalBalance) {
                        System.out.println("\nThere is not local balance available :(");
                        return;
                    }
                }
                addCellphoneLineCall(time, optionCall);
                break;
            case 3:
                System.out.println("1. Local");
                System.out.println("2. Long distance");
                System.out.println("3. Cellphone");
                System.out.print("Enter an option: ");
                optionCall = scanner.nextInt();
                System.out.println();
                System.out.print("Enter time in minutes: ");
                time = scanner.nextDouble();

                if (optionCall == 2) {
                    if (time * VozIP.minuteLongDistance > vozIPCellphoneLongDistanceBalance) {
                        System.out.println("\nThere is not cellphone and long distance balance available :(");
                        return;
                    }
                }

                if (optionCall == 3) {
                    if (time * VozIP.minuteCellphone > vozIPCellphoneLongDistanceBalance) {
                        System.out.println("\nThere is not cellphone and long distance balance available :(");
                        return;
                    }
                }

                addVozIPCall(time, optionCall);
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
        System.out.println("\nThe call has been registered successfully :)");
        
    }

    public static void addCellphoneLineCall(double time, int callType) {
        
        CellphoneLine cellphoneLineCall;
        
        switch (callType) {
            case 1:
                cellphoneLineCall = new CellphoneLine(time, "Local");
                cellphoneLocalBalance -= time * CellphoneLine.minuteLocal;
                break;       
            case 2:
                cellphoneLineCall = new CellphoneLine(time, "Cellphone");
                break;
            default:
                cellphoneLineCall = new CellphoneLine(time, null);
                break;
        }

        cellphoneLineCalls.add(cellphoneLineCall);
        System.out.println("\nThe call has been registered successfully :)");
        
    }

    public static void addVozIPCall(double time, int callType) {
        
        VozIP vozIPCall;
        
        switch (callType) {
            case 1:
                vozIPCall = new VozIP(time, "Local");
                break;       
            case 2:
                vozIPCall = new VozIP(time, "Long distance");
                vozIPCellphoneLongDistanceBalance -= time * VozIP.minuteLongDistance;
                break;
            case 3:
                vozIPCall = new VozIP(time, "Cellphone");
                vozIPCellphoneLongDistanceBalance -= time * VozIP.minuteCellphone;
                break;
            default:
                vozIPCall = new VozIP(time, null);
                break;
        }

        vozIPCalls.add(vozIPCall);
        System.out.println("\nThe call has been registered successfully :)");
        
    }

    public static void printLandLineCalls() {

        double totalLocalMinutes = 0;
        double totalLongDistanceMinutes = 0;
        double totalCellphoneMinutes = 0;
        double totalCost = 0;
        double totalMinutes = 0;

        if (landLineCalls.size() == 0) {
            System.out.println("\nThere are not land line calls registered :(");
            return;
        }

        System.out.println("\nLAND LINE CALLS\n");

        for (LandLine call : landLineCalls) {       
            System.out.println(call);
            
            switch (call.getCallType()) {
                case "Local":
                    totalLocalMinutes += call.getTime();
                    break;
                case "Long distance":
                    totalLongDistanceMinutes += call.getTime();
                    break;
                case "Cellphone":
                    totalCellphoneMinutes += call.getTime();
                    break;
                default:
                    break;
            }        
        }
        
        totalCost = totalLocalMinutes * LandLine.minuteLocal +
                    totalLongDistanceMinutes * LandLine.minuteLongDistance +
                    totalCellphoneMinutes * LandLine.minuteCellphone;
        
        totalMinutes = totalLocalMinutes + totalLongDistanceMinutes + totalCellphoneMinutes;
                     
        System.out.println("\n\nSummary:");
        System.out.println("\nNumber of calls: " + landLineCalls.size());
        System.out.println("Total local minutes: " + totalLocalMinutes);
        System.out.println("Total long distance minutes: " + totalLongDistanceMinutes);
        System.out.println("Total cellphone minutes: " + totalCellphoneMinutes); 
        System.out.println("Total minutes: " + String.format("%.1f", totalMinutes));
        System.out.println("Total cost: $" + String.format("%.2f", totalCost));
        System.out.println("Average cost per minute: $" + String.format("%.2f", totalCost / totalMinutes));
        System.out.println();
    }

    public static void printCellphoneLineCalls() {

        double totalLocalMinutes = 0;
        double totalCellphoneMinutes = 0;
        double totalCost = 0;
        double totalMinutes = 0;

        if (cellphoneLineCalls.size() == 0) {
            System.out.println("\nThere are not cellphone line calls registered :(");
            System.out.println("\nAvailable local balance: $" + String.format("%.2f", cellphoneLocalBalance));
            System.out.println();
            return;
        }

        System.out.println("\nCELLPHONE CALLS\n");

        for (CellphoneLine call : cellphoneLineCalls) {       
            System.out.println(call.toString());
            
            switch (call.getCallType()) {
                case "Local":
                    totalLocalMinutes += call.getTime();
                    break;
                case "Cellphone":
                    totalCellphoneMinutes += call.getTime();
                    break;
                default:
                    break;
            }        
        }
        
        totalCost = totalLocalMinutes * CellphoneLine.minuteLocal +
                    totalCellphoneMinutes * CellphoneLine.minuteCellphone;

        totalMinutes = totalLocalMinutes + totalCellphoneMinutes;

        System.out.println("\n\nSummary:");
        System.out.println("\nNumber of calls: " + cellphoneLineCalls.size());
        System.out.println("Total local minutes: " + totalLocalMinutes);
        System.out.println("Total cellphone minutes: " + totalCellphoneMinutes); 
        System.out.println("Total minutes: " + String.format("%.1f", totalMinutes));
        System.out.println("Total cost: $" + String.format("%.2f", totalCost));
        System.out.println("Available local balance: $" + String.format("%.2f", cellphoneLocalBalance));
        System.out.println("Average cost per minute: $" + String.format("%.2f", totalCost / totalMinutes));
        System.out.println();
    }

    public static void printVozIPCalls() {

        double totalLocalMinutes = 0;
        double totalLongDistanceMinutes = 0;
        double totalCellphoneMinutes = 0;
        double totalCost = 0;
        double totalMinutes = 0;

        if (vozIPCalls.size() == 0) {
            System.out.println("\nThere are not vozIP calls registered :(");
            System.out.println("\nAvailable cellphone and long distance balance: $" + String.format("%.2f", vozIPCellphoneLongDistanceBalance));
            return;
        }

        System.out.println("\nVOZIP CALLS\n");

        for (VozIP call : vozIPCalls) {     
            System.out.println(call);
            
            switch (call.getCallType()) {
                case "Local":
                    totalLocalMinutes += call.getTime();
                    break;
                case "Long distance":
                    totalLongDistanceMinutes += call.getTime();
                    break;
                case "Cellphone":
                    totalCellphoneMinutes += call.getTime();
                    break;
                default:
                    break;
            }        
        }

        totalCost = totalLocalMinutes * VozIP.minuteLocal +
                    totalLongDistanceMinutes * VozIP.minuteLongDistance +
                    totalCellphoneMinutes * VozIP.minuteCellphone;
                
        totalMinutes = totalLocalMinutes + totalLongDistanceMinutes + totalCellphoneMinutes;
        
        System.out.println("\n\nSummary:");
        System.out.println("Number of calls: " + vozIPCalls.size());
        System.out.println("Total local minutes: " + totalLocalMinutes);
        System.out.println("Total long distance minutes: " + totalLongDistanceMinutes);
        System.out.println("Total cellphone minutes: " + totalCellphoneMinutes);
        System.out.println("Total minutes: " + String.format("%.1f", totalMinutes));
        System.out.println("Total cost: $" + String.format("%.2f", totalCost));
        System.out.println("Available cellphone and long distance balance: $" + String.format("%.2f", vozIPCellphoneLongDistanceBalance));
        System.out.println("Average cost per minute: $" + String.format("%.2f", totalCost / totalMinutes));
        System.out.println();
    }

    public static void printSummary() {
        
        int nLandLineCalls = 0;
        int nCellphoneLineCalls = 0;
        int nVozIPCalls = 0;
        
        double landLineMinutes = 0;
        double cellphoneLineMinutes = 0;
        double vozIPMinutes = 0;

        double landLineCost = 0;
        double cellphoneLineCost = 0;
        double vozIPCost = 0;

        for (LandLine call : landLineCalls) {
            
            nLandLineCalls++;
            landLineMinutes += call.getTime();
            
            switch (call.getCallType()) {
                case "Local":
                    landLineCost += call.getTime() * LandLine.minuteLocal;
                    break;
                case "Long distance":
                    landLineCost += call.getTime() * LandLine.minuteLongDistance;
                    break;
                case "Cellphone":
                    landLineCost += call.getTime() * LandLine.minuteCellphone;
                    break;
                default:
                    break;
            }

        }

        for (CellphoneLine call : cellphoneLineCalls) {
        
            nCellphoneLineCalls++;
            cellphoneLineMinutes += call.getTime();
            
            switch (call.getCallType()) {
                case "Local":
                    cellphoneLineCost += call.getTime() * CellphoneLine.minuteLocal;
                    break;
                case "Cellphone":
                    cellphoneLineCost += call.getTime() * CellphoneLine.minuteCellphone;
                    break;
                default:
                    break;
            }
        }

        for (VozIP call : vozIPCalls) {
            
            nVozIPCalls++;
            vozIPMinutes += call.getTime();
            
            switch (call.getCallType()) {
                case "Local":
                    vozIPCost += call.getTime() * VozIP.minuteLocal;
                    break;
                case "Long distance":
                    vozIPCost += call.getTime() * VozIP.minuteLongDistance;
                    break;
                case "Cellphone":
                    vozIPCost += call.getTime() * VozIP.minuteCellphone;
                    break;
                default:
                    break;
            }

        }

        System.out.println("\nSUMMARY");
        System.out.println("\nLand line");
        System.out.println("Number of calls: " + nLandLineCalls);
        System.out.println("Total minutes: " + landLineMinutes);
        System.out.println("Total cost: $" + String.format("%.2f", landLineCost));
        System.out.println("\nCellphone line");
        System.out.println("Number of calls: " + nCellphoneLineCalls);
        System.out.println("Total minutes: " + cellphoneLineMinutes);
        System.out.println("Total cost: $" + String.format("%.2f", cellphoneLineCost));
        System.out.println("\nVozIP");
        System.out.println("Number of calls: " + nVozIPCalls);
        System.out.println("Total minutes: " + vozIPMinutes);
        System.out.println("Total cost: $" + String.format("%.2f", vozIPCost));

    }

}
