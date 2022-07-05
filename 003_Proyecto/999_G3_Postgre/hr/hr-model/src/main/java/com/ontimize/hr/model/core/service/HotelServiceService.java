package com.ontimize.hr.model.core.service;



import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

import com.ontimize.hr.api.core.service.IHotelServiceService;
import com.ontimize.hr.model.core.dao.HotelServiceDao;

@Lazy
@Service("HotelService")
public class HotelServiceService implements IHotelServiceService {

	@Autowired private HotelServiceDao hotelServiceDao;

	@Autowired private DefaultOntimizeDaoHelper daoHelper;


	 @Override
	 public EntityResult hotelServiceQuery(Map<String, Object> keyMap, List<String> attrList)
	   throws OntimizeJEERuntimeException {
	  return this.daoHelper.query(this.hotelServiceDao, keyMap, attrList);
	 }

	 @Override
	 public EntityResult hotelServiceInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
	  return this.daoHelper.insert(this.hotelServiceDao, attrMap);
	 }

	 @Override
	 public EntityResult hotelServiceUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
	   throws OntimizeJEERuntimeException {
	  return this.daoHelper.update(this.hotelServiceDao, attrMap, keyMap);
	 }

	 @Override
	 public EntityResult hotelServiceDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
	  return this.daoHelper.delete(this.hotelServiceDao, keyMap);
	 }

}
