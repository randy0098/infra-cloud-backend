package infra.cloud.backend

import grails.rest.Resource

@Resource(uri='/books',formats=['json', 'xml'])
class Book {

    static constraints = {
    }

    String title
}
