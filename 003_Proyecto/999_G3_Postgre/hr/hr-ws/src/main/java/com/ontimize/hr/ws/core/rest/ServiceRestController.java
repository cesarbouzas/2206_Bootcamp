package com.ontimize.hr.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.hr.api.core.service.IServiceService;
import com.ontimize.jee.server.rest.ORestController;

@RestController
@RequestMapping("/services")
public class ServiceRestController extends ORestController<IServiceService> {

 @Autowired
 private IServiceService serviceService;

 @Override
 public IServiceService getService() {
  return this.serviceService;
 }
}
