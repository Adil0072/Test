public class Count {
    public static void main(String[] args) {
        int n = 547;
        int count = 0;
        while(n > 0) {
            int rem = n % 10;
            count ++;
//			if (rem == 5) {
//				count ++;
//			}
            n = n / 10;
        }
        System.out.println(count);
    }
}
