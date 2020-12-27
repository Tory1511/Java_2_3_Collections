package geekbrains.ru;

import java.util.*;

public class PhoneBook
{
    public HashMap<String, String> phoneBook = new HashMap<>();

    public void add(String name, String phoneNumber)
    {
        this.phoneBook.put(phoneNumber, name);
    }

    public Set<String> get(String name)
    {
        Set<String> keys = new HashSet<String>();
        for (Map.Entry<String, String> entry : this.phoneBook.entrySet())
        {
            if (Objects.equals(name, entry.getValue()))
            {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

    public void printInfo()
    {
        System.out.println(phoneBook);
    }
}
