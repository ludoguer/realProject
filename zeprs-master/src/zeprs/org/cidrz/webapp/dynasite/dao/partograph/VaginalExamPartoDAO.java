/*
 *    Copyright 2003, 2004, 2005, 2006 Research Triangle Institute
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 */

package org.cidrz.webapp.dynasite.dao.partograph;

import org.apache.commons.dbutils.QueryLoader;
import org.cidrz.project.zeprs.valueobject.partograph.VaginalExamParto;
import org.cidrz.project.zeprs.valueobject.BaseRecord;
import org.cidrz.webapp.dynasite.Constants;
import org.cidrz.webapp.dynasite.exception.ObjectNotFoundException;
import org.cidrz.webapp.dynasite.dao.PersistenceDAO;
import org.cidrz.webapp.dynasite.utils.DatabaseUtils;

import javax.servlet.ServletException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author <a href="mailto:<a href="/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="593a323c35353c20192b2d3077362b3e">[email protected]</a>">Chris Kelley</a>
 *         Date: Jul 6, 2005
 *         Time: 9:22:16 AM
 */
public class VaginalExamPartoDAO implements PersistenceDAO {

    /**
     * Returns one record for patient
     *
     * @param conn
     * @param patientId
     * @param pregnancyId
     * @return
     * @throws java.sql.SQLException
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     */
    public BaseRecord getOne(Connection conn, Long patientId, Long pregnancyId) throws SQLException, ServletException, IOException, ObjectNotFoundException {
        Map queries = QueryLoader.instance().load("/" + Constants.SQL_PARTO_PROPERTIES);
        String sql = (String) queries.get("SQL_RETRIEVE_VAGINALEXAMPARTO");
        VaginalExamParto item = null;
        ArrayList values;
        values = new ArrayList();
        values.add(patientId);
        values.add(pregnancyId);
        item = (VaginalExamParto) DatabaseUtils.getBean(conn, VaginalExamParto.class, sql, values);
        return item;
    }


}