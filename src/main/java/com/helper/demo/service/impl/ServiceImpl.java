package com.helper.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.helper.demo.dao.CustomerDao;
import com.helper.demo.dao.FeedbackDao;
import com.helper.demo.dao.HelperDetailsDao;
import com.helper.demo.model.Customer;
import com.helper.demo.model.Feedback;
import com.helper.demo.model.HelperDetails;
import com.helper.demo.service.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{


	@Autowired
	private HelperDetailsDao hd;
	@Autowired
	private CustomerDao ct;
	
	@Autowired
	private FeedbackDao fd;
	private List<HelperDetails> list1;

	
	
	
	
	
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
	
	@Override
	public List<HelperDetails> getMEchanicByLocation(String location) {
         
		 List<HelperDetails> Mechanical= getMechanical();
		 List<HelperDetails> list1=new  ArrayList<>();
		 for (HelperDetails helperdetails : Mechanical) {
			    if(helperdetails.getLocation().equals(location))
			    {
			    list1.add(helperdetails);
			    }
			  }

			 if(list1.isEmpty())return null;
			 else return list1;
		 
	}
	@Override
	public List<HelperDetails> getPlumberByLocation(String location) {
         
		 List<HelperDetails> Mechanical= getPlumber();
		 List<HelperDetails> list1=new  ArrayList<>();
		 for (HelperDetails helperdetails : Mechanical) {
			    if(helperdetails.getLocation().equals(location))
			    {
			    list1.add(helperdetails);
			    }
			  }

			 if(list1.isEmpty())return null;
			 else return list1;
		 
	}
	@Override
	public List<HelperDetails> getElectricianByLocation(String location) {
         
		 List<HelperDetails> Mechanical= getElectrician();
		 List<HelperDetails> list1=new  ArrayList<>();
		 for (HelperDetails helperdetails : Mechanical) {
			    if(helperdetails.getLocation().equals(location))
			    {
			    list1.add(helperdetails);
			    }
			  }

			 if(list1.isEmpty())return null;
			 else return list1;
		 
	}
	@Override
	public List<HelperDetails> getTutorByLocation(String location) {
         
		 List<HelperDetails> Mechanical= getTutor();
		 List<HelperDetails> list1=new  ArrayList<>();
		 for (HelperDetails helperdetails : Mechanical) {
			    if(helperdetails.getLocation().equals(location))
			    {
			    list1.add(helperdetails);
			    }
			  }

			 if(list1.isEmpty())return null;
			 else return list1;
		 
	}
	@Override
	public List<HelperDetails> getCarpenterByLocation(String location) {
         
		 List<HelperDetails> Mechanical= getCarpenter();
		 List<HelperDetails> list1=new  ArrayList<>();
		 for (HelperDetails helperdetails : Mechanical) {
			    if(helperdetails.getLocation().equals(location))
			    {
			    list1.add(helperdetails);
			    }
			  }

			 if(list1.isEmpty())return null;
			 else return list1;
		 
	}
	@Override
	public List<HelperDetails> getOtherByLocation(String location) {
         
		 List<HelperDetails> Mechanical= getOther();
		 List<HelperDetails> list1=new  ArrayList<>();
		 for (HelperDetails helperdetails : Mechanical) {
			    if(helperdetails.getLocation().equals(location))
			    {
			    list1.add(helperdetails);
			    }
			  }

			 if(list1.isEmpty())return null;
			 else return list1;
		 
	}
	
	@Override
	public List<HelperDetails> getHelper(String tempEmailId) {
//		  List<HelperDetails> list=hd.findAll();
		  List<Customer>list1=getCustomer(tempEmailId);
		  List<Customer> list2=new  ArrayList<>();
		  List<HelperDetails> list3=new  ArrayList<>();
		  for (Customer customer : list1) {
		    if(customer.getEmail().equals(tempEmailId) )
		    {
		     list2.add(customer);
		    }
		  }
		  List<HelperDetails> list=hd.findAll();
		  for (HelperDetails helper : list) {
			    if(helper.getCustomer().getEmail().equals(tempEmailId) )
			    {
			     list3.add(helper);
			    }
			  }
		  System.out.println("Function Called>>>>>>>>>>>>>>>>>>: "+list3);
		  return list3;
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

@Override
public List<Customer> getCustomer(String tempEmailId) {
	  List<Customer> list=ct.findAll();
	  List<Customer>list1=new ArrayList<>();
	  for (Customer customer : list) {
	    if(customer.getEmail().equals(tempEmailId) )
	    {
	     list1.add(customer);
	    }
	  }
	  System.out.println("Function Called>>>>>>>>>>>>>>>>>>: "+list1);
	  return list1;
	}
///////////////////Feedback section///////////////////////////
@Override
public Feedback createQuery(Feedback feedback) {
	fd.save(feedback);
	return feedback;
}




	
}
