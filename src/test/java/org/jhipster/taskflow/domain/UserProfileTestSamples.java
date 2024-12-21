package org.jhipster.taskflow.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class UserProfileTestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));

    public static UserProfile getUserProfileSample1() {
        return new UserProfile().id(1L).fullName("fullName1").phoneNumber("phoneNumber1").bio("bio1");
    }

    public static UserProfile getUserProfileSample2() {
        return new UserProfile().id(2L).fullName("fullName2").phoneNumber("phoneNumber2").bio("bio2");
    }

    public static UserProfile getUserProfileRandomSampleGenerator() {
        return new UserProfile()
            .id(longCount.incrementAndGet())
            .fullName(UUID.randomUUID().toString())
            .phoneNumber(UUID.randomUUID().toString())
            .bio(UUID.randomUUID().toString());
    }
}
