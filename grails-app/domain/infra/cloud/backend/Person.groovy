package infra.cloud.backend

import grails.persistence.Entity
import org.bson.types.ObjectId

@Entity
class Person {
    static constraints = {
    }

//    static mapping = {
//        collection "mycollection"
//        database "mydb"
//    }

//    static mapping = {
//        firstName attr:"first_name"
//    }

//    static mapping = {
//        compoundIndex name:1, age:-1
//    }

//    static mapping = {
//        index( [1],[person.address.postCode] [unique:true] )
//    }

//    static mapping = {
//        writeConcern WriteConcern.FSYNC_SAFE
//    }

//    static mapping = {
//        stateless true
//    }

    static mapping = {
        lastName index:true, indexAttributes: [unique:true, dropDups:true]
    }

    ObjectId id
    String firstName
    String lastName
//    static hasMany = [pets:Pet]
}
