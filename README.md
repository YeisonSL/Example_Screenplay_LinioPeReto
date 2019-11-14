# Reto
Un proyecto donde se ejemplifica el uso del patrón serenity screenplay con cucumber y gradle.

Las pruebas de este ejemplo se corren contra la página web de Linio.pe.

Por defecto, los tests corren en Chrome.


# Detalles generales de la implementación

El siguiente proyecto consiste en la automatización de la búsqueda de un producto dentro de la pagina de compras https://www.linio.pe/, el robot abre el navegador e ingresa a la URL ya mencionada, seguido se valida si el PopUp del inicio está presente o no, si está presente lo cierra, sino continua con la prueba, cerrado el PopUp se digita el nombre del producto a buscar en el buscador de la pagina de compras y se realiza una acción de ENTER para hacer efectiva la búsqueda, teniendo un resultados de producto se busca dentro de ellos el producto buscado y se da click, en caso de que no este se devuelve producto no encontrado, en la pagina del detalle del producto se agrega el producto al carrito y luego el robot ingresa al carrito, donde se valida si el producto se agrego correctamente, para el caso de tener varios productos en el carrito se toma la lista de estos y se compara el nombre del producto en el carrito con el que espera, si así se agrego una acción de dar clik en el checkbox del producto en el carrito para hacer efectiva la validación y al final se cierra el navegador.

    
# Requerimientos

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 5.4.

#  Para correr el proyecto

"gradle clean test aggregate" es el comando que correrá los tests y generará el reporte en la carpeta /target/site/serenity/# Liniope
# Liniope
# Liniope
# Liniope
# LinioPeReto
