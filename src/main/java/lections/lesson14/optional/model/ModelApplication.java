package lections.lesson14.optional.model;

import java.util.Optional;

public class ModelApplication {

    public static void main(String[] args) {
        Person person = new Person();
        Optional<Passport> passportOptional = Optional.ofNullable(person.getPassport());

            Passport passport1 = passportOptional.orElseThrow(() -> new IllegalStateException(
                    "Passport in person is null"
            ));


    }

}

// Exception in thread "main" java.lang.NullPointerException
//	at lections.lesson14.optional.model.ModelApplication.main(ModelApplication.java:9)

//Exception in thread "main" java.lang.NullPointerException
//	at lections.lesson14.optional.model.ModelApplication.main(ModelApplication.java:9)