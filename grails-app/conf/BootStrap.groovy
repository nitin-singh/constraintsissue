import constraintissue.Address
import constraintissue.Person

class BootStrap {

    def init = { servletContext ->


        new Person(
                name: 'Nitin sharma',
                phoneNumber: '9483274982',
                address: new Address(street: '#278, Main St.', city: 'Noida', state: 'UP', postalCode: '238999')
        ).save(flush: true)
    }
    def destroy = {
    }
}
