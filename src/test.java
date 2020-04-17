import sun.print.SunMinMaxPage;

public class test {
    public static void main(String[] args) {
        int result = sum_numbers(5);
        System.out.println(result);
    }
    private static int sum_numbers(int num){
        if (num==1){
            return 1;
        }
        int temp = sum_numbers(num-1);
//        System.out.println(num);
//        System.out.println(temp);
        int a = temp+num;
        System.out.println(a);
        return a;
    }
}
