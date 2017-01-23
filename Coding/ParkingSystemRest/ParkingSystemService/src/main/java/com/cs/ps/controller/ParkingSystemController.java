/**
 * 
 */
package com.cs.ps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cs.ps.service.ParkingStatusService;
import com.cs.ps.model.*;
import java.util.*;

/**
 * @author Sudhakar
 *
 */
@RestController
@RequestMapping
public class ParkingSystemController {
	
@Autowired	
ParkingStatusService psService;
//	@RequestMapping(method=RequestMethod.GET)
//	public String sayHello(ModelMap model){
//		model.addAttribute("test", "Hello, Welcome");
//		
//		return "welcome";
//	}
@RequestMapping(value="/status/",method=RequestMethod.GET)
public ResponseEntity< List<PasrkingStatus>>getStatus(){
	
	List<PasrkingStatus> psStatus=psService.getPaarkingStatus();
	
	return new ResponseEntity<List<PasrkingStatus>>(psStatus, HttpStatus.OK);
	
}

/**
 * @return the psService
 */
public ParkingStatusService getPsService() {
	return psService;
}

/**
 * @param psService the psService to set
 */
public void setPsService(ParkingStatusService psService) {
	this.psService = psService;
}
	
	

}
