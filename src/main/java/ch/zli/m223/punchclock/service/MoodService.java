package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Mood;
import ch.zli.m223.punchclock.repository.MoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoodService {
    private MoodRepository moodRepository;

    public MoodService(MoodRepository moodRepository) {
        this.moodRepository = moodRepository;
    }

    public Mood createMood(Mood mood) {
        return moodRepository.saveAndFlush(mood);
    }

    public List<Mood> findAll() {
        return moodRepository.findAll();
    }
}
