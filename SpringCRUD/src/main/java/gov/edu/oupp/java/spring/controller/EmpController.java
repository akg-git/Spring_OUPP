package gov.edu.oupp.java.spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;    

import gov.edu.oupp.java.spring.dao.EmpDAO;
import gov.edu.oupp.java.spring.model.Emp;

@Controller
public class EmpController {
	
	@Autowired
	EmpDAO empdao; //injects dao from XML
	
	/*displays a form to input data,
	 * command: reserved request attribute  which display data into form*/
	@RequestMapping("/empform")
	public String showform(Model m){
		m.addAttribute("command", new Emp());
		return "empform";
	}
	
	/*	list of employees in  model object	*/
	@RequestMapping("/viewemp")
	public String viewmap(Model m){
		List<Emp> list = empdao.getEmployee();
		m.addAttribute("list", list);
		return "viewemp";
	}
	
	/*save object into database */
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute("emp") Emp emp){
		empdao.save(emp);
		return "redirect:/viewemp";	//redirect to viewemp
	}
	
/*	Edit: populate object data (for given id)
 * @PathVariable : provides path URL
 * */
	@RequestMapping(value="/editemp/{id}")
	public String edit(@PathVariable int id, Model m){
		Emp emp  = empdao.getEmpById(id);
		m.addAttribute("command",emp);
		return "empeditform";
	}
	
	//update model object
	@RequestMapping(value="/editsave", method = RequestMethod.POST)
	public String editSave(@ModelAttribute("emp") Emp emp){
		empdao.update(emp);
		return "redirect:/viewemp";
	}
	
	// deletes record
	@RequestMapping(value="/deleteemp/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id){
		empdao.delete(id);
		return "redirect:/viewemp";
	}
}
