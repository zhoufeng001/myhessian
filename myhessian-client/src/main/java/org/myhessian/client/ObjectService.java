package org.myhessian.client;

import org.myhessian.client.bean.Person;

public interface ObjectService {
	
	Person getPerson(int id);

	int savePerson(Person person);
	
	Person exceptionTest();
}
