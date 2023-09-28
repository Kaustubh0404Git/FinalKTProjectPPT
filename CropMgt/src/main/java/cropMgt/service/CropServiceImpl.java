package cropMgt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cropMgt.entity.Crop;
import cropMgt.repository.CropRepository;

@Service
public class CropServiceImpl implements CropService{

	
	 @Autowired
	    private CropRepository cropRepository;

	    @Override
	    public List < Crop > getAllCrops() {
	        return cropRepository.findAll();
	    }

	    @Override
	    public void saveCrop(Crop crop) {
	        this.cropRepository.save(crop);
	    }

	    @Override
	    public Crop getCropById(long id) {
	        Optional < Crop > optional = cropRepository.findById(id);
	        Crop crop = null;
	        if (optional.isPresent()) {
	            crop = optional.get();
	        } else {
	            throw new RuntimeException(" Crop not found for id :: " + id);
	        }
	        return crop;
	    }

	    @Override
	    public void deleteCropById(long id) {
	        this.cropRepository.deleteById(id);
	    }
}
