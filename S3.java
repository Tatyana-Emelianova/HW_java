import java.lang.reflect.Array;
import java.util.*;

public class S3_1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(); //Создание нового списка
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Magenta");
        list.add("Black");
        list.add("Grey");
        list.add("White");
        list.add("Yellow");
        list.add("Violet");

        for (String str: list){
            System.out.println(str);   //вывод на экран
        }
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String str = listIterator.next();
            listIterator.add(str + "!"); // добавление каждого элемента с +!
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("!"))  list.remove(i-1); // удаление элементов без !
        }

        list.add(1, "hello");//Вставить элемент в список в первой позиции.
        list.set(1, "1111");//Обновить определенный элемент списка по заданному индексу.
        list.remove(3);//Удалить третий элемент из списка.
        System.out.println(list);

        System.out.println(list.remove("Red!"));//Поиска элемента в списке по строке.

        ArrayList<String> list2 = new ArrayList(); //Создание нового списка

        list2.add(list.get(0));
        list2.add(list.get(1));
        list2.add(list.get(2));
        list2.add(list.get(3));
        list2.add(list.get(4));
        list2.add(list.get(7));


        list.retainAll(list2); //Удалить из первого списка все элементы отсутствующие во втором списке.
        System.out.println(list);


        list2.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println(list2);  //Сортировка списка по длине слова


