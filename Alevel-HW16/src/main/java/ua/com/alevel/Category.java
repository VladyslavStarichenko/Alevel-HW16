package ua.com.alevel;

public class Category {
    String name;
    Integer categoryId;


    public Category(String name, Integer categoryId) {
        this.name = name;
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }
}
