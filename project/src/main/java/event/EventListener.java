package event;

import org.springframework.context.ApplicationListener;

public class EventListener implements ApplicationListener<Event>{

	@Override
	public void onApplicationEvent(Event event) {
		if(event instanceof Event){
			System.out.println(event.getSource());
		}
	}
		
	
}
