package constraintissue


class Person {

    String name
    String phoneNumber
    Address address


    static constraints = {
    }

    static embedded = ['address']
}
