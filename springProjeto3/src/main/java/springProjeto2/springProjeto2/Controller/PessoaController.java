package springProjeto2.springProjeto2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springProjeto2.springProjeto2.Model.Pessoa;
import springProjeto2.springProjeto2.Repository.PessoaRepository;

@Controller
public class PessoaController {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@RequestMapping(method = RequestMethod.GET, value="/cadastropessoa")
	public String inicio() {
		
		return "cadastro/cadastropessoa";
	}
	
	@PostMapping(value="/salvarpessoa")
	public String salvar(Pessoa pessoa) {
		
		pessoaRepository.save(pessoa);
		
		return"cadastro/cadastropessoa";

}
	
	
}
