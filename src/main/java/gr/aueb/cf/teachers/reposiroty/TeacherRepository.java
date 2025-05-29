package gr.aueb.cf.teachers.reposiroty;

import gr.aueb.cf.teachers.model.Teacher;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> , JpaSpecificationExecutor<Teacher> {
  List<Teacher> findByRegionId(Long id);
  Optional<Teacher> findByUuid(String uuid);
  Optional<Teacher> findByVat(String vat);


}
