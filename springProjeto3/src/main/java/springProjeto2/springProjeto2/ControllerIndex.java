package springProjeto2.springProjeto2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerIndex {
	
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}

	
	
}
