Bueno al ejecutar el codigo salio todo esto: 

Exception in thread "main" java.lang.NumberFormatException: For input string: "El valor que paga es menor al valor que debe pagar"
        at java.base/java.lang.NumberFormatException.forInputString(Unknown Source)
        at java.base/java.lang.Integer.parseInt(Unknown Source)
        at java.base/java.lang.Integer.parseInt(Unknown Source)
        at reto_002.main(DevolverCambio.java:25)

Por lo que podria considerarse que la prediccion fue correcta, evidentemente salta el error debido a que el valor que paga es menor que al valor que debe pagar