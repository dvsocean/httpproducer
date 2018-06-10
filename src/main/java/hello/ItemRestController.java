package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
