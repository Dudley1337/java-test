import java.util.Scanner;

public class Calculate {
    public double operand = 0;
    public static boolean reset_flag = false, exit_flag = false, calc_begin = true;
    public void getOperand (boolean calc_begin) {
        Scanner scanner = new Scanner(System.in);
        if (calc_begin) //проверка на начало цикла калькулятора, true когда начало, false после выполнения первого вычисления
        {
            System.out.println("Введите число");
            if (scanner.hasNextDouble()) //Проверка на тип введеного значения
            {
                operand = scanner.nextDouble();
                System.out.println(operand);
            } else {
                System.out.println("Введен символ");

                while (true){
                    char symbol = scanner.next().charAt(0);
                    if ((symbol == 'C') || (symbol == 's'))
                    {
                        switch (symbol) {
                            case 'C': {
                                calc_begin = true;
                                reset_flag = true;
                                System.out.println("Выполнен сброс");
                                break;
                            }
                            case 's': {
                                exit_flag = true;
                                System.out.println("Выход");
                                break;
                            }
                        }
                        break;
                    } else  System.out.println("Неверный ввод, Повторите ввод");
                }
            };
            //scanner.close();
        }
    }

    public static char getOperation (){
        char operation = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию");
        while (true) // Проверка на правильность введеного знака
        {
            if (scanner.hasNext()){
                operation = scanner.next().charAt(0);
            }
            if ((operation == '+')||(operation == '-')||(operation == '*')||(operation == '/')) break;
            else {
                //System.out.println("Введен символ");
                    if ((operation == 'C') || (operation == 's'))
                    {
                        switch (operation) {
                            case 'C': {
                                calc_begin = true;
                                reset_flag = true;
                                System.out.println("Выполнен сброс");
                                break;
                            }
                            case 's': {
                                exit_flag = true;
                                System.out.println("Выход");
                                break;
                            }
                        }
                        break;
                    } else  System.out.println("Неверный ввод, Повторите ввод");
            };
            //System.out.println("Знак введен не верно");
        }
        //scanner.close();
        return operation;
    }

    /*private static void check_symbol(){
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
        System.out.println("Введен символ");
        while (true){
            if ((symbol == 'C') || (symbol == 's'))
            {
                switch (symbol) {
                    case 'C': {
                        calc_begin = true;
                        reset_flag = true;
                        break;
                    }
                    case 's': {
                        exit_flag = true;
                        break;
                    }
                }
                break;
            } else  System.out.println("Неверный ввод");
        }
    }*/
}
