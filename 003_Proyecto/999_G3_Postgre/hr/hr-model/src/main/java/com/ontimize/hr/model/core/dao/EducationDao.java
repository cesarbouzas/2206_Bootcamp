package com.ontimize.hr.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("EducationDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/EducationDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class EducationDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_ID = "EDUCA_ID";
 public static final String ATTR_DESCRIPTION = "EDUCA_DESCRIPTION";
}