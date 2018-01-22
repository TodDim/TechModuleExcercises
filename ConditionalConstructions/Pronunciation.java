package ConditionalConstructions;

import java.util.Scanner;

public class Pronunciation {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            int stotni = number / 100;
            int desetici = (number / 10) % 10;
            int edinici = number % 10;
            switch (number) {
                case 0:
                    System.out.printf("nula");
                    break;
            }
            switch (stotni) {
                case 0:
                    switch (desetici) {
                        case 0:
                            switch (edinici){
                                case 1:
                                    System.out.println(" edno");
                                    break;
                                case 2:
                                    System.out.println(" dve");
                                    break;
                                case 3:
                                    System.out.println(" tri");
                                    break;
                                case 4:
                                    System.out.println(" chetiri");
                                    break;
                                case 5:
                                    System.out.println(" pet");
                                    break;
                                case 6:
                                    System.out.println(" shest");
                                    break;
                                case 7:
                                    System.out.println(" sedem");
                                    break;
                                case 8:
                                    System.out.println(" osem");
                                    break;
                                case 9:
                                    System.out.println(" devet");
                                    break;
                            }
                            break;
                        case 1:
                            switch (edinici) {
                                case 0:
                                    System.out.println(" deset");
                                    break;
                                case 1:
                                    System.out.println(" edinadeset");
                                    break;
                                case 2:
                                    System.out.println(" dvanadeset");
                                    break;
                                case 3:
                                    System.out.println(" trinadeset");
                                    break;
                                case 4:
                                    System.out.println(" chetirinadeset");
                                    break;
                                case 5:
                                    System.out.println(" petnadeset");
                                    break;
                                case 6:
                                    System.out.println(" shestnadeset");
                                    break;
                                case 7:
                                    System.out.println(" sedemnadeset");
                                    break;
                                case 8:
                                    System.out.println(" osemnadeset");
                                    break;
                                case 9:
                                    System.out.println(" devetnadeset");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println(" dvadeset");
                            break;
                        case 3:
                            System.out.println(" trideset");
                            break;
                        case 4:
                            System.out.println(" chetirideset");
                            break;
                        case 5:
                            System.out.println(" petdeset");
                            break;
                        case 6:
                            System.out.println(" sheiset");
                            break;
                        case 7:
                            System.out.println(" sedemdeset");
                            break;
                        case 8:
                            System.out.println(" osemdeset");
                            break;
                        case 9:
                            System.out.println(" devetdeset");
                            break;
                    }
                    if ((desetici!=1)&&(desetici!=0)) {
                        switch (edinici) {
                            case 1:
                                System.out.println(" i edno");
                                break;
                            case 2:
                                System.out.println(" i dve");
                                break;
                            case 3:
                                System.out.println(" i tri");
                                break;
                            case 4:
                                System.out.println(" i chetiri");
                                break;
                            case 5:
                                System.out.println(" i pet");
                                break;
                            case 6:
                                System.out.println(" i shest");
                                break;
                            case 7:
                                System.out.println(" i sedem");
                                break;
                            case 8:
                                System.out.println(" i osem");
                                break;
                            case 9:
                                System.out.println(" i devet");
                                break;
                        }
                    }
                    break;
                case 1:
                    System.out.println("sto");
                    break;
                case 2:
                    System.out.println("dvesta");
                    break;
                case 3:
                    System.out.println("trista");
                    break;
                case 4:
                    System.out.println("chetiristotin");
                    break;
                case 5:
                    System.out.println("petstotin");
                    break;
                case 6:
                    System.out.println("sheststotin");
                    break;
                case 7:
                    System.out.println("sedemstotin");
                    break;
                case 8:
                    System.out.println("osemstotin");
                    break;
                case 9:
                    System.out.println("devetstotin");
                    break;
            }
            if (stotni != 0) {
                switch (desetici) {
                    case 1:
                        switch (edinici) {
                            case 1:
                                System.out.println(" i edinadeset");
                                break;
                            case 2:
                                System.out.println(" i dvanadeset");
                                break;
                            case 3:
                                System.out.println(" i trinadeset");
                                break;
                            case 4:
                                System.out.println(" i chetirinadeset");
                                break;
                            case 5:
                                System.out.println(" i petnadeset");
                                break;
                            case 6:
                                System.out.println(" i shestnadeset");
                                break;
                            case 7:
                                System.out.println(" i sedemnadeset");
                                break;
                            case 8:
                                System.out.println(" i osemnadeset");
                                break;
                            case 9:
                                System.out.println(" i devetnadeset");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println(" dvadeset");
                        break;
                    case 3:
                        System.out.println(" trideset");
                        break;
                    case 4:
                        System.out.println(" chetirideset");
                        break;
                    case 5:
                        System.out.println(" petdeset");
                        break;
                    case 6:
                        System.out.println(" sheiset");
                        break;
                    case 7:
                        System.out.println(" sedemdeset");
                        break;
                    case 8:
                        System.out.println(" osemdeset");
                        break;
                    case 9:
                        System.out.println(" devetdeset");
                        break;
                }
                if (desetici != 1) {
                    switch (edinici) {
                        case 1:
                            System.out.println(" i edno");
                            break;
                        case 2:
                            System.out.println(" i dve");
                            break;
                        case 3:
                            System.out.println(" i tri");
                            break;
                        case 4:
                            System.out.println(" i chetiri");
                            break;
                        case 5:
                            System.out.println(" i pet");
                            break;
                        case 6:
                            System.out.println(" i shest");
                            break;
                        case 7:
                            System.out.println(" i sedem");
                            break;
                        case 8:
                            System.out.println(" i osem");
                            break;
                        case 9:
                            System.out.println(" i devet");
                            break;
                    }
                }
            }
        }
    }
}