package net.skhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/third")
public class ThirdController {

	@RequestMapping("test1")
	public String test1(Model model) {
		Student student = new Student(1, "201532021", "오준현", "oh.junhyeon95@gmail.com");
		model.addAttribute("student", student);
		return "test1";
	}

	@GetMapping("test2")
	public String test2(Model model) {
		model.addAttribute("student", new Student());
		return "test2";
	}

	@PostMapping("test2")
	public String test2(Model model, Student student) {

		model.addAttribute("message", "저장되었습니다");
		return "test2";
	}

}