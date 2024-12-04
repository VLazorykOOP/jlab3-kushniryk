import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Lab 3");
        System.out.println("Enter the exercise :");
        int exercise = in.nextInt();
        switch (exercise) {
            case 1:
                Place[] places = new Place[3];
                places[0] = new Region("Львівська область", 2478133, 21831.97, "Львів");
                places[1] = new City("Київ", 2952301, 835.58, "Україна", "Київська область");
                places[2] = new Metropolis("Нью-Йорк", 8467513, 1223.3, "США", "Нью-Йорк", 569);
                for (Place place : places) {
                    place.show();
                    System.out.println();
                }
            case 2:
                Parallelepiped parallelepiped = new Parallelepiped(5.0,3.0,2.0);
                System.out.println("Паралелепіпед : "+parallelepiped.toString());
                Ball ball = new Ball(2.0);
                System.out.println("Куля : \n"+ball.toString());
            case 3:
                Task3_Parallelepiped paralel=new Task3_Parallelepiped(3.0,2.4,5.7);
                Task3_Ball ball_task3=new Task3_Ball(2.0);
                System.out.println("За допомогою інтерфейсу : ");
                System.out.println("Паралелепіпед : "+paralel.toString());
                System.out.println("Куля : "+ball_task3.toString());
        }


    }
}
