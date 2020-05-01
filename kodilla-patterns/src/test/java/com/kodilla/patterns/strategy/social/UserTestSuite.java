package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //given
        User millenials = new Millenials("Adam");
        User zGeneration = new ZGeneration("Jan");
        User yGeneration = new YGeneration("Jakub");

        //when
        String millenialsPost = millenials.sharePost();
        String zGenerationPost = zGeneration.sharePost();
        String yGenerationPost = yGeneration.sharePost();

        //then
        Assert.assertEquals(millenialsPost, "sharing post: Snapchat");
        Assert.assertEquals(zGenerationPost, "sharing post: Facebook");
        Assert.assertEquals(yGenerationPost, "sharing post: Twitter");
    }

    @Test
    public void testChangeSocialPublisher() {

        //given
        User millenials = new Millenials("Adam");

        //when
        millenials.setSocialPublisher(new TwitterPublisher());
        String millenialsPost = millenials.sharePost();

        //then
        Assert.assertEquals(millenialsPost, "sharing post: Twitter");
    }
}
