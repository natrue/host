package event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;


/**
 * @author nature
 *
 */
public class EventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher applicationEventPublisher;
	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher=applicationEventPublisher;
	}
	
	public void publisher(){
		Event event=new Event(this);
		applicationEventPublisher.publishEvent(event);
	}
}
