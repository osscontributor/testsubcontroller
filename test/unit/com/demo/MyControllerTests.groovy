package com.demo

import grails.test.*

class MyControllerTests extends ControllerUnitTestCase {
    void testCreate() {
        controller.create()
        assert 'MyController.created' == controller.response.contentAsString
    }
}
