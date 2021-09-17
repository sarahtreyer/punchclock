package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.Mood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoodRepository extends JpaRepository<Mood, Long> {
}
