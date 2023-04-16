import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean exit_flag = false, reset = false;
        char operation = 0;
        char symbol = 0;
        Calculate operand1 = new Calculate();
        Calculate operand2 = new Calculate();
        Scanner scanner = new Scanner(System.in);

        while (true)//Основоной цикл бесконечного калькулятора до выхода
        {
            while (true)//цикл бесконечного калькулятора до сброса
            {

                operand1.getOperand(Calculate.calc_begin);
                if ((Calculate.reset_flag)||(Calculate.exit_flag)) break;
                /*if (calc_begin) //проверка на начало цикла калькулятора, true когда начало, false после выполнения первого вычисления
                {
                    System.out.println("Введите число");
                    if (scanner.hasNextDouble()) //Проверка на тип введеного значения
                    {
                        operand1 = scanner.nextDouble();
                        System.out.println(operand1);
                    } else //if (scanner.hasNext())
                    {
                        symbol = scanner.next().charAt(0);
                        //System.out.println("Введен символ");
                        while (true){
                            if ((symbol == 'C') || (symbol == 's'))
                            {
                                switch (symbol) {
                                case 'C': {
                                    calc_begin = true;
                                    reset = true;
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
                        if(reset) break;
                    }

                }*/
                operation = Calculate.getOperation();
                if ((Calculate.reset_flag)||(Calculate.exit_flag)) break;
                System.out.println(operand1.operand + " " + operation);
                operand2.getOperand(true);
                if ((Calculate.reset_flag)||(Calculate.exit_flag)) break;
                System.out.println(operand1.operand + " " + operation + " " + operand2.operand);
                switch (operation)
                {
                    case '+':
                        operand1.operand = operand1.operand + operand2.operand;
                        break;
                    case '-':
                        operand1.operand = operand1.operand - operand2.operand;
                        break;
                    case '/':
                        operand1.operand = operand1.operand / operand2.operand;
                        break;
                    case '*':
                        operand1.operand = operand1.operand * operand2.operand;
                        break;
                    default:
                        System.out.println("Знак введен не верно");
                        break;
                };
                Calculate.calc_begin = false;
                System.out.println("result = " + operand1.operand);
            }
            if (Calculate.exit_flag) break;
            Calculate.reset_flag = false;

        }
    }


}