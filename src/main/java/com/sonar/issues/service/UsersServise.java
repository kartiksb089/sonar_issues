package com.sonar.issues.service;

import org.springframework.stereotype.Service;

import com.sonar.issues.globalExceptions.UserProcessingException;

@Service
public class UsersServise {
//		public String getUserCategory(int age, boolean premium, boolean active) {
//
//		    if(active) {
//
//		        if(age >= 18) {
//
//		            if(premium) {
//
//		                if(age > 60) {
//		                    return "SENIOR_PREMIUM";
//		                } else {
//		                    return "PREMIUM_USER";
//		                }
//
//		            } else {
//
//		                if(age > 60) {
//		                    return "SENIOR_USER";
//		                } else {
//		                    return "NORMAL_USER";
//		                }
//		            }
//
//		        } else {
//
//		            if(premium) {
//		                return "YOUNG_PREMIUM";
//		            } else {
//		                return "YOUNG_USER";
//		            }
//		        }
//
//		    } else {
//		        return "INACTIVE_USER";
//		    }
//		}
//		public void processUser(String name) {
//
//		    try {
//
//		        int length = name.length();
//		        System.out.println(length);
//
//		    } catch (Exception e) {
//
//		        System.out.println(e);
//
//		    }
//		}
	public String getUserCategory(int age, boolean premium, boolean active) {

	    if (!active) {
	        return "INACTIVE_USER";
	    }

	    if (age < 18) {
	        return premium ? "YOUNG_PREMIUM" : "YOUNG_USER";
	    }

	    if (age > 60) {
	        return premium ? "SENIOR_PREMIUM" : "SENIOR_USER";
	    }

	    return premium ? "PREMIUM_USER" : "NORMAL_USER";
	}
		public void processUser(String name) {

		    try {

		        int length = name.length();
		        System.out.println(length);

		    } catch (Exception e) {
		        throw new UserProcessingException("Unable to process user");
		    }
		}
}
