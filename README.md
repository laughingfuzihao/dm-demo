## Springboot+达梦7+Mybatis-Plus War包发布
达梦7JDBC驱动分为Dm7JdbcDriver14、Dm7JdbcDriver15、Dm7JdbcDriver16、Dm7JdbcDriver16，分别对应Jdk1.4、Jdk1.5、Jdk1.6、Jdk1.7;
达梦7提供不同hibernate和jdk版本的方言包，用户可根据开发环境选择对应的方言包版本，相关方言包驱动在dialect目录

## 打包
本项目生成war包，maven install需要跳过测试
