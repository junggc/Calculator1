package cal;

import java.util.Scanner;

public class Calculator1 {

    public static void main(String[] args) {

        Calcu cal = new Calcu();
        System.out.println("숫자를 입력하세요.");
        while(true) {
            Scanner sc = new Scanner(System.in);

            try {
                cal.setA(Integer.parseInt(sc.nextLine()));

            } catch (Exception e) {
                System.out.println("숫자가 아닙니다. 숫자를 입력하세요");
                continue;
            }break;
        }
        System.out.println("+,-,*,/,% 연산자를 입력하세요.");
        while(true){
        Scanner an = new Scanner(System.in);


        try {
            cal.setB(String.valueOf(an.nextLine()));
//            if(!(cal.getB().equals("+")&&cal.getB().equals("-")&&cal.getB().equals("*")&&cal.getB().equals("/")&&cal.getB().equals("%"))){
            if((!cal.getB().equals("+")&&!cal.getB().equals("-")&&!cal.getB().equals("*")&&!cal.getB().equals("/")&&!cal.getB().equals("%"))){
                    System.out.println("연산자를 정확히 입력해주세요.");
                continue ;
                }
        }catch(Exception e2){
            //System.out.println("연산자를 정확히 입력해주세요.~");
            continue;
            }
        break;
        }
        System.out.println("여기도 숫자를 입력하세요.");

        while(true){
        Scanner ner = new Scanner(System.in);
          try {
            cal.setC(Integer.parseInt(ner.nextLine()));
          }catch(Exception e3){
              System.out.println("숫자를 정확하게 입력하세요.");
              continue;
           }
          break;
        }



        if(cal.getB().equals("+")){
            System.out.println("계산결과는 "+ (cal.getA()+cal.getC()) + " 입니다.");
        }else if(cal.getB().equals("-")){
            System.out.println("계산결과는 "+ (cal.getA()-cal.getC()) + " 입니다.");
        }else if(cal.getB().equals("*")){
            System.out.println("계산결과는 "+ (cal.getA()*cal.getC()) + " 입니다.");
        }else if(cal.getB().equals("/")){
            System.out.println("계산결과는 "+ (cal.getA()/cal.getC()) + " 입니다.");
        }else if(cal.getB().equals("%")){
            System.out.println("계산결과는 "+ (cal.getA()%cal.getC()) + " 입니다.");
        }




























    }





}
