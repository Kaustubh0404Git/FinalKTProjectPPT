package cropMgt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import cropMgt.entity.Crop;
import cropMgt.service.CropService;

@Controller
public class CropController {

	    @Autowired
	    private CropService cropService;

	    // display list of c
	    @GetMapping("/")
	    public String viewHomePage(Model model) {
	        model.addAttribute("listCrops", cropService.getAllCrops());
	        return "index";
	    }

	    @GetMapping("/showNewCropForm")
	    public String showNewCropForm(Model model) {
	        // create model attribute to bind form data
	        Crop crop = new Crop();
	        model.addAttribute("crop", crop);
	        return "new_crop";
	    }

	    @PostMapping("/saveCrop")
	    public String saveCrop(@ModelAttribute("crop") Crop crop) {
	        // save crop to database
	        cropService.saveCrop(crop);
	        return "redirect:/";
	    }

	    @GetMapping("/showFormForUpdate/{id}")
	    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

	        // get crop from the service
	        Crop crop = cropService.getCropById(id);

	        // set crop as a model attribute to pre-populate the form
	        model.addAttribute("crop", crop);
	        return "update_crop";
	    }

	    @GetMapping("/deleteCrop/{id}")
	    public String deleteCrop(@PathVariable(value = "id") long id) {

	        // call delete crop method 
	        this.cropService.deleteCropById(id);
	        return "redirect:/";
	    }
	}

