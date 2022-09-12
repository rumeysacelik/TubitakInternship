package TubitakNew.newtubitak.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TubitakNew.newtubitak.core.utilities.result.DataResult;
import TubitakNew.newtubitak.core.utilities.result.Result;
import TubitakNew.newtubitak.core.utilities.result.SuccessDataResult;
import TubitakNew.newtubitak.core.utilities.result.SuccessResult;
import TubitakNew.newtubitak.entities.concretes.Lesson;
import TubitakNew.newtubitak.repositories.LessonRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class LessonService {

	private LessonRepository lessonRepository;
	
	@Autowired
	public LessonService(LessonRepository lessonRepository) {
		super();
		
		this.lessonRepository = lessonRepository;
	}

	
	
	public DataResult<List<Lesson>> getAll() {
		// TODO Auto-generated method stub
		
		return new SuccessDataResult<List<Lesson>>(this.lessonRepository.findAll(), "Data listelendi");
		
				
				
	}


	
	public Result add(Lesson lesson) {
		this.lessonRepository.save(lesson);
		return new SuccessResult("Ürün eklendi");
	}


	
	public DataResult<Lesson> getByLessonName(String lessonName) {
		return new SuccessDataResult<Lesson>
		(this.lessonRepository.getByLessonName(lessonName), "Data Listelendi");
	}

}

