package com.ontimize.hr.model.core.dao;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;


@Lazy
@Repository(value = "HotelServiceDao")
@ConfigurationFile(
	configurationFile = "dao/HotelServiceDao.xml",
	configurationFilePlaceholder = "dao/placeholders.properties")
public class HotelServiceDao extends OntimizeJdbcDaoSupport {
	public static final String ATTR_ID_HOTEL= "htl_id";
	public static final String ATTR_ID_SERVICE="srv_id";
}
