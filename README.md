<a href="https://desarrolladores.addonpayments.com/" target="_blank">
    <img src="https://desarrolladores.addonpayments.com/assets/images/branding/comercia/logo.svg?v=?v=1.14.1" alt="Addon Payments logo" title="Addon Payments" align="right" width="225" />
</a>

# SDK de JAVA Comercia Global Payments

SDK de Java Addon Payments

## Soluciones

### General

* Procesamiento de pagos API
* Apple Pay y Google Pay (en desarrollo)
* Almacenamiento seguro de tarjetas y gestión de clientes
* Pagos recurrentes
* Crédito y Débito
* Minimizar los requisitos de cumplimiento de PCI con las soluciones de HPP
* 140+ Monedas de autorización y 16 Monedas de liquidación
* Normas incorporadas para la prevención del fraude
* Comprobaciones 3D Secure, AVS y CVV
* Cifrado seguro de extremo a extremo

## Requisitos

- Java 7+

## Instalación

La instalación del SDK en su solución se realiza normalmente utilizando Maven.

Para instalar vía [Maven](https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html):

```
<dependency>
  <groupId>com.github.addonpayments</groupId>
  <artifactId>addonpayments-sdk</artifactId>
  <version>2.1.0-SNAPSHOT</version>
</dependency>
```

## Documentación y ejemplos

Puede encontrar una documentación adaptada a cada operativa de pago, ejecutando el archivo "index.html" desde su servidor.

Este archivo se encuentra dentro de la carpeta "test" del SDK. Si lo prefiere, también puede ver nuestra documentación oficial en la página web de desarrolladores de [Addon Payments](https://desarrolladores.addonpayments.com) donde encontrará además tarjetas con las que realizar pruebas de compra y el resto de librerías disponibles.

*Consejo rápido*: ¡[El paquete de pruebas incluido](https://github.com/addonpayments/java-sdk/tree/master/test) puede ser una gran fuente de ejemplos de código para usar el SDK!

#### Procesar un pago

```java
CreditCardData card = new CreditCardData();
card.setNumber("4111111111111111");
card.setExpMonth("12");
card.setExpYear("2025");
card.setCvn("123");

try
{
    Transaction response = card.authorize(new BigDecimal("129.99"))
        .withCurrency("EUR")
        .execute();

    String result = response.getResponseCode(); // 00 == Success
    String message = response.getResponseMessage(); // [ test system ] AUTHORISED
}
catch (ApiException e)
{
    // handle errors
}
```

#### Datos de tarjeta de prueba

Nombre      | Número           | Exp Mes   | Exp Año  | CVN
----------- | ---------------- | --------- | -------- | ----
Visa        | 4263970000005262 | 12        | 2025     | 123
MasterCard  | 2223000010005780 | 12        | 2019     | 900
MasterCard  | 5425230000004415 | 12        | 2025     | 123
Discover    | 6011000000000087 | 12        | 2025     | 123
Amex        | 374101000000608  | 12        | 2025     | 1234
JCB         | 3566000000000000 | 12        | 2025     | 123
Diners Club | 36256000000725   | 12        | 2025     | 123

#### Excepciones

Durante su integración usted podrá probar las respuestas específicas del emisor tales como "Tarjeta Rechazada".

Debido a que nuestros entornos de pruebas no llegan a los bancos emisores para obtener autorizaciones, existen números de tarjeta que activarán las respuestas del banco emisor.

En la documentación de la carpeta "test" podrá encontrar un buscador de errores dinámico donde se muestra una descripción detallada de cada error y su posible solución.

Póngase en contacto con el equipo de soporte de Addon Payments para obtener una lista completa de los valores utilizados y simular los resultados de la transacción AVS/CVV.

Ejemplo de código de manejo de errores:

```java
try
{
    Transaction response = card.authorize(new BigDecimal("-5.00"))
        .withCurrency("EUR")
        .withAddress(address)
        .execute();
}
catch (BuilderException e)
{
    // handle builder errors
}
catch (ConfigurationException e)
{
    // handle errors related to your services configuration
}
catch (GatewayException e)
{
    // handle gateway errors/exceptions
}
catch (UnsupportedTransactionException e)
{
    // handle errors when the configured gateway doesn't support
    // desired transaction
}
catch (ApiException e)
{
    // handle all other errors
}
```

## Soporte

En caso de que quiera hablar con un especialista de Addon Payments, deberá llamar al teléfono [914 353 028](tel:914353028) o enviar un email a [soporte@addonpayments.com](mailto:soporte@addonpayments.com).

## Contribuyendo

¡Todo nuestro código es de código abierto y animamos a otros desarrolladores a contribuir y ayudar a mejorarlo!

1. Fork it
2. Cree su rama de características (`git checkout -b mi-nueva-feature`)
3. Asegúrese de que las pruebas de SDK son correctas
4. Confirme sus cambios (`git commit -am 'Añadir un commit'`)
5. Empujar a la rama (`git push origin mi-nueva-feature`)
6. Crear una nueva solicitud de extracción