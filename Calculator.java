
import java.util.Scanner;
class Calculator{
    String input1;
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String mas = sc1.nextLine();
        System.out.println(Main.calc(mas));
    }
}

class Main{
    public static String calc(String ppp){
        Opereishen opereishen = new Opereishen();
        Arabian arabian = new Arabian();
        Calculator ds=new Calculator();

        try {
            String[] mas1 = ppp.split(" ");
            String num1 = mas1[0];
            String znak = mas1[1];
            String num3 = mas1[2];

            try {
                if (mas1.length<4) {
                    if ((Integer.parseInt(num1) <= 10) && (Integer.parseInt(num3) <= 10)) {
                        int z1 = Integer.parseInt(num1);
                        int z2 = Integer.parseInt(num3);
                        ds.input1 = String.valueOf(opereishen.summa(z1, znak, z2));
                    } else {
                        System.out.println("Число должно быть не больше 10");
                    }
                } else {
                    System.out.println("Вы ввели что-то не то");
                }
            } catch (NumberFormatException e) {
                if ((arabian.getArabian(num1) > 0) && (arabian.getArabian(num3) > 0)) {
                    int z1 = arabian.getArabian(num1);
                    int z2 = arabian.getArabian(num3);
                    int z3 = opereishen.summa(z1, znak, z2);
                    if (z3 >= 0) {
                        ds.input1 = arabian.searchArabian(z3);
                    } else {
                        System.out.println("В римской системе нет отрицательных чисел");
                    }
                } else {
                    System.out.println("Используются одновременно разные системы счисления");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Строка не является математической операцией");
        }
        return ds.input1;
    }
}

class Opereishen{
    int da;
    int summa(int num1,String znak,int num2) {

        switch (znak) {
            case "+" -> da = num1 + num2;
            case "-" -> da = num1 - num2;
            case "/" -> da = num1 / num2;
            case "*" -> da = num1 * num2;
            default -> {
                ;
                System.out.println("Арифметический символ отсутсвует. Возможные арифметические операции '+','-','/','/' :");
            }
        }
        return da;
    }

}
class Arabian {
    int numx;
    String num2;
    int getArabian(String simvol) {

        switch (simvol) {
            case "I" -> numx = 1;
            case "II" -> numx = 2;
            case "III" -> numx = 3;
            case "IV" -> numx = 4;
            case "V" -> numx = 5;
            case "VI" -> numx = 6;
            case "VII" -> numx = 7;
            case "VIII" -> numx = 8;
            case "IX" -> numx = 9;
            case "X" -> numx = 10;
            default -> numx = 0;
        }
        return numx;
    }
    String searchArabian(int number){
        switch (number) {
            case 1 -> num2 = "I";
            case 2 -> num2 = "II";
            case 3 -> num2 = "III";
            case 4 -> num2 = "IV";
            case 5 -> num2 = "V";
            case 6 -> num2 = "VI";
            case 7 -> num2 = "VII";
            case 8 -> num2 = "VIII";
            case 9 -> num2 = "IX";
            case 10 -> num2 = "X";
            case 11 -> num2 = "XI";
            case 12 -> num2 = "XII";
            case 13 -> num2 = "XIII";
            case 14 -> num2 = "XIV";
            case 15 -> num2 = "XV";
            case 16 -> num2 = "XVI";
            case 17 -> num2 = "XVII";
            case 18 -> num2 = "XVIII";
            case 19 -> num2 = "XIX";
            case 20 -> num2 = "XX";
            case 21 -> num2 = "XXI";
            case 22 -> num2 = "XXII";
            case 23 -> num2 = "XXIII";
            case 24 -> num2 = "XXIV";
            case 25 -> num2 = "XXV";
            case 26 -> num2 = "XXVI";
            case 27 -> num2 = "XXVII";
            case 28 -> num2 = "XVIII";
            case 29 -> num2 = "XXIX";
            case 30 -> num2 = "XXX";
            case 31 -> num2 = "XXXI";
            case 32 -> num2 = "XXXII";
            case 33 -> num2 = "XXXIII";
            case 34 -> num2 = "XXXIV";
            case 35 -> num2 = "XXXV";
            case 36 -> num2 = "XXXVI";
            case 37 -> num2 = "XXXVII";
            case 38 -> num2 = "XXXVIII";
            case 39 -> num2 = "XXXIX";
            case 40 -> num2 = "XL";
            case 41 -> num2 = "XLI";
            case 42 -> num2 = "XLII";
            case 43 -> num2 = "XLIII";
            case 44 -> num2 = "XLIV";
            case 45 -> num2 = "XLV";
            case 46 -> num2 = "XLVI";
            case 47 -> num2 = "XLVII";
            case 48 -> num2 = "XLVIII";
            case 49 -> num2 = "XLIX";
            case 50 -> num2 = "L";
            case 51 -> num2 = "LI";
            case 52 -> num2 = "LII";
            case 53 -> num2 = "LIII";
            case 54 -> num2 = "LIV";
            case 55 -> num2 = "LV";
            case 56 -> num2 = "LVI";
            case 57 -> num2 = "LVII";
            case 58 -> num2 = "LVIII";
            case 59 -> num2 = "LIX";
            case 60 -> num2 = "LX";
            case 61 -> num2 = "LXI";
            case 62 -> num2 = "LXII";
            case 63 -> num2 = "LXIII";
            case 64 -> num2 = "LXIV";
            case 65 -> num2 = "LXV";
            case 66 -> num2 = "LXVI";
            case 67 -> num2 = "LXVII";
            case 68 -> num2 = "LXVIII";
            case 69 -> num2 = "LXIX";
            case 70 -> num2 = "LXX";
            case 71 -> num2 = "LXXI";
            case 72 -> num2 = "LXXII";
            case 73 -> num2 = "LXXIII";
            case 74 -> num2 = "LXXIV";
            case 75 -> num2 = "LXXV";
            case 76 -> num2 = "LXXVI";
            case 77 -> num2 = "LXXVII";
            case 78 -> num2 = "LXXVIII";
            case 79 -> num2 = "LXXIX";
            case 80 -> num2 = "LXXX";
            case 81 -> num2 = "LXXXI";
            case 82 -> num2 = "LXXXII";
            case 83 -> num2 = "LXXXIII";
            case 84 -> num2 = "LXXXIV";
            case 85 -> num2 = "LXXXV";
            case 86 -> num2 = "LXXXVI";
            case 87 -> num2 = "LXXXVII";
            case 88 -> num2 = "LXXXVIII";
            case 89 -> num2 = "LXXXIX";
            case 90 -> num2 = "XC";
            case 91 -> num2 = "XCI";
            case 92 -> num2 = "XCII";
            case 93 -> num2 = "XCIII";
            case 94 -> num2 = "XCIV";
            case 95 -> num2 = "XCV";
            case 96 -> num2 = "XCVI";
            case 97 -> num2 = "XCVII";
            case 98 -> num2 = "XCVIII";
            case 99 -> num2 = "XCIX";
            case 100 -> num2 = "C";
        }
        return num2;
    }
}



