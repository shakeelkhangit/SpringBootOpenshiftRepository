package com.example.DemoTestreact.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.DemoTestreact.Idao.IuserDao;
import com.example.DemoTestreact.model.User;

@Transactional
@Repository
public class UserDaoImpl  implements IuserDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers() {
		
		String sql="FROM user u ORDER BY u.id";
		
		return (List<User>) entityManager.createQuery(sql).getResultList();
	}

}
