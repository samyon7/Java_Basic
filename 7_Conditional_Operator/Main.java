public class Main{
    public static void main(String[] args){
        int a = 4;
        int b = 5;
        System.out.println("AND Conditional");
        boolean result_1 = a == 3 && b == 5;
        boolean result_2 = a != 3 && b == 5;
        System.out.println("Hasil Operator AND pada syarat value1 == 3 dan value2 == 5 adalah " + result_1);
        System.out.println("Hasil Operator AND pada syarat value1 != 3 dan value2 == 5 adalah " + result_2);

        System.out.println("OR Conditional");
        result_1 = a == 3 || b == 5;
        result_2 = a != 3 || b == 5;

        System.out.println("Hasil Operator OR pada syarat value1 == 3 dan value2 == 5 adalah " + result_1);
        System.out.println("Hasil Operator OR pada syarat value1 != 3 dan value2 == 5 adalah " + result_2);
    }
}