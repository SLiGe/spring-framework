package org.springframework.zjl.context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author zJiaLi
 * @since 2021-12-30 10:43
 */
@Component
public class CusBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		int singletonCount = beanFactory.getSingletonCount();
		System.out.println("singletonCount: " + singletonCount);
	}
}
