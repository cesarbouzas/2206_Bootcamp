package com.ontimize.hr.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.hr.api.core.service.IOfferService;
import com.ontimize.jee.server.rest.ORestController;

@RestController
@RequestMapping("/offers")
public class OfferRestController extends ORestController<IOfferService> {

 @Autowired
 private IOfferService offerService;

 @Override
 public IOfferService getService() {
  return this.offerService;
 }
}