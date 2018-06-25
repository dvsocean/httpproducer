package hello;

import objects.Item;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import services.ItemService;

@ComponentScan("services")
@RestController
public class ItemRestController {

    private final ItemService is;

    public ItemRestController(ItemService is) {
        this.is = is;
    }

    @GetMapping("/item/{id}")
    public Item locateThisItem(@PathVariable("id") Long id) {
        return is.findItemById(id);
    }

}
