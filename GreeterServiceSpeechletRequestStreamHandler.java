package com.kmit.QuickCook;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

/**
 * This class could be the handler for an AWS Lambda function powering an Alexa Skills Kit
 * experience. To do this, simply set the handler field in the AWS Lambda console to
 * "com.amazonaws.lambda.alexademo.HelloworldSpeechletRequestStreamHandler" For this to work, you'll also need to build
 * this project using the {@code lambda-compile} Ant task and upload the resulting zip file to power
 * your function.
 */
public final class GreeterServiceSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
    private static final Set<String> supportedApplicationIds;
    static {
        /*
         * This Id can be found on https://developer.amazon.com/edw/home.html#/ "Edit" the relevant
         * Alexa Skill and put the relevant Application Ids in this Set.
         */
        supportedApplicationIds = new HashSet<String>();
        supportedApplicationIds.add("amzn1.ask.skill.0d3ed146-6768-4cf0-a3d5-2da5e698f034");
    }

    public GreeterServiceSpeechletRequestStreamHandler() {
        super(new GreeterServiceSpeechlet(), supportedApplicationIds);
    }
}
