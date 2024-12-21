package org.jhipster.taskflow.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.jhipster.taskflow.domain.ProjectTestSamples.*;
import static org.jhipster.taskflow.domain.TaskTestSamples.*;

import org.jhipster.taskflow.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class TaskTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Task.class);
        Task task1 = getTaskSample1();
        Task task2 = new Task();
        assertThat(task1).isNotEqualTo(task2);

        task2.setId(task1.getId());
        assertThat(task1).isEqualTo(task2);

        task2 = getTaskSample2();
        assertThat(task1).isNotEqualTo(task2);
    }

    @Test
    void projectTest() {
        Task task = getTaskRandomSampleGenerator();
        Project projectBack = getProjectRandomSampleGenerator();

        task.setProject(projectBack);
        assertThat(task.getProject()).isEqualTo(projectBack);

        task.project(null);
        assertThat(task.getProject()).isNull();
    }
}
