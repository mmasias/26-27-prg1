# Predicción Reto 2

## Prediccion Reto base

El programa declara las variables de los billetes que usará, después declara el precio y le asigna el valor que se indica en el reto, indica al usuario cuanto pagar y recibe el valor que ingrese el usuario, define si el usuario puede pagar y el cambio que debe darle, en caso de no poder pagarle, el cambio tendrá valor 0,de modo que no se le dé cambio al usuario en tal caso. Finalmente imprime el cambio dado, y cómo está distribuido.

  Se repite el proceso de declarar el precio, indicar cuanto pagar, definir si puede pagar, calcular el cambio e imprimir los resultados para cada uno de los 4 precios solicitados.

  ## Explicación Reto Base

  Todo funciona como lo esperado, se le indica al usuario el valor que debe ingresar, si es suficiente devuelve el cambio e indica en que billetes y monedas hacerlo, en caso de no ser suficiente se le indica al usuario y todos los cambios mostrados son 0, y de esta manera con cada uno de los 4 precios.

  ## Predicción Reto Extendido

  Al ingresar un valor menor al del precio, le dice al usuario que es insuficiente, y se le asigna 0 al valor de cambio, lo que hace que no se devuelva nada.

  ## Explicación Reto Extendido

  Ocurre lo previsto, al ingresar un valor menor al del precio, se indica que no es suficiente y se le asigna o al valor de cambio, lo que hace que no se devuelva cambio, ya que tecnicamente no se esta pagando por no tener suficiente dinero.

 ## Reto ampliado
 
 Se hicieron los cambios en el programa para que acepte y decuelva valores de centimos, ahora se inicializa el precio como double, se multiplica el precio por 100, y lo convierte en un entero que trunca los errores que puedan tener las operaciones con double, dando un valor exacto y permitiendo calcular el cambio con comodidad.