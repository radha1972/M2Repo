package hello;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.slf4j.LoggerFactory;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;

@RestController

public class EmployeeController {
 private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
 @Autowired
 EmployeeRepository repository;
 /* @PostMapping
 public Employee add(@RequestBody Employee employee) {
  LOGGER.info("Employee add: {}", employee);
  return repository.add(employee);
 }
 @GetMapping("/{id}")
 public Employee findById(@PathVariable("id") Long id) {
  LOGGER.info("Employee find: id={}", id);
  return repository.findById(id);
 }*/
 @GetMapping
 public List findAll() {
  LOGGER.info("Employee find");
  return repository.findAll();
 }
 @GetMapping("/department/{departmentId}")
 public List findByDepartment(@PathVariable("departmentId") Long departmentId) {
  LOGGER.info("Employee find: departmentId={}", departmentId);
  return repository.findByDepartment(departmentId);
 }
 @GetMapping("/organization/{organizationId}")
 public List findByOrganization(@PathVariable("organizationId") Long organizationId) {
  LOGGER.info("Employee find: organizationId={}", organizationId);
  return repository.findByOrganization(organizationId);
 }
}