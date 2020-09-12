package com.edu.conf;

import org.hibernate.dialect.MySQL5InnoDBDialect;

@SuppressWarnings("deprecation")
public class LocalMysqlDialect extends MySQL5InnoDBDialect{
	@Override
    public String getTableTypeString() {
		//解决JPA创建出的表不是UTF-8 导致的乱码问题
		//需在application.properties中指定spring.jpa.database-platform=com.edu.conf.LocalMysqlDialect
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
