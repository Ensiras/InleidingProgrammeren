package matchers;

import org.assertj.core.api.AbstractAssert;

public class IsABertAssert extends AbstractAssert<IsABertAssert, Person> {

    public IsABertAssert(Person actual) {
        super(actual, IsABertAssert.class);
    }

    /*A so-called static factory method. Allows for calling methods on the object
    * without having to instantiate it first. */
   public static IsABertAssert assertThat(Person actual) {
        return new IsABertAssert(actual);
   }

   public IsABertAssert isABert() {
        isNotNull();
        if (!actual.getName().equals("Bert")) {
            failWithMessage("This person is not a Bert, but a %s", actual.getName());
       }
        return this;
   }

   public IsABertAssert mightBeABert() {
       isNotNull();
       if (!actual.getName().contains("Bert")) {
           failWithMessage("This person is not a Bert, but a %s.", actual.getName());
       }
       return this;
   }

   public IsABertAssert isNotABert() {
       isNotNull();
       if(actual.getName().contains("Bert")) {
           failWithMessage("This person is or might be a Bert.", actual.getName());
       }
       return this;
   }
}
