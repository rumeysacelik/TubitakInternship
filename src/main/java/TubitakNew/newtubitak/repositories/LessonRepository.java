package TubitakNew.newtubitak.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import TubitakNew.newtubitak.entities.concretes.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {
	Lesson  getByLessonName(String lessonName);
}
