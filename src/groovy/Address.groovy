package constraintissue

import grails.validation.Validateable

@Validateable
class Address {
    String street
    String postalCode
    String city
    String state
    String country

    static constraints = {
        country nullable: true
    }
}
