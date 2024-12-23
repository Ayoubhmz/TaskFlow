package org.jhipster.taskflow.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class UserProfileAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertUserProfileAllPropertiesEquals(UserProfile expected, UserProfile actual) {
        assertUserProfileAutoGeneratedPropertiesEquals(expected, actual);
        assertUserProfileAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertUserProfileAllUpdatablePropertiesEquals(UserProfile expected, UserProfile actual) {
        assertUserProfileUpdatableFieldsEquals(expected, actual);
        assertUserProfileUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertUserProfileAutoGeneratedPropertiesEquals(UserProfile expected, UserProfile actual) {
        assertThat(expected)
            .as("Verify UserProfile auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertUserProfileUpdatableFieldsEquals(UserProfile expected, UserProfile actual) {
        assertThat(expected)
            .as("Verify UserProfile relevant properties")
            .satisfies(e -> assertThat(e.getFullName()).as("check fullName").isEqualTo(actual.getFullName()))
            .satisfies(e -> assertThat(e.getPhoneNumber()).as("check phoneNumber").isEqualTo(actual.getPhoneNumber()))
            .satisfies(e -> assertThat(e.getBio()).as("check bio").isEqualTo(actual.getBio()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertUserProfileUpdatableRelationshipsEquals(UserProfile expected, UserProfile actual) {
        // empty method
    }
}
