package com.kuheng.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultipleRoutingDataSource extends AbstractRoutingDataSource{

	@Override
	protected Object determineCurrentLookupKey() {
		// TODO Auto-generated method stub
		return DataSourceContextHolder.getDataSourceType();
	}

}
