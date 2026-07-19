package javaPackage;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public enum EnumClass {

//        System.out.println("Enum class is used to define a collection of constants that can be used to represent a fixed set of values." +
//                " It provides a way to define and group related constants together, making the code more readable and maintainable.");

        addPlaceAPI("/maps/api/place/add/json"),
        getPlaceAPI("/maps/api/place/get/json"),
        eletePlaceAPI("/maps/api/place/delete/json"),
        addWebAPI("/normal/webapi/add"),
        getWebAPI("/normal/webapi/all"),
        deleteWebAPI("/normal/webapi/remove/"),
        addBookAPI("/Library/Addbook.php"),
        getBookAPIByAuthorName("/Library/GetBook.php"),
        etBookAPIByID("/Library/GetBook.php");

        private String resource;

    EnumClass(String resource) {
            this.resource = resource;
        }

        public String getResource() {
            return resource;
        }

}
