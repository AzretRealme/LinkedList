
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){

        LinkedList<String> books = new LinkedList<>();
        books.add ("Том Сойер");
        books.add ("Джек Лондон");
        books.add ("Маленький принц");
        books.add ("Большие надежды");
        books.add ("Алхимик");

        books.addFirst ( "Робинзон Крузо"); //добавляет начальное число в список
        books.addFirst ( "Робинзон Крузо"); //добавляет начальное число в список
        books.addLast ("Витязь в тигровой шкуре"); //добавляет последнее число в список
        books.addLast ("Витязь в тигровой шкуре"); //добавляет последнее число в список
        books.removeLastOccurrence ("Робинзон Крузо"); // удаляет первый элемент и при этом исчезнет из массива
        books.removeFirstOccurrence ("Витязь в тигровой шкуре"); // удаляет последний элемент и при этом исчезнет из массива


        for (String str: books){
            System.out.println(str);
        }

    }
}
