package Bus;
import java.util.*;
class l6_2_11{

    static List<Bus> find_bus_by_route(List<Bus> arr, int id_route){
        List<Bus> temp = new ArrayList<>();
        for(Bus Bus: arr){
            if(id_route == Bus.get_id_route()){
                temp.add(Bus);
            }
        }
        return temp;
    }

    static List<Bus> find_bus_by_over_year(List<Bus> arr, int years){
        List<Bus> temp = new ArrayList<>();
        for(Bus Bus: arr){
            if(years > (2022 - Bus.get_year_of_build())){
                temp.add(Bus);
            }
        }
        return temp;
    }

    static List<Bus> find_bus_by_over_mileage(List<Bus> arr, int mileage){
        List<Bus> temp = new ArrayList<>();
        for(Bus Bus: arr){
            if(mileage < Bus.get_mileage()){
                temp.add(Bus);
            }
        }
        return temp;
    }
    static public void printList(List<Bus> arr){
        for(Bus Bus: arr){
            System.out.println(Bus);
        }
    }

    public static void main(String[] args){
        List<Bus> arr = new ArrayList<>(){
            {
                add(new Bus("Володя_Фам", "Володя_Имя", "Володя_Отч", 1,2,
                        "БОГДАН",2000,11));
                add(new Bus("Вася_Фам", "Вася_Имя", "Вася_Отч", 2,2,
                        "БОГДАН",2002,12));
                add(new Bus("Игорь_Фам", "Игорь_Имя", "Игорь_Отч", 3,3,
                        "БОГДАН2",2001,13));
                add(new Bus("Петя_Фам", "Петя_Имя", "Петя_Отч", 4,4,
                        "БОГДАН2",2001,14));

            }
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть номер маршруту, список автобусів якого ви хочете отримати: ");
        int id_route = Integer.parseInt(sc.nextLine());
        printList(find_bus_by_route(arr, id_route));

        System.out.print("Введіть термін, щоб отримати список автобусів, які експлуатуються більше: ");
        int years = Integer.parseInt(sc.nextLine());
        printList(find_bus_by_over_year(arr, years));

        System.out.print("Введіть пробіг, щоб отримати список автобусів у яких пробіг більше заданого: ");
        int mileage = Integer.parseInt(sc.nextLine());
        printList(find_bus_by_over_mileage(arr, mileage));
    }
}
