package com.sonar.issues.service;

import org.springframework.stereotype.Service;

@Service
public class UsersServise {
		public String getUserCategory(int age, boolean premium, boolean active) {

		    if(active) {

		        if(age >= 18) {

		            if(premium) {

		                if(age > 60) {
		                    return "SENIOR_PREMIUM";
		                } else {
		                    return "PREMIUM_USER";
		                }

		            } else {

		                if(age > 60) {
		                    return "SENIOR_USER";
		                } else {
		                    return "NORMAL_USER";
		                }
		            }

		        } else {

		            if(premium) {
		                return "YOUNG_PREMIUM";
		            } else {
		                return "YOUNG_USER";
		            }
		        }

		    } else {
		        return "INACTIVE_USER";
		    }
		}
		public void processUser(String name) {

		    try {

		        int length = name.length();
		        System.out.println(length);

		    } catch (Exception e) {

		        System.out.println(e);

		    }
		}
}
