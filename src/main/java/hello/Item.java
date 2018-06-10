package hello;

public class Item {

    String description;
    boolean completed;
    String belongsTo;
    int id;

    public Item(String description, boolean completed, String belongsTo, int id){
        this.description = description;
        this.completed = completed;
        this.belongsTo = belongsTo;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getBelongsTo() {
        return belongsTo;
    }

    public int locateItem(int id){
        return id;
    }
}
