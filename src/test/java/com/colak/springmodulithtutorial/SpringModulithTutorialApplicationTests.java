package com.colak.springmodulithtutorial;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class SpringModulithTutorialApplicationTests {


    @Test
    void createApplicationModuleModel() {
        ApplicationModules modules = ApplicationModules.of(SpringModulithTutorialApplication.class);
        modules.forEach(System.out::println);
    }

    @Test
    void createModuleDocumentation() {
        // target/spring-modulith-docs
        ApplicationModules modules = ApplicationModules.of(SpringModulithTutorialApplication.class);
        new Documenter(modules)
                .writeDocumentation()
                .writeIndividualModulesAsPlantUml();
    }

    @Test
    void verifyModularStructure() {
        ApplicationModules modules = ApplicationModules.of(SpringModulithTutorialApplication.class);
        modules.verify();
    }
}
