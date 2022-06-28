package com.ontimize.hr.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("OriginDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/OriginDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class OriginDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_ID = "ORI_ID";
 public static final String ATTR_DESCRIPTION = "ORI_DESCRIPTION";
}