package lesson3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона
по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.*/

public class PhoneBook<K, V> {

    protected Map<K, V> data = new HashMap<>();
    protected Set<Map.Entry<K, V>> set= data.entrySet();

    public boolean add(K valueKey, V value) {
        data.put(valueKey, value);
        return true;
    }

    public void get(V value) {
        System.out.println('\n'+"Все абоненты с фамилией "+value);
        for (Map.Entry<K,V> me: set){
            if(value.equals(me.getValue())){
            System.out.print(me.getValue()+": "+me.getKey()+'\n');
            }
        }
    }


    public void display() {
    for (Map.Entry<K,V> me: set){
        System.out.print(me.getValue()+": "+me.getKey()+'\n');
    }
 }
}
