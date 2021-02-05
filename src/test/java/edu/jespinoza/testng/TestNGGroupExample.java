package edu.jespinoza.testng;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNGGroupExample {
    private static final Logger logger = Logger.getLogger(TestNGGroupExample.class);

    @BeforeGroups(groups= {"security"})
    public void setUpSecurity() {
        logger.info("setUpSecurity()");
    }

    @AfterGroups(groups= {"security"})
    public void tearDownSecurity() {
        logger.info("tearDownSecurity()\n");
    }

    @BeforeGroups(groups= {"database"})
    public void setUpDatabase() {
        logger.info("setUpDatabase()");
    }

    @AfterGroups(groups= {"database"})
    public void tearDownDatabase() {
        logger.info("tearDownDatabase()\n");
    }

    @BeforeGroups(groups= {"ui"})
    public void setUpUI() {
        logger.info("setUpUI()");
    }

    @AfterGroups(groups= {"ui"})
    public void tearDownUI() {
        logger.info("tearDownUI()\n");
    }

    @Test(groups= {"database"})
    public void testInsert(){
        logger.info("testInsert()");
    }

    @Test(groups= {"database"})
    public void testUpdate(){
        logger.info("testUpdate()");
    }

    @Test(groups= {"database"})
    public void testDelete(){
        logger.info("testDelete()");
    }

    @Test(groups= {"security"})
    public void accessHomePage() {
        logger.info("accessHomePage()");
    }

    @Test(groups= {"security"})
    public void accessAdminPage() {
        logger.info("accessAdminPage()");
    }

    @Test(groups= {"ui"})
    public void openConfirmationDialog() {
        logger.info("openConfirmationDialog()");
    }

    @Test(groups= {"ui"})
    public void openFileDialog() {
        logger.info("openFileDialog()");
    }
}