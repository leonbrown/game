package com.lesson.game;

import com.lesson.game.Wizard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.lesson.game.Wizard;



public class WizardTemp extends Wizard{
	
	public WizardTemp(String name) {
		super(name);
		int i;
	}
	
	public String extraMethod() {
		return "";
	}
}

