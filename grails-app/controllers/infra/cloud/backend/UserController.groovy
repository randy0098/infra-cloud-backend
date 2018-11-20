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
        def user = new User(account: params.id)
        if (!user.save(flush:true)) {
            user.errors.allErrors.each {
                println it
            }
        }
        render("success1")
    }
}
