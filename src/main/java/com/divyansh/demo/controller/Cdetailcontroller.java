package com.divyansh.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.divyansh.demo.model.Cdetail;
import com.divyansh.demo.repo.CdetailRepo;

@RestController
public class Cdetailcontroller {
	@Autowired
	CdetailRepo repo;
	@RequestMapping("/")
  public String app()
  {
	  return "app.jsp";
  }
  @PostMapping("/addCdetail")
  public Cdetail addCdetail(Cdetail cdetail)
  {
	  repo.save(cdetail);
	  return cdetail;
  }
  @RequestMapping("/getCdetail")
  public ModelAndView getCdetail(int cid)
  {
	 ModelAndView ob=new ModelAndView("show");
	 Cdetail cdetail=repo.findById(cid).orElse(new Cdetail());
	 
	 ob.addObject(cdetail);
	 System.out.println(repo.findByName("john"));
	 return ob;
	 
  }
  
  @GetMapping("/getallCdetail")
  
  public List<Cdetail> getallCdetail()
  {
	  return repo.findAll();
  }
  @RequestMapping("/getidCdetail/{cid}")
 
  public Optional<Cdetail> getidCdetail(@PathVariable("cid") int cid)
  {
	  return repo.findById(cid);
  }
}
