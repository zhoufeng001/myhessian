package org.myhessian.server;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.myhessian.client.ObjectService;
import org.myhessian.client.bean.Person;
import org.myhessian.client.exception.RemotingInvokException;

public class ObjectServiceImpl implements ObjectService{

	private ConcurrentHashMap<Integer , Person> perons = new ConcurrentHashMap<Integer, Person>() ;

	private AtomicInteger currentId = new AtomicInteger(0) ;

	public Person getPerson(int id) {
		return perons.get(id);
	}

	public int savePerson(Person person) {
		person.setId(currentId.incrementAndGet());
		perons.put( currentId.get() , person) ;
		return currentId.get();
	}

	public Person exceptionTest() {
		throw new RemotingInvokException("测试异常");
	}

}
