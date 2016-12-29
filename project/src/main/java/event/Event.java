package event;

import org.springframework.context.ApplicationEvent;

/**
 * @author nature
 *
 */
public class Event extends ApplicationEvent {
	//构造器
	public Event(Object source) {
		super(source);
	}
	//添加事件
	public String insert(){
		return "当前动作为添加事件";
	}
	//查询事件
	public String find(){
		return "当前动作为查询事件";
	}
	
}
