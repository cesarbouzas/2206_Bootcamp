package com.ontimize.hr.model.core.dao;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;


@Lazy
@Repository(value = "ServiceDao")
@ConfigurationFile(
	configurationFile = "dao/ServiceDao.xml",
	configurationFilePlaceholder = "dao/placeholders.properties")
public class ServiceDao extends OntimizeJdbcDaoSupport {
	public static final String TAG="srv_";
	public static final String ATTR_ID= TAG+"id";
	public static final String ATTR_NAME=TAG+"name";
	public static final String ATTR_STREET=TAG+"description";

}
