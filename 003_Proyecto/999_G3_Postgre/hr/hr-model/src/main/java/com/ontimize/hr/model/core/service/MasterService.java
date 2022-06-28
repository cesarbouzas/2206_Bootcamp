package com.ontimize.hr.model.core.service;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ontimize.hr.api.core.service.IMasterService;
import com.ontimize.hr.model.core.dao.EducationDao;
import com.ontimize.hr.model.core.dao.ExperienceDao;//Mal en lo ejemplos??
import com.ontimize.hr.model.core.dao.OriginDao;//Mal en los Apuntes??
import com.ontimize.hr.model.core.dao.ProfileDao;
import com.ontimize.hr.model.core.dao.StatusDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

@Service("MasterService")
@Lazy

public class MasterService implements IMasterService{
	
	@Autowired private EducationDao educationDao;
	@Autowired private ExperienceDao experienceDao;
	@Autowired private OriginDao originDao;
	@Autowired private ProfileDao profileDao;
	@Autowired private StatusDao statusDao;
	@Autowired private DefaultOntimizeDaoHelper daoHelper;
	
	@Override
	public EntityResult educationQuery(Map<String,Object>keyMap,List<String>attrList)
	throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.educationDao, keyMap, attrList);
	}
	@Override
	public EntityResult educationInsert(Map<String,Object> attrMap) 
	throws OntimizeJEERuntimeException{
		return this.daoHelper.insert(this.educationDao, attrMap);
	}
	@Override
	public EntityResult educationUpdate(Map<String,Object>attrMap,Map<String,Object>KeyMap)
	throws OntimizeJEERuntimeException{
		return this.daoHelper.update(this.educationDao, attrMap, KeyMap);
	}
	@Override
	public EntityResult educationDelete(Map<String,Object>keyMap)
	throws OntimizeJEERuntimeException{
		return this.daoHelper.delete(this.educationDao, keyMap);
	}
	@Override
	public EntityResult experienceQuery(Map<String,Object>keyMap,List<String>attrList)
	throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.experienceDao, keyMap, attrList);
	}
	@Override
	public EntityResult experienceInsert(Map<String,Object> attrMap) 
	throws OntimizeJEERuntimeException{
		return this.daoHelper.insert(this.experienceDao, attrMap);
	}
	@Override
	public EntityResult experienceUpdate(Map<String,Object>attrMap,Map<String,Object>KeyMap)
	throws OntimizeJEERuntimeException{
		return this.daoHelper.update(this.experienceDao, attrMap, KeyMap);
	}
	@Override
	public EntityResult experienceDelete(Map<String,Object>keyMap)
	throws OntimizeJEERuntimeException{
		return this.daoHelper.delete(this.experienceDao, keyMap);
	}
	@Override
	public EntityResult originQuery(Map<String,Object>keyMap,List<String>attrList)
	throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.originDao, keyMap, attrList);
	}
	@Override
	public EntityResult originInsert(Map<String,Object> attrMap) 
	throws OntimizeJEERuntimeException{
		return this.daoHelper.insert(this.originDao, attrMap);
	}
	@Override
	public EntityResult originUpdate(Map<String,Object>attrMap,Map<String,Object>KeyMap)
	throws OntimizeJEERuntimeException{
		return this.daoHelper.update(this.originDao, attrMap, KeyMap);
	}
	@Override
	public EntityResult originDelete(Map<String,Object>keyMap)
	throws OntimizeJEERuntimeException{
		return this.daoHelper.delete(this.originDao, keyMap);
	}
	//***********************************//
	@Override
	public EntityResult profileQuery(Map<String,Object>keyMap,List<String>attrList)
	throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.profileDao, keyMap, attrList);
	}
	@Override
	public EntityResult profileInsert(Map<String,Object> attrMap) 
	throws OntimizeJEERuntimeException{
		return this.daoHelper.insert(this.profileDao, attrMap);
	}
	@Override
	public EntityResult profileUpdate(Map<String,Object>attrMap,Map<String,Object>KeyMap)
	throws OntimizeJEERuntimeException{
		return this.daoHelper.update(this.profileDao, attrMap, KeyMap);
	}
	@Override
	public EntityResult profileDelete(Map<String,Object>keyMap)
	throws OntimizeJEERuntimeException{
		return this.daoHelper.delete(this.profileDao, keyMap);
	}
	@Override
	public EntityResult statusQuery(Map<String,Object>keyMap,List<String>attrList)
	throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.statusDao, keyMap, attrList);
	}
	@Override
	public EntityResult statusInsert(Map<String,Object> attrMap) 
	throws OntimizeJEERuntimeException{
		return this.daoHelper.insert(this.statusDao, attrMap);
	}
	@Override
	public EntityResult statusUpdate(Map<String,Object>attrMap,Map<String,Object>KeyMap)
	throws OntimizeJEERuntimeException{
		return this.daoHelper.update(this.statusDao, attrMap, KeyMap);
	}
	@Override
	public EntityResult statusDelete(Map<String,Object>keyMap)
	throws OntimizeJEERuntimeException{
		return this.daoHelper.delete(this.statusDao, keyMap);
	}
	
	
	
	
	
	
	
	
	

}
