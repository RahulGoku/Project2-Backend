package com.helper.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.helper.demo.dao.CoursesDao;
import com.helper.demo.dao.CustomerDao;
import com.helper.demo.dao.HelperDetailsDao;
import com.helper.demo.dao.UserDetailsDao;
import com.helper.demo.model.Courses;
import com.helper.demo.model.Customer;
import com.helper.demo.model.HelperDetails;
import com.helper.demo.model.UserDetails;
import com.helper.demo.service.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

	@Autowired
	private CoursesDao cd;
	@Autowired
	private UserDetailsDao ud;
	@Autowired
	private HelperDetailsDao hd;
	@Autowired
	private CustomerDao ct;
	private List<HelperDetails> list1;

	
	@Override
	public List<Courses> getAllCourses() {
		return cd.findAll();
	}

	@Override
	public Optional<Courses> getCourse(int cid) {
		return cd.findById(cid);
	}

	@Override
	public Courses createCourse(Courses courses) {
		cd.save(courses);
		return courses;
	}

	@Override
	public Courses updateCourse(Courses courses) {
		cd.save(courses);
		return courses;
	}

	@Override
	public String removeCourse(int cid) {
		cd.deleteById(cid);
		return "course deleted sucessfully";
	}
	
	
////////////////////user section//////////////////////////////////////
	
	@Override
	public List<UserDetails> getAllUsers() {
		return ud.findAll();
	}
	
	@Override
	public UserDetails createUser(UserDetails userDetails) {
		ud.save(userDetails);
		return userDetails;
	}
	
	
	///////////////////helper section///////////////////////////
	
	@Override
	public List<HelperDetails> getAllHelper() {
		return hd.findAll();
	}
	@Override
	public List<HelperDetails> getMechanical() {
		 List<HelperDetails> list=hd.findAll();
		 List<HelperDetails> list1=new ArrayList<HelperDetails>();
		  for (HelperDetails helperdetails : list) {
		    if(helperdetails.getHelperService().equals("Mechanic"))
		    {
		    list1.add(helperdetails);
		    }
		  }

		 if(list1.isEmpty())return null;
		 else return list1;
	}
	@Override
	public List<HelperDetails> getPlumber() {
		 List<HelperDetails> list=hd.findAll();
		 List<HelperDetails> list1=new ArrayList<HelperDetails>();
		  for (HelperDetails helperdetails : list) {
		    if(helperdetails.getHelperService().equals("Plumber"))
		    {
		    list1.add(helperdetails);
		    }
		  }

		 if(list1.isEmpty())return null;
		 else return list1;
	}
	@Override
	public List<HelperDetails> getElectrician() {
		 List<HelperDetails> list=hd.findAll();
		 List<HelperDetails> list1=new ArrayList<HelperDetails>();
		  for (HelperDetails helperdetails : list) {
		    if(helperdetails.getHelperService().equals("Electrician"))
		    {
		    list1.add(helperdetails);
		    }
		  }

		 if(list1.isEmpty())return null;
		 else return list1;
	}
	@Override
	public List<HelperDetails> getCarpenter() {
		 List<HelperDetails> list=hd.findAll();
		 List<HelperDetails> list1=new ArrayList<HelperDetails>();
		  for (HelperDetails helperdetails : list) {
		    if(helperdetails.getHelperService().equals("Carpenter"))
		    {
		    list1.add(helperdetails);
		    }
		  }

		 if(list1.isEmpty())return null;
		 else return list1;
	}
	@Override
	public List<HelperDetails> getTutor() {
		 List<HelperDetails> list=hd.findAll();
		 List<HelperDetails> list1=new ArrayList<HelperDetails>();
		  for (HelperDetails helperdetails : list) {
		    if(helperdetails.getHelperService().equals("Tutor"))
		    {
		    list1.add(helperdetails);
		    }
		  }

		 if(list1.isEmpty())return null;
		 else return list1;
	}
	@Override
	public List<HelperDetails> getOther() {
		 List<HelperDetails> list=hd.findAll();
		 List<HelperDetails> list1=new ArrayList<HelperDetails>();
		  for (HelperDetails helperdetails : list) {
		    if(helperdetails.getHelperService().equals("Other"))
		    {
		    list1.add(helperdetails);
		    }
		  }

		 if(list1.isEmpty())return null;
		 else return list1;
	}



	@Override
	public HelperDetails createHelper(HelperDetails helperDetails) {
		hd.save(helperDetails);
	
		return helperDetails;
	}
	
///////////////////Customer section///////////////////////////

@Override
public Customer createCustomer(Customer customer) {
ct.save(customer);
return customer;
}
@Override
public Customer loginCustomer(String tempEmailId, String tempPassword) {
  List<Customer> list=ct.findAll();
  for (Customer customer : list) {
    if(customer.getEmail().equals(tempEmailId) && customer.getUserPassword().equals(tempPassword))
    {
      return customer;
     
    }
  }
  return null;
}
@Override
public Customer getCustomerId(String tempEmailId) {
	  List<Customer> list=ct.findAll();
	  for (Customer customer : list) {
	    if(customer.getEmail().equals(tempEmailId) )
	    {
	      return customer;
	    }
	  }
	  return null;
	}


	
}
