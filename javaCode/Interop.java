// Concepts taken from:
// http://clojure.github.io/clojure/javadoc/clojure/java/api/Clojure.html
import clojure.java.api.Clojure;
import clojure.lang.*;

public class Interop {
    public static void main(String[] args) {
        // Require the interop.core namespace
        IFn require = Clojure.var("clojure.core", "require");
        require.invoke(Clojure.read("interop.core"));

        // Want to sum the contents of this Java array
        int[] arr = {1, 2, 3, 4, 5};
        // Call a function from the interop.core namespace
        IFn sum_array = Clojure.var("interop.core", "sum-array");
        System.out.println(sum_array.invoke(arr)); // this prints 15

        // Call a core Clojure function
        IFn plus = Clojure.var("clojure.core", "+");
        System.out.println(plus.invoke(2, 3)); // this prints 5

        // Call custom function that returns a Java array
        IFn inc = Clojure.var("clojure.core", "inc");
        IFn mapFuncJavaArray = Clojure.var("interop.core", "map-func-java-array");
        Long[] result = (Long[])mapFuncJavaArray.invoke(inc, arr);;
        for (long l : result)
            System.out.print(l + " ");
        System.out.println();
    }
}
