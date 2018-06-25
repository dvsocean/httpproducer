package services;

import objects.Item;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ItemService {

    private final Map<Long, Item> ItemMap;

    public ItemService(){
        ItemMap = new HashMap<>();
        ItemMap.put(1L, new Item("Electronics", true, "Chris", 1));
        ItemMap.put(2L, new Item("Boats", true, "Ericka", 2));
        ItemMap.put(3L, new Item("Cars", false, "Evan", 3));
        ItemMap.put(4L, new Item("Horses", false, "Bob", 4));
        ItemMap.put(5L, new Item("Dogs", true, "Robert", 5));
        ItemMap.put(6L, new Item("Snakes", false, "Steve", 6));
    }

    public Item findItemById(Long id){
        return ItemMap.get(id);
    }
}
