package restapi.sample.controller;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restapi.sample.model.Employee;

@RestController
@Slf4j
public class Controller {
    List<Employee> employeesList = new ArrayList<Employee>();

	@GetMapping("/list")
    public List<Employee> getEmployees()
    {

        if (employeesList.size()==0)
            employeesList.add(new Employee(employeesList.size()+1,"FirstName","LastName","test"+employeesList.size()+1+"@test.com"));
        log.info("Get Request Received "+new java.util.Date() + " emp details "+employeesList.get(0).toString());
        return employeesList;
    }

    @PostMapping("/add")
    public List<Employee> postEmployees()
    {
        employeesList.add(new Employee(employeesList.size()+1,"FirstName","LastName","test"+employeesList.size()+1+"@test.com"));
        log.info("Post Request Received "+new java.util.Date() + " emp details "+employeesList.get(1).toString());
        return employeesList;
    }

}
