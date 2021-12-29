package org.springframework.zjl.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zJiaLi
 * @since 2021-12-29 15:09
 */
public class ApplicationContextTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		//applicationContext.refresh();
	}
}
