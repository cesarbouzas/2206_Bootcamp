package com.ontimize.hr.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ExperienceDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ProfileDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class StatusDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_ID = "STA_ID";
 public static final String ATTR_DESCRIPTION = "STA_DESCRIPTION";
}


