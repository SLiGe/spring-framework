package org.springframework.zjl.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author zJiaLi
 * @since 2022-01-04 21:17
 */
@Component
public class CusApplicationEventListener implements ApplicationListener<PayloadApplicationEvent<String>> {

	@EventListener(classes = PayloadApplicationEvent.class)
	@Override
	public void onApplicationEvent(PayloadApplicationEvent<String> event) {
		System.out.println("监听器收到事件消息: "+event.getPayload());
	}
}
