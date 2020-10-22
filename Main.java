import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static final Integer loops = 10000;
    public static LocalTime start;
    public static LocalTime finish;

    /*
    LocalTime java.time библиотека джава со временем имеет нано секунды
    LocalTime.now() - время сейчас
    */

    public static void main(String[] args) {
        List<Object> array = new ArrayList<>();
        List<Object> linked = new LinkedList<>();



        //ArrayList - add
        start = LocalTime.now();
        System.out.println("ArrayList - add\n" + "start: " + start.getSecond() + ":" + start.getNano());
        for (int i = 0; i < loops; i++){
            array.add(i);
        }
        finish = LocalTime.now();
        System.out.println("finish: " + finish.getSecond() + ":" + finish.getNano());
        System.out.println("distinction: " + (finish.getSecond() - start.getSecond()) + ":" + (finish.getNano() - start.getNano()) + "\n");

        //LinkedList - add
        start = LocalTime.now();
        System.out.println("LinkedList - add\n" + "start: " + start.getSecond() + ":" + start.getNano());
        for (int i = 0; i < loops; i++){
            linked.add(i);
        }
        finish = LocalTime.now();
        System.out.println("finish: " + finish.getSecond() + ":" + finish.getNano());
        System.out.println("distinction: " + (finish.getSecond() - start.getSecond()) + ":" + (finish.getNano() - start.getNano()) + "\n");

        //ArrayList - get
        start = LocalTime.now();
        System.out.println("ArrayList - get\n" + "start: " + start.getSecond() + ":" + start.getNano());
        for (int i = 0; i < loops; i++){
            Object res = array.get(i);
        }
        finish = LocalTime.now();
        System.out.println("finish: " + finish.getSecond() + ":" + finish.getNano());
        System.out.println("distinction: " + (finish.getSecond() - start.getSecond()) + ":" + (finish.getNano() - start.getNano()) + "\n");

        //LinkedList - get
        start = LocalTime.now();
        System.out.println("LinkedList - get\n" + "start: " + start.getSecond() + ":" + start.getNano());
        for (int i = 0; i < loops; i++){
            Object res = linked.get(i);
        }
        finish = LocalTime.now();
        System.out.println("finish: " + finish.getSecond() + ":" + finish.getNano());
        System.out.println("distinction: " + (finish.getSecond() - start.getSecond()) + ":" + (finish.getNano() - start.getNano()) + "\n");

        //ArrayList - delete
        start = LocalTime.now();
        System.out.println("ArrayList - delete\n" + "start: " + start.getSecond() + ":" + start.getNano());
        for (int i = 0; i < loops; i++){
            Object res = array.remove(0);
        }
        finish = LocalTime.now();
        System.out.println("finish: " + finish.getSecond() + ":" + finish.getNano());
        System.out.println("distinction: " + (finish.getSecond() - start.getSecond()) + ":" + (finish.getNano() - start.getNano()) + "\n");

        //LinkedList - delete
        start = LocalTime.now();
        System.out.println("LinkedList - delete\n" + "start: " + start.getSecond() + ":" + start.getNano());
        for (int i = 0; i < loops; i++){
            Object res = linked.remove(0);
        }
        finish = LocalTime.now();
        System.out.println("finish: " + finish.getSecond() + ":" + finish.getNano());
        System.out.println("distinction: " + (finish.getSecond() - start.getSecond()) + ":" + (finish.getNano() - start.getNano()) + "\n");
    }
}
