package Homeworks;
import java.util.Scanner;

public class MainCl {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            try {
                Parser pars = new Parser(str);
                long firstNum = pars.getFirstNum();
                long secondNum = pars.getSecondNum();
                char operation = pars.getOperation().charAt(0);
                switch (operation) {
                    case '+': {
                        long maxim =Long.MAX_VALUE;
                        long c = maxim - firstNum;
                        if(c < secondNum){
                            throw new TooLongResultException();
                        }else {
                            System.out.println(firstNum + secondNum);
                            break;
                        }
                    }
                    case '-': {
                        System.out.println(firstNum - secondNum);
                        break;
                    }
                    case '/': {
                        if(secondNum ==0){
                            throw new ArithmeticException ();
                        }
                        System.out.println(firstNum / secondNum);
                        break;
                    }
                    case '*': {
                        System.out.println(firstNum * secondNum);
                        break;
                    }
                }
            } catch (TooLongArgumentException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                System.out.println("Неверная операция");
            }catch (ArithmeticException e){
                System.out.println("Нельзя делить на ноль");
            }catch (TooLongResultException e){
                System.out.println("Слишком длинный результат");
            }
        }
    }
