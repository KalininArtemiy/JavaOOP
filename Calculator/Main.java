package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         NumberFactoryComplex factory = new NumberFactoryComplex();
         Operation operation = new OperationAdd();
         ComplexCallc callc = new ComplexCallc(factory, operation);

         callc.addReader(new OperationReaderLogger());
         String choice = "";
         while(!choice.equals("4")){
            Number num1 = readNumber(scanner);
            Number num2 = readNumber(scanner);
            System.out.println("Выберите операцию: ");
            System.out.println("1 - сложение\n2 - умножение\n3 - деление\n4 - выход");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":

                    Number resultAddtion = callc.add(num1, num2);
                    System.out.println("Результат: " + resultAddtion.getRealNumber() + " + " + resultAddtion.GetImagineNumber() + "i");
                    System.out.println();
                    break;
                case "2":
                    Number resultMultiplication = callc.multiply(num1, num2);
                    System.out.println("Результат: " + resultMultiplication.getRealNumber() + " * " + resultMultiplication.GetImagineNumber() + "i");
                    System.out.println();
                    break;
                case "3":
                    Number resultDivision = callc.divide(num1, num2);
                    System.out.println("Результат: " + resultDivision.getRealNumber() + " / " + resultDivision.GetImagineNumber() + "i");
                    System.out.println();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    continue;
            }
         }

    }
    private static Number readNumber(Scanner scanner) {
        System.out.println("Введите действительную и мнимую часть комплексного числа через пробел:");
        double realPart = scanner.nextDouble();
        double imaginaryPart = scanner.nextDouble();
        scanner.nextLine();
        NumberFactoryComplex factory = new NumberFactoryComplex();
        return factory.ComplexNumber(realPart, imaginaryPart);
    }
}
