package MobilePhone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import MobilePhone.MobilePhone;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andras
 */
public class MobilePhoneTest {

	public MobilePhoneTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testCallPhoneWhenNotBeingCalled() {
		//given
		MobilePhone phone = new MobilePhone();
		phone.phoneNumber = 12345;
		phone.beingCalled=false;

		//when
		boolean callSuccess=phone.callPhone(12345);

		//then
		assertTrue(phone.beingCalled);
		assertTrue(callSuccess);
	}

	@Test
	public void testCallPhoneWhenBeingCalled() {
		//given
		MobilePhone phone = new MobilePhone();
		phone.phoneNumber = 12345;
		phone.beingCalled=true;

		//when
		boolean callResult=phone.callPhone(12345);

//		then
		assertFalse(callResult);
	}

	@Test
	public void testCallPhoneWhenNumberIsInvalid(){
		//given
		MobilePhone phone= new MobilePhone();
		phone.phoneNumber=12345;

		//when
		boolean callSuccess=phone.callPhone(999);
		boolean callSuccess2=phone.callPhone(12345);
		
		//then
		assertFalse(callSuccess);
		assertTrue(callSuccess2);
	}

	@Test
	public void testHangUpWhenCalled() {
		//given
		MobilePhone phone = new MobilePhone();
		phone.beingCalled = true;

		//when 
		phone.hangUp(0);

		//then
		assertFalse(phone.beingCalled);
	}

	@Test(expected = IllegalStateException.class)
	public void testHangupWhenNotCalled() {
		//given
		MobilePhone phone = new MobilePhone();
		phone.beingCalled = false;

		//then
		phone.hangUp(0);

	}

}
