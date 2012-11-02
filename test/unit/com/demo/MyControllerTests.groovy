package com.demo

import grails.test.*

class MyControllerTests extends ControllerUnitTestCase {
    
    //    def grailsApplication

    protected void setUp() {
        super.setUp()

        /*mockConfig '''
            someURL = 'aa'
        '''*/

        /*def mockedConfig = new ConfigObject()
        mockedConfig.someURL = "aa"
        ConfigurationHolder.config = mockedConfig*/

//        grailsApplication.config.someURL="aa"
    }

    protected void tearDown() {
        super.tearDown()
    }
    
    void testCreate() {
        controller.create()
        assert 'MyController.created' == controller.response.contentAsString
    }
}
