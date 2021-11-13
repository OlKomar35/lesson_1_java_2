package lesson3;

import java.util.ArrayList;
import java.util.Random;

public class List {
    public static void main(String[] args) {
        /* 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
         Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Посчитать сколько раз встречается каждое слово.*/

        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        ListName listNames[] = ListName.values();

        int n = 20;
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(listNames.length);
            String listElement = listNames[index].toString();
            list.add(listElement);
        }
        for (String arrList : list) {
            System.out.print(arrList + " ");
        }

        sortSelect(list);
        System.out.println('\n' + "Отсортированный массив:");
        for (String arrList : list) {
            System.out.print(arrList + " ");
        }

        System.out.print('\n' + "Вывод списка уникальных слов:" + '\n' + list.get(0));
        int count = 1;
        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(i - 1))) {
                System.out.print(" встречается в списке " + count + " раз " + '\n' + list.get(i));
                count = 1;
            } else {
                count++;
            }
        }
        System.out.print(" встречается в списке " + count + " раз");


// задание № 2
        PhoneBook<String,String>  person=new PhoneBook<>();
        person.add("7835931","Комар");
        person.add("7315420","Валуй");
        person.add("7804670","Комар");
        person.add("3748926","Комар");
        person.add("8678170","Савенкова");
        person.add("7837888","Савенков");
        person.add("5896579", "Некревич");
        System.out.println('\n');
        person.display();

        person.get("Комар");
        person.get("Савенкова");
        person.get("Валуй");
    }

    public static void sortSelect(ArrayList<String> list) {
        int out, in, mark;
        String tmp;
        for (out = 0; out < list.size(); out++) {
            mark = out;
            for (in = out + 1; in < list.size(); in++) {
                int varCompar = list.get(in).compareTo(list.get(mark));
                if (varCompar > 0) {
                    mark = in;
                }
            }
            tmp = list.get(out);
            list.set(out, list.get(mark));
            list.set(mark, tmp);
        }
    }
}
