package com.ontimize.hr.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ontimize.hr.api.core.service.IHotelServiceService;
import com.ontimize.jee.server.rest.ORestController;

@RestController
@RequestMapping("/hotelserviceservice")
public class HotelServiceRestController extends ORestController<IHotelServiceService> {

 @Autowired
 private IHotelServiceService hotelServiceService;

 @Override
 public IHotelServiceService getService() {
  return this.hotelServiceService;
 }
}
