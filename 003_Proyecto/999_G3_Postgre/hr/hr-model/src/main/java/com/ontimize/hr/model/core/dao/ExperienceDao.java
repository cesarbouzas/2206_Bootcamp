package com.ontimize.hr.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ExperienceDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ExperienceDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ExperienceDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_ID = "EXP_ID";
 public static final String ATTR_DESCRIPTION = "EXP_DESCRIPTION";

}