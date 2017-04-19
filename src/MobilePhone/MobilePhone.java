package MobilePhone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author András
 */
public class MobilePhone {

	int phoneNumber;
	boolean beingCalled;
	String mobileType;

	public boolean callPhone(int dialedNumber) {
		if (dialedNumber != phoneNumber){
			return false;
		}
		if (beingCalled==true){
			return false;
		}
		beingCalled = true;
		return true;
	}

	public boolean hangUp(int Number) {
		if (beingCalled == false) {
			throw new IllegalStateException("Trying to hang up while not being called");
		}
		beingCalled = false;
		return true;
	}
}
