package ch.zli.m223.punchclock.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String moodName;

    @OneToMany(mappedBy = "mood")
    private List<Entry> entries;

    public long getId() {
        return id;
    }

    public String getMood() {
        return moodName;
    }

    public void setMood(String moodName) {
        this.moodName = moodName;
    }

    public List<Entry> getEntries() {
        return this.entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }
}