package hello;

import java.util.List;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
//Employee add(Employee employee);

List findAll();

List findByDepartment(Long id2);
 List findByOrganization(Long id3);
}
