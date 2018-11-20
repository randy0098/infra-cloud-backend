package infra.cloud.backend

import org.bson.types.ObjectId

class User {
    static constraints = {
    }

//    ObjectId id
    String account
    String password
    String projectName
}
