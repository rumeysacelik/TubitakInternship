package TubitakNew.newtubitak.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import TubitakNew.newtubitak.core.utilities.result.DataResult;
import TubitakNew.newtubitak.core.utilities.result.Result;
import TubitakNew.newtubitak.entities.concretes.Lesson;
import TubitakNew.newtubitak.services.LessonService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/lessons")
@AllArgsConstructor

public class LessonsController {
	
	private LessonService lessonService;
	

	@GetMapping("/getall")
	public DataResult<List<Lesson>> getAll(){
	
		return lessonService.getAll();
		
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Lesson lesson) {
		return lessonService.add(lesson);
		
	}
	
	@GetMapping("/getByLessonName")
	public DataResult<Lesson> getByLessonName(@RequestParam String lessonName){
		return this.lessonService.getByLessonName(lessonName);
	}

}
