package infra.cloud.backend


import grails.rest.*
import grails.converters.*

class UserController extends RestfulController {
    static responseFormats = ['json', 'xml']
    UserController() {
        super(User)
    }

    def show() {
        println params
        println params.id
        new User(account: params.id,password: "123",projectName: "p1").save(flush:true)
        render("success1")
    }
}
