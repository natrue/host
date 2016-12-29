package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import domain.Student;
import event.EventPublisher;


public class StudentDao {
	private EventPublisher eventPublisher;
	public void setEventPublisher(EventPublisher eventPublisher) {
		this.eventPublisher = eventPublisher;
	}

	private SqlSessionFactory sqlSessionFactory;
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
		this.sqlSessionFactory=sqlSessionFactory;
	}
	
	public void add(Student student) throws Exception{
		SqlSession sqlSession=sqlSessionFactory.openSession();
		sqlSession.insert(Student.class.getName()+".add",student);
		sqlSession.close();
		eventPublisher.publisher();
	}
}
