package ch.zli.m223.punchclock.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String categoryName;
    private String categoryLenght;

    @OneToMany(mappedBy = "category")
    private List<Entry> entries;

    public long getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String username) {
        this.categoryName = categoryName;
    }

    public String getCategoryLength() {
        return categoryLenght;
    }

    public void setCategoryLength(String categoryLenght) {
        this.categoryLenght = categoryLenght;
    }

    public List<Entry> getEntries() {
        return this.entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }
}