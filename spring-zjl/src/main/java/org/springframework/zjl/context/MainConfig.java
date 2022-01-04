package org.springframework.zjl.context;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author zJiaLi
 * @since 2021-12-29 15:10
 */
@ComponentScan(basePackages = {"org.springframework.zjl.context","org.springframework.zjl.event"})
@Configuration
public class MainConfig implements BeanNameAware {

	@Override
	public void setBeanName(String name) {
		System.out.println("MainConfig bean Name: " + name);
	}
}
