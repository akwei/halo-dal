package halo.dal.partition;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 逻辑表 标识
 * 
 * @author akwei
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DALTableName {

    /**
     * 逻辑表名称
     * 
     * @return
     */
    String name();

    /**
     * 解析器类型
     * 
     * @return
     */
    Class<DALPartitionParser> partitionClass();
}