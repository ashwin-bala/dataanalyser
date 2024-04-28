package com.applns.bigdata.analyser.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import com.applns.bigdata.analyser.data.service.DataAnalyserService;

@ExtendWith(MockitoExtension.class)
class DataanalyserServiceTests {
	@Mock
	private JdbcTemplate jdbcTemplate;
	
    @InjectMocks
    private DataAnalyserService analyserService;
    
    @BeforeAll
    public static void beforeAll() {
        MockitoAnnotations.openMocks(DataanalyserServiceTests.class);
    }

	
	@SuppressWarnings("unchecked")
	@Test
    public void testGetEarliestArtDatesByPlaceOfOrigin() {
    	List<Map<String,String>> sd = new ArrayList<>();
        Mockito.when(this.jdbcTemplate.query(Mockito.any(String.class),Mockito.any(org.springframework.jdbc.core.RowMapper.class)))
        .thenReturn(sd);

        this.analyserService.getEarliestArtDatesByPlaceOfOrigin();

        Mockito.verify(this.jdbcTemplate, Mockito.times(1))
        .query(Mockito.any(String.class),Mockito.any(org.springframework.jdbc.core.RowMapper.class));
    }
	
	@SuppressWarnings("unchecked")
	@Test
    public void testGetMostPopularStyleTitles() {
    	List<Map<String,String>> sd = new ArrayList<>();
        Mockito.when(this.jdbcTemplate.query(Mockito.any(String.class),Mockito.any(org.springframework.jdbc.core.RowMapper.class)))
        .thenReturn(sd);

        this.analyserService.getMostPopularStyleTitles();

        Mockito.verify(this.jdbcTemplate, Mockito.times(1))
        .query(Mockito.any(String.class),Mockito.any(org.springframework.jdbc.core.RowMapper.class));
    }
	
	@SuppressWarnings("unchecked")
	@Test
    public void testGetAllArtWorkTypeTitles() {
    	List<Map<String,String>> sd = new ArrayList<>();
        Mockito.when(this.jdbcTemplate.query(Mockito.any(String.class),Mockito.any(org.springframework.jdbc.core.RowMapper.class)))
        .thenReturn(sd);

        this.analyserService.getAllArtWorkTypeTitles();

        Mockito.verify(this.jdbcTemplate, Mockito.times(1))
        .query(Mockito.any(String.class),Mockito.any(org.springframework.jdbc.core.RowMapper.class));
    }
	
}
