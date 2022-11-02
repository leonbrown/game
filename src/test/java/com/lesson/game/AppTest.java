package com.lesson.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.lesson.game.Wizard;

/**
 * Unit test for simple App.
 */
@DisplayName("general tests")
public class AppTest 
{
	private Wizard wizard = new Wizard("Mr Wizard");
	
	
	@Test
	@DisplayName("Values don't match")
	void notEquals() {
		assertNotEquals(10,20);
	}
	
	@Test
	void equals() {
		String variable = "Target VaLuE";
		assertEquals("target value", variable.toLowerCase());
	}
	
	@Test
	void equalsArray() {
		int[] expected = {5,10,15,20,25};
		int[] actual = {5,10,15,20,25};
		assertArrayEquals(expected, actual, "Values don't match in array...");
	}
	
	
	@Test
	void mixedTests() {
		int[] expected = {5,10,15,20,25};
		int[] actual = {5,10,15,20,25};
		assertArrayEquals(expected, actual, "Values don't match in array...");
		
		assertTrue(actual.length < 10);
		assertTrue(actual.length > 3, "Not enough values in the array.");
		assertEquals(5, actual[0]);
	}
	
	@Test
	void wizardMagicTest() {
		assertEquals(20, wizard.doMagic(10));
	}
	
	@Test
	void wizardMagicSetSameAsGet() {
		String spell = "test1";
		wizard.setMagic(spell, 50);
		assertEquals(50, wizard.getMagic(spell), "Magic value does not match expected value.");
	}
	
	@Test
	void wizardMagicCount() {
		wizard.setMagic("spell1", 50);
		wizard.setMagic("spell2", 50);
		wizard.setMagic("spell3", 50);
		//3 spells already exist
		assertEquals(6, wizard.getMagicCount());
	}
	
	
	@Test
	void wizardMock() {
		Wizard newWizard = Mockito.mock( Wizard.class );
		
		Mockito.when( newWizard.getMagicCount() ).thenReturn( 50000 );
		Mockito.when( newWizard.getMagic("") ).thenReturn( -100 );
		Mockito.when( newWizard.getMagic("abc") ).thenReturn( -555 );
		
		System.out.println( newWizard.getMagicCount() );
		System.out.println( newWizard.getMagic("") );
		System.out.println( newWizard.getMagic("abc") );
		
		//assertEquals( jobObj.getSalary(), 123 );

	}
	
	
	@Test
	void classInherit() {
		WizardTemp newWizard = new WizardTemp("Test Wizard");
		System.out.println( newWizard.extraMethod() );
	}
	
	
	@Test
	void classInheritMock() {
		WizardTemp newWizard = Mockito.mock( WizardTemp.class );
		
		Mockito.when( newWizard.extraMethod() ).thenReturn( "**** EXTRA METHOD ****" );
		System.out.println( newWizard.extraMethod() );
		
		System.out.println( newWizard.getClass().getSimpleName().split("$")[0] );
		
	}
	
	@Test
	void test() {
		assertTrue(true);
	}
	
	@Test
	void testFalse() {
		assertFalse(false);
	}
/*
   private Wizard wizard = new Wizard("Mr Wizard");
   
   @Test
   //@DisplayName("valid magic")
   void magicValid(){
	  assertEquals(wizard.doMagic("heal"), 20);
   }
   */
}