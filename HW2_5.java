public class HW2_5 {
    public static void main(String[] args){
        String[] array = new String[args.length];
        System.out.println("Original array of args:");
        for (int i = 0; i<args.length; i++){
            array[i] = args[i];
            System.out.println("args["+(i+1)+"] = "+ array[i]);
        }
        System.out.println("Reversed array of args:");
        for ( int i = 0; i<args.length+1; i++){
            System.out.println("args["+(i+1)+"] = "+ array[args.length-(i+1)]);

        }
    }
}

