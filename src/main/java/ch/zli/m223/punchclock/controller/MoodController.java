package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Mood;
import ch.zli.m223.punchclock.service.MoodService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/entries")
public class MoodController {
    private MoodService moodService;

    public MoodController(MoodService moodService) {
        this.moodService = moodService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Mood> getAllEntries() {
        return moodService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mood createMood(@Valid @RequestBody Mood mood) {
        return moodService.createMood(mood);
    }
}

