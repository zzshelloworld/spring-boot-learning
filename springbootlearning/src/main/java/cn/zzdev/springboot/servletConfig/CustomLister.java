package cn.zzdev.springboot.servletConfig;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
@Slf4j
public class CustomLister implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("监听器：初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("监听器：销毁");
    }


}
