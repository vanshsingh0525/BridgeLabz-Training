package com.lambdaexpressions.smarthomelighting;

import java.util.HashMap;
import java.util.Map;

public class SmartLightSystem {

    private Map<String, LightAction> triggers = new HashMap<>();
    
    public void addTrigger(String trigger, LightAction action) {
    	triggers.put(trigger, action);
    }
    
    public void execute(String trigger) {
    	if(triggers.containsKey(trigger)) {
    		triggers.get(trigger).activate();
    	}
    	else {
    		System.out.println("No action for trigger :" + trigger);
    	}
    }
}
