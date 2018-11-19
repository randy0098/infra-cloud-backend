package infra.cloud.backend

class BootStrap {

    def init = { servletContext ->
        new Person(pname:"randy").save()
        new Person(pname:"leon").save()
        new Book(title:"The Stand").save()
        new Book(title:"The Shining").save()
    }
    def destroy = {
    }
}
