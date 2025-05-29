package gr.aueb.cf.teachers.reposiroty;

import gr.aueb.cf.teachers.model.static_data.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegionRepositoty extends JpaRepository <Region, Long>, JpaSpecificationExecutor< Region> {

}
