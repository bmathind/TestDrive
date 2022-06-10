package com.baban.db.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "driverDbEntityManagerFactory", transactionManagerRef = "driverDbTransactionManager", basePackages = {
		"com.baban.repository" })
public class DriverDbConfig {
	@Value("${spring.datasource.username}")
	private String dbUserName;
	@Value("${spring.datasource.password}")
	private String dbPassword;
	@Value("${spring.datasource.url}")
	private String dbUrl;
	@Value("${spring.datasource.driver-class-name}")
	private String dbDriverClass;
	@Value("${spring.datasource.maxActive}")
	private int maxActive;
	@Value("${spring.datasource.maxIdle}")
	private int maxIdleSRM;
	@Value("${spring.datasource.minIdle}")
	private int minIdleSRM;
	@Value("${spring.datasource.initialSize}")
	private int initialSizeSRM;
	@Value("${spring.datasource.maxWait}")
	private int maxWait;

	private EntityManager entityManager;
	
	@Bean(name = "driverDbDataSource")
	@Primary
	public DataSource dataSource() {
		BasicDataSource dataSourceSRM = new BasicDataSource();
		dataSourceSRM.setDriverClassName(dbDriverClass);
		dataSourceSRM.setUrl(dbUrl);
		dataSourceSRM.setUsername(dbUserName);
		dataSourceSRM.setPassword(dbPassword);
		dataSourceSRM.setMaxTotal(maxActive);
		dataSourceSRM.setMaxIdle(maxIdleSRM);
		dataSourceSRM.setMinIdle(minIdleSRM);
		dataSourceSRM.setInitialSize(initialSizeSRM);
		dataSourceSRM.setMaxWaitMillis(maxWait);

		return dataSourceSRM;
	}
	
	@Bean(name = "driverDbEntityManagerFactory")
	@Primary
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("driverDbDataSource") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("com.baban.entity")
				.persistenceUnit("DriverPersistanceUnit").properties(jpaProperties()).build();
	}
	
	@Bean(name = "driverDbTransactionManager")
	@Primary
	public PlatformTransactionManager transactionManager(
			@Qualifier("driverDbEntityManagerFactory") EntityManagerFactory dashboardDbEntityManagerFactory) {
		this.entityManager = dashboardDbEntityManagerFactory.createEntityManager();
		return new JpaTransactionManager(dashboardDbEntityManagerFactory);
	}
	
	private Map<String, String> jpaProperties() {
		Map<String, String> jpaPropertiesMap = new HashMap<>();
		jpaPropertiesMap.put("show.sql", "false");
		return jpaPropertiesMap;
	}
	
	/**
	 * @return EntityManager
	 */
	public EntityManager getEntityManager(){
		return this.entityManager;
	}
}
