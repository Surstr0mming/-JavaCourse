import java.util.Scanner;

public class CW3_1 {
    public static class RationalFraction extends Number {
        int m, n;

        public RationalFraction(){
            this.m = 0;
            this.n = 1;
        }

        public RationalFraction (int m, int n){
            if(n==0){
                System.out.println("Cannot be divided by zero");
            }
            int num_gcd  = gcd(m, n);

            int new_m = m/num_gcd;
            int new_n = n/num_gcd;

            this.m = new_m;
            this.n = new_n;
        }

        public int gcd(int a, int b) {
            if (b==0) return a;
            return gcd(b,a%b);
        }

        public  RationalFraction add(RationalFraction other){
            return new RationalFraction(this.m * other.n + this.n * other.m, this.n * other.n);
        }

        public  RationalFraction sub(RationalFraction other){
            return new RationalFraction(this.m * other.n - this.n * other.m, this.n * other.n);
        }

        public  RationalFraction mul(RationalFraction other) {
            return new RationalFraction(this.m * other.m, this.n * other.n);
        }

        public  RationalFraction div(RationalFraction other){
            return new RationalFraction(this.m * other.n, this.n * other.m);
        }

        @Override
        public String toString() {
            return m + "/" + n;
        }

        @Override
        public int intValue() {
            return (int)m/n;
        }

        @Override
        public long longValue() {
            return (long)m/n;
        }

        @Override
        public float floatValue() {
            return (float)m/n;
        }

        @Override
        public double doubleValue() {
            return (double)m/n;
        }
    }

    public static RationalFraction[] transform_array(RationalFraction[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i].n!=0 || arr[i+1].n!=0)
                arr[i] = arr[i].add(arr[i+1]);
        }
        return arr;
    }

    public static   void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of numbers to put them in array: ");
        int n = sc.nextInt();
        RationalFraction[] rational_array = new RationalFraction[n];
        for(int i=0; i<n; ++i){
            System.out.print("Rational_number ["+ (i+1) + "] = "  );
            RationalFraction current = new RationalFraction(sc.nextInt(),sc.nextInt());
            rational_array[i] = current;
        }
        System.out.println("Entered numbers: ");
        for(RationalFraction num: rational_array){
            if(num.n!=0)
                System.out.println("Rational faction: " + num);
        }
        rational_array = transform_array(rational_array);
        System.out.println("New array with changed numbers: ");
        for(RationalFraction num: rational_array){
            if(num.n!=0)
                System.out.println("Rational changed faction: " + num);
        }
    }
}