package org.springframework.zjl.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @author zJiaLi
 * @since 2022-01-04 21:10
 */
@Component
public class CusApplicationEvent implements ApplicationEventPublisher, ApplicationEventPublisherAware {
	private ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void publishEvent(Object event) {
		String abd = "test";
		applicationEventPublisher.publishEvent(new PayloadApplicationEvent<>(abd, String.class));
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
}
