package com.xworkz.shumoss.boot;

import com.xworkz.shumoss.pcchaining.Invitation;
import com.xworkz.shumoss.pcchaining.ToShubham;

public class InvitationRunner {

	public static void main(String[] args) {
		
		Invitation Invitation = new ToShubham("marrige", false,"watsup");
		
		System.out.println(Invitation.forAllFamily);
		System.out.println(Invitation.invitationFor);
		System.out.println(Invitation.type);
		
		


	}

}
