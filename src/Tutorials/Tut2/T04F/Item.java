package Tutorials.Tut2.T04F;

public class Item {
    private String code;
    private String description;
    private String category;

    public Item(String code, String description, String category) {
        this.code = code;
        this.description = description;
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "";
    }
}
