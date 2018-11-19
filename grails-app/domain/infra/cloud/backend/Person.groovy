package infra.cloud.backend

import grails.rest.Resource

@Resource(uri='/persons',formats=['json', 'xml'])
class Person {

    static constraints = {
    }

    String pname
//    Integer age
//    Date lastVisit
}
