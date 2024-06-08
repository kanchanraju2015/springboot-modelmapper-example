
package com.briz.springbootmodelmapperexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController 
{
	//https://www.javaguides.net/2021/02/spring-boot-dto-example-entity-to-dto.html
@Autowired
BookRepository brepo;
@Autowired  
ModelMapper modelmapper;// check the ModelMapconfiguration 

@RequestMapping("/test")
public String booktest()
{
	return "This is model mapper test";
}
@RequestMapping("/save")
public BookDTO save(@RequestBody BookDTO bookdto)
{
	Book book=new Book();
    modelmapper.map(bookdto, book);//
    //BeanUtils.copyProperties(bookdto, book); // same work by another library 
    brepo.save(book);	
	return bookdto;
}
@RequestMapping("/all")
public List<BookDTO> allbooks()
{
return brepo.findAll().stream().map(books->modelmapper.map(books,BookDTO.class))
.collect(Collectors.toList());// changing to the list				
}
@RequestMapping("/upd/{id}")
public BookDTO update(@RequestBody BookDTO bookto,@PathVariable int id)
{
Book b=brepo.findById(id).get();
b.setAname(bookto.getAname());
b.setBname(bookto.getAname());
modelmapper.map(b,bookto); // there is another option below this i.e BeanUtils
//BeanUtils.copyProperties(b,bookdto);
return bookto;
}
@RequestMapping("/{id}")
public BookDTO byid(@PathVariable int id)
{
BookDTO bookdto=new BookDTO();
Book book=brepo.findById(id).get();
modelmapper.map(book,bookdto);// source to target 
return bookdto;
}
}






