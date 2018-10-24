package com.kmit.QuickCook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.amazon.speech.json.SpeechletRequestEnvelope;
import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.speechlet.SpeechletV2;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.Reprompt;
import com.amazon.speech.ui.SimpleCard;
import com.amazon.speech.slu.Slot;

public class GreeterServiceSpeechlet implements SpeechletV2 {
private static final Logger log = LoggerFactory.getLogger(GreeterServiceSpeechlet.class);

@Override
public void onSessionStarted(SpeechletRequestEnvelope<SessionStartedRequest> requestEnvelope) {
    log.info("onSessionStarted requestId={}, sessionId={}", requestEnvelope.getRequest().getRequestId(),
            requestEnvelope.getSession().getSessionId());
}
@Override
public SpeechletResponse onLaunch(SpeechletRequestEnvelope<LaunchRequest> requestEnvelope) {
    log.info("onLaunch requestId={}, sessionId={}", requestEnvelope.getRequest().getRequestId(),
            requestEnvelope.getSession().getSessionId());
    String speechOutput =
           "Welcome to QuickCook Skill. I will tell you how to make some tasty snacks really quick. Shall we begin?";
    String repromptText = "For instructions on what you can say, please say help me.";
    return newAskResponse(speechOutput, repromptText);
}
@Override
public SpeechletResponse onIntent(SpeechletRequestEnvelope<IntentRequest> requestEnvelope) {
    IntentRequest request = requestEnvelope.getRequest();
    log.info("onIntent requestId={}, sessionId={}", request.getRequestId(),
            requestEnvelope.getSession().getSessionId());
    Intent intent = request.getIntent();
    String intentName = (intent != null) ? intent.getName() : null;
    if ("beginIntent".equals(intentName)) {
        return beginIntent(intent);
    }
    if("selectIntent".equals(intentName))
    {
    	return getIngredientIntent(intent);
    }
    if("moreIntent".equals(intentName))
    {
    	return moreIntent(intent);
    }
    if("recipeIntent".equals(intentName))
    {
    	return recipeIntent(intent);}
    if("repeatIntent".equals(intentName))
    {
    	return repeatIntent(intent);}
    if("thanksIntent".equals(intentName))
    {
    	return thanksIntent(intent);
    }
    if("ingrepIntent".equals(intentName))
    {
    	return ingrepIntent(intent);
    }
    if("recrepIntent".equals(intentName))
    {
    	return recrepIntent(intent);
    }
    else if ("AMAZON.HelpIntent".equals(intentName)) {
        return getHelp();
    } else if ("AMAZON.StopIntent".equals(intentName)) {
        PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
        outputSpeech.setText("Goodbye");
        return SpeechletResponse.newTellResponse(outputSpeech);
    } else if ("AMAZON.CancelIntent".equals(intentName)) {
        PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
        outputSpeech.setText("Goodbye");

        return SpeechletResponse.newTellResponse(outputSpeech);
    } else {
        String errorSpeech = "This is unsupported.  Please try something else.";
        return newAskResponse(errorSpeech, errorSpeech);
    }
}

@Override
public void onSessionEnded(SpeechletRequestEnvelope<SessionEndedRequest> requestEnvelope) {
    log.info("onSessionEnded requestId={}, sessionId={}", requestEnvelope.getRequest().getRequestId(),
            requestEnvelope.getSession().getSessionId());
}
    String value;
    int r0=0;
    int p=0;
    String resString; 
    String[] recipies0 = new String[]{"Apple chips", "Kale chips", "Zucchini chips"};
	String[] recipies1 = new String[]{"Sweet Potato chips","Pizza Waffles","Carrot Fries"};
	String[] recipies2 = new String[]{"Raspberry lemon popsicle","Peach Sorbet","Frozen smoothie pops"};
	String[] recipies3 = new String[]{"Cheesy cloud chips","mozzarella Pasta","Presto Permesan chips"};
	String[] recipies4 = new String[]{"Chocolate almond smoothie","Orange mango carrot smoothie","Peanut butter oat energy balls"};
/*
    String[] recipies0= new String[] {"a","b","c"};
    String[] recipies1= new String[] {"d","e","f"};
    String[] recipies2= new String[] {"g","h","i"};
    String[] recipies3= new String[] {"j","k","l"};
    String[] recipies4= new String[] {"m","n","o"};
    */
private SpeechletResponse beginIntent(Intent intent) {
	    String[] awe = new String[]{"Cool!", "Awesome!", "Great!","Wonderful!"};
    int randomNum = (int)(Math.random()*4);
        //String resString;      
        resString =awe[randomNum]+"Here is a list of recipies you can choose from ."+" 1 "+recipies0[r0]+". 2 "+recipies1[r0]+". 3 "+recipies2[r0]+". 4 "+recipies3[r0]+". 5 "+recipies4[r0]+" .Please choose one of these recipies. For example say 'the first one' . or . say 'more recipies' to get another list .";
        String responseText = resString;
            PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
            outputSpeech.setText(responseText);
            SimpleCard card = new SimpleCard();
            card.setTitle("Intent Values  ");
            card.setContent(responseText);
            PlainTextOutputSpeech repromptOutputSpeech = new PlainTextOutputSpeech();
            repromptOutputSpeech.setText("Please give an instruction");
            Reprompt reprompt = new Reprompt();
            reprompt.setOutputSpeech(repromptOutputSpeech);
            return SpeechletResponse.newAskResponse(outputSpeech,reprompt, card);
}

private SpeechletResponse getIngredientIntent(Intent intent) {  
	Slot iSlot = intent.getSlot("selection");
    value = iSlot.getValue();
    value=value.toLowerCase();
    if(value.equals("one")||value.equals("1")||value.equals("1st")||value.equals("first") || value.equals("apple chips")|| value.equals("kale chips")|| value.equals("zucchini chips")||value.equals("apple")||value.equals("kale")||value.equals("zucchini"))
    {
    	if(r0==0)
    	p=0;
    	else if(r0==1)
    	p=1;
    	else 
    		p=2;
    }
    else if(value.equals("two")||value.equals("2")||value.equals("second")||value.equals("2nd")|| value.equals("sweet potato chips")|| value.equals("pizza waffles")|| value.equals("carrot fries")||value.equals("sweet potato")||value.equals("sweet")||value.equals("carrot")||value.equals("pizza"))
    {
    	if(r0==0)
        	p=3;
        	else if(r0==1)
        	p=4;
        	else 
        		p=5;

    }
    else if(value.equals("three")||value.equals("3")||value.equals("3rd")||value.equals("third")|| value.equals("raspberry lemon popsicles")|| value.equals("peach sorbet")|| value.equals("frozen smoothie pops")||value.equals("raspberry")||value.equals("raspberry lemon")||value.equals("peach")||value.equals("frozen")||value.equals("frozen smoothie"))
    {
    	if(r0==0)
        	p=6;
        	else if(r0==1)
        	p=7;
        	else 
        		p=8;
}
    else if(value.equals("four")||value.equals("4")||value.equals("4th")||value.equals("fourth")|| value.equals("cheesy cloud chips")|| value.equals("mozzarella pasta")|| value.equals("pesto parmesan chips")||value.equals("cheesy")||value.equals("cheesy cloud")||value.equals("mozzarella")||value.equals("pesto")||value.equals("pesto parmesan"))
    {
    	if(r0==0)
        	p=9;
        	else if(r0==1)
        	p=10;
        	else 
        		p=11;

    }
    else if(value.equals("five")||value.equals("5")||value.equals("5th")||value.equals("fifth")|| value.equals("chocolate almond smoothie")|| value.equals("orange mango carrot smoothie")|| value.equals("peanut butter oat energy balls")||value.equals("chocolate")||value.equals("chocolate almond")||value.equals("orange")||value.equals("orange mango")||value.equals("orange mango carrot")||value.equals("peanut")||value.equals("peanut butter")||value.equals("peanut butter oat")||value.equals("peanut butter oat energy "))
    {
    	if(r0==0)
        	p=12;
        	else if(r0==1)
        	p=13;
        	else 
        		p=14;
    }
    //String resString=null;
    resString=App.ingredients(p)+". To repeat say 'repeat' . Please say 'proceed' to continue with the recipe, or say 'another recipes' to choose another recipe.";
        String responseText = resString;
        PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
        outputSpeech.setText(responseText);
        SimpleCard card = new SimpleCard();
        card.setTitle("Intent Values  ");
        card.setContent(responseText);
        PlainTextOutputSpeech repromptOutputSpeech = new PlainTextOutputSpeech();
        repromptOutputSpeech.setText("Please give an instruction");
        Reprompt reprompt = new Reprompt();
        reprompt.setOutputSpeech(repromptOutputSpeech);
        return SpeechletResponse.newAskResponse(outputSpeech,reprompt, card);
}

private SpeechletResponse moreIntent(Intent intent) {
	Slot iSlot = intent.getSlot("more");
     String value1 = iSlot.getValue();  
   // String resString=null;
    if(value1.equals("more"))
     {
    	r0++;
      if(r0==3)
     	r0=0;
     }
         resString ="okay!"+"Here is the list of recipies you can choose from."+" 1 "+recipies0[r0]+". 2 "+recipies1[r0]+". 3 "+recipies2[r0]+". 4 "+recipies3[r0]+".  5 "+recipies4[r0]+" .Please choose one of them or say 'more recipes' for another list.";
         String responseText = resString;
        PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
        outputSpeech.setText(responseText);
        SimpleCard card = new SimpleCard();
        card.setTitle("Intent Values  ");
        card.setContent(responseText);
        PlainTextOutputSpeech repromptOutputSpeech = new PlainTextOutputSpeech();
        repromptOutputSpeech.setText("Please give an instruction");
        Reprompt reprompt = new Reprompt();
        reprompt.setOutputSpeech(repromptOutputSpeech);
        return SpeechletResponse.newAskResponse(outputSpeech,reprompt, card);      
 }

private SpeechletResponse recipeIntent(Intent intent) {   
   resString=App.recipes(p)+" To repeat say 'repeat' . Please say 'more recipes' for making other tasty recipes. Happy Cooking!!";
    String responseText = resString;
    PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
        outputSpeech.setText(responseText);
        SimpleCard card = new SimpleCard();
        card.setTitle("Intent Values  ");
        card.setContent(responseText);
        PlainTextOutputSpeech repromptOutputSpeech = new PlainTextOutputSpeech();
        repromptOutputSpeech.setText("Please give an instruction");
        Reprompt reprompt = new Reprompt();
        reprompt.setOutputSpeech(repromptOutputSpeech);
        return SpeechletResponse.newAskResponse(outputSpeech,reprompt, card);
 }
private SpeechletResponse thanksIntent(Intent intent) {
    
    
    String resString="I am Glad!!";
    String responseText = resString;

    
        PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
        outputSpeech.setText(responseText);

        SimpleCard card = new SimpleCard();
        card.setTitle("Intent Values  ");
        card.setContent(responseText);
        PlainTextOutputSpeech repromptOutputSpeech = new PlainTextOutputSpeech();
        repromptOutputSpeech.setText("Please give an instruction");
        Reprompt reprompt = new Reprompt();
        reprompt.setOutputSpeech(repromptOutputSpeech);

        return SpeechletResponse.newAskResponse(outputSpeech,reprompt, card);
           

 
}

private SpeechletResponse ingrepIntent(Intent intent) {
    
    
    resString=App.ingredients(p)+". To repeat say 'repeat' . Please say 'proceed' to continue with the recipe, or say 'another recipes' to choose another recipe.";;
    String responseText = resString;

    
        PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
        outputSpeech.setText(responseText);

        SimpleCard card = new SimpleCard();
        card.setTitle("Intent Values  ");
        card.setContent(responseText);
        PlainTextOutputSpeech repromptOutputSpeech = new PlainTextOutputSpeech();
        repromptOutputSpeech.setText("Please give an instruction");
        Reprompt reprompt = new Reprompt();
        reprompt.setOutputSpeech(repromptOutputSpeech);

        return SpeechletResponse.newAskResponse(outputSpeech,reprompt, card);
           

 
}

private SpeechletResponse recrepIntent(Intent intent) {
    
    
    resString=App.recipes(p)+" To repeat say 'repeat' . Please say 'more recipes' for making other tasty recipes. Happy Cooking!!";;
    String responseText = resString;

    
        PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
        outputSpeech.setText(responseText);

        SimpleCard card = new SimpleCard();
        card.setTitle("Intent Values  ");
        card.setContent(responseText);
        PlainTextOutputSpeech repromptOutputSpeech = new PlainTextOutputSpeech();
        repromptOutputSpeech.setText("Please give an instruction");
        Reprompt reprompt = new Reprompt();
        reprompt.setOutputSpeech(repromptOutputSpeech);

        return SpeechletResponse.newAskResponse(outputSpeech,reprompt, card);
           

 
}
private SpeechletResponse repeatIntent(Intent intent) {
    
    String responseText = resString;

    
        PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
        outputSpeech.setText(responseText);

        SimpleCard card = new SimpleCard();
        card.setTitle("Intent Values  ");
        card.setContent(responseText);
        PlainTextOutputSpeech repromptOutputSpeech = new PlainTextOutputSpeech();
        repromptOutputSpeech.setText("Please give an instruction");
        Reprompt reprompt = new Reprompt();
        reprompt.setOutputSpeech(repromptOutputSpeech);

        return SpeechletResponse.newAskResponse(outputSpeech,reprompt, card);
           

 
}

private SpeechletResponse getHelp() {
    String speechOutput =
            "You can say 'more recipes'";
    String repromptText =
    		"You can say 'more recipes'";
    return newAskResponse(speechOutput, repromptText);
}
private SpeechletResponse newAskResponse(String stringOutput, String repromptText) {
	
	 SimpleCard card = new SimpleCard();
     card.setTitle(stringOutput);
    PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
    outputSpeech.setText(stringOutput);

    PlainTextOutputSpeech repromptOutputSpeech = new PlainTextOutputSpeech();
    repromptOutputSpeech.setText(repromptText);
    Reprompt reprompt = new Reprompt();
    reprompt.setOutputSpeech(repromptOutputSpeech);

    return SpeechletResponse.newAskResponse(outputSpeech, reprompt,card);
}
}
