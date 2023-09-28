package cropMgt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cropMgt.entity.Crop;


public interface CropRepository extends JpaRepository<Crop, Long> {

}
