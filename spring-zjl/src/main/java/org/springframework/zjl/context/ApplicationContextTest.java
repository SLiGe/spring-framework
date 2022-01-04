package org.springframework.zjl.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.zjl.event.CusApplicationEvent;

/**
 * @author zJiaLi
 * @since 2021-12-29 15:09
 */
public class ApplicationContextTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		CusApplicationEvent cusApplicationEvent = applicationContext.getBean("cusApplicationEvent", CusApplicationEvent.class);
		cusApplicationEvent.publishEvent(1);
		//applicationContext.refresh();
	}
}
