package com.scedeov.calculadora;

class Operaciones {

    private Fraccion simplificar(Fraccion resultado) {
        for (int i = 2; i < 10; i++) {
            if (resultado.getDenominador() % i == 0 && resultado.getNumerador() % i == 0) {
                resultado.setDenominador(resultado.getDenominador() / i);
                resultado.setNumerador(resultado.getNumerador() / i);
                i = 1;
            }
        }
        return resultado;
    }

    Fraccion sumar(Fraccion primeraFraccion, Fraccion segundaFraccion) {
        Fraccion resultado = new Fraccion();
        resultado.setNumerador(
                primeraFraccion.getNumerador() * segundaFraccion.getDenominador() +
                        segundaFraccion.getNumerador() * primeraFraccion.getDenominador()
        );
        resultado.setDenominador(
                primeraFraccion.getDenominador() * segundaFraccion.getDenominador()
        );
        return simplificar(resultado);
    }

    Fraccion restar(Fraccion primeraFraccion, Fraccion segundaFraccion) {
        Fraccion resultado = new Fraccion();
        resultado.setNumerador(
                primeraFraccion.getNumerador() * segundaFraccion.getDenominador() -
                        segundaFraccion.getNumerador() * primeraFraccion.getDenominador()
        );
        resultado.setDenominador(
                primeraFraccion.getDenominador() * segundaFraccion.getDenominador()
        );
        return simplificar(resultado);
    }

    Fraccion multiplicar(Fraccion primeraFraccion, Fraccion segundaFraccion) {
        Fraccion resultado = new Fraccion();
        resultado.setNumerador(primeraFraccion.getNumerador() * segundaFraccion.getNumerador());
        resultado.setDenominador(primeraFraccion.getDenominador() * segundaFraccion.getDenominador());
        return simplificar(resultado);
    }

    Fraccion dividir(Fraccion primeraFraccion, Fraccion segundaFraccion) {
        Fraccion resultado = new Fraccion();
        resultado.setNumerador(primeraFraccion.getNumerador() * segundaFraccion.getDenominador());
        resultado.setDenominador(primeraFraccion.getDenominador() * segundaFraccion.getNumerador());
        return simplificar(resultado);

    }
}
