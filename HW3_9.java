import java.util.Arrays;

public class HW3_9 {
    public static void main(String[] args){
        boolean b = true;
        double[] list = new double[6];
        for (int i = 0; i< args.length; i++){
            if (Double.parseDouble(args[i]) > 10.0 | Double.parseDouble(args[i]) < 0.0) {
                System.out.println("Grade number "+ (i+1) +" is false, so rerun program and enter another grades");
                b = false;
                break;
            }
            list[i] = Double.parseDouble(args[i]);
        }
        if (b){
            System.out.println(Arrays.toString(list));
            double min = Arrays.stream(list).min().getAsDouble();
            double max = Arrays.stream(list).max().getAsDouble();
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
            int n = 0;
            double s = 0;
            double[] new_list = new double[4];
            for(int i = 0; i< args.length; i++){
                if (Double.parseDouble(args[i]) == min | Double.parseDouble(args[i]) == max){
                }
                else{
                    new_list[n] = list[i];
                    n++;
                }
            }
            for (double v : new_list) {
                s += v;
            }
            String result = String.format("%.2f",s/n);
            System.out.println("New array without min and max grade : "+Arrays.toString(new_list));
            System.out.println("average value" + result);
        }
    }
}