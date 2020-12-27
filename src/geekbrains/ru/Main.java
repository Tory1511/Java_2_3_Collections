package geekbrains.ru;

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
// из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
//2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный
// справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
//Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля
// (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner),
// тестировать просто из метода main() прописывая add() и get().

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
	List<String> fruitsAndVeges = Arrays.asList
            ("Apple", "Kiwi", "Carrot", "Orange", "Pineapple", "Apple", "Cabbage", "Broccoli", "Watermelon", "Kiwi",
             "Tomato", "Onion", "Grape", "Potato", "Leek", "Kiwi", "Cucumber", "Eggplant",  "Pumpkin", "Apple");
        System.out.println(fruitsAndVeges);
        System.out.println("Unique words: " + toGetUniqWords(fruitsAndVeges));

        PhoneBook pb = new PhoneBook();
        pb.add("Orlov", "78987563");
        pb.add("Orlov", "098712345");
        pb.add("Kurochkin", "007070707");
        pb.printInfo();
        System.out.println(pb.get("Orlov"));
        System.out.println(pb.get("Kurochkin"));
    }



    public static Map<String, Integer> toGetUniqWords(List<String> arr)
    {
        Map<String, Integer> wordsCounter = new HashMap<>();
        for (String w : arr)
        {
            wordsCounter.put(w, wordsCounter.getOrDefault(w, 0) + 1 );

        }
        Set<String> unique = new HashSet<>(arr);

        return wordsCounter;
    }
}
