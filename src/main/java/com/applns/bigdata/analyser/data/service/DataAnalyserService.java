package com.applns.bigdata.analyser.data.service;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class DataAnalyserService {

	private static final Logger log = LoggerFactory.getLogger(DataAnalyserService.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Map<String, String>> getEarliestArtDatesByPlaceOfOrigin() {
		String sql = "SELECT place_of_origin, MIN(date_start) AS earliest_start_date FROM public.datum GROUP BY place_of_origin";
		return runQuery(sql);
	}
	
	public List<Map<String, String>> getMostPopularStyleTitles() {
		String sql = "SELECT style_title, COUNT(*) AS popularity FROM public.datum GROUP BY style_title ";
		return runQuery(sql);
	}


	private List<Map<String, String>> runQuery(String qry) {
		return jdbcTemplate.query(qry,
				new RowMapper<Map<String, String>>() {
					@Override
					public Map<String, String> mapRow(ResultSet rs, int rowNum) throws SQLException {
						ResultSetMetaData metaData = rs.getMetaData();
						int columnCount = metaData.getColumnCount();
						Map<String, String> row = new HashMap<>();
						for (int i = 1; i <= columnCount; i++) {
							String columnName = metaData.getColumnName(i);
							String columnValue = rs.getString(i);
							row.put(columnName, columnValue);
						}
						return row;
					}
				});
	}

	public List<Map<String, String>> getAllArtWorkTypeTitles() {
		String sql = "SELECT artwork_type_title, COUNT(*) AS num_rows FROM public.datum GROUP BY artwork_type_title";
		return runQuery(sql);
	}

}
