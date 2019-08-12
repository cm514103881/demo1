package cn.itcast.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @program: exam_project
 * @description: 操作数据库的工具类
 * @author: Ruoquan
 * @create: 2019-07-24 16:30
 **/
public class JDBCUtil {

    public static DataSource ds;

    static {
        Properties pro = new Properties();
        InputStream s = JDBCUtil.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            pro.load(s);
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDs() {
        return ds;
    }
}
