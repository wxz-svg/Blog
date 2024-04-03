package com.wxz.common.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis-Plus配置类，用于配置MyBatis-Plus的相关插件和行为。
 */
/**
 * Mybatis Plus配置类，用于配置Mybatis Plus的相关插件。
 */
@EnableTransactionManagement
@Configuration
public class MybatisPlusConfig {

    /**
     * 创建并配置Mybatis Plus拦截器。
     * 这个拦截器主要用于分页插件的配置，以支持MySQL的分页查询。
     *
     * @return 返回配置好的Mybatis Plus拦截器实例。
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        //  插件
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 分页插件
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
        // 设置最大分页数
        paginationInnerInterceptor.setMaxLimit(100L);
        // 是否对超过最大分页时做溢出处理
        paginationInnerInterceptor.setOverflow(true);
        // 设置数据库类型
        paginationInnerInterceptor.setDbType(DbType.MARIADB);
        //paginationInnerInterceptor.setProperties();
        // paginationInnerInterceptor.setDialect();
        //paginationInnerInterceptor.setOptimizeJoin();
        // 添加分页插件
        interceptor.addInnerInterceptor(paginationInnerInterceptor);
        return interceptor;
    }

}
