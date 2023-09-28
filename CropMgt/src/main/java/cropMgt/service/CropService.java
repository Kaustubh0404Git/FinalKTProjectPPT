package cropMgt.service;

import java.util.List;

import cropMgt.entity.Crop;

public interface CropService {
	 List < Crop > getAllCrops();
	    void saveCrop(Crop crop);
	    Crop getCropById(long id);
	    void deleteCropById(long id);

}
