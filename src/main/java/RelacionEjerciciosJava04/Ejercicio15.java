package RelacionEjerciciosJava04;

public class Ejercicio15 {

    /* Ejercicio 15
    Realiza un generador de melodía con las siguientes condiciones:
    1. Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
    sol, la y si.
    2. Una melodía está formada por un número aleatorio de notas mayor o igual
    a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
    3. Cada grupo de 4 notas será un compás y estará separado del siguiente
    compás mediante la barra vertical | (Alt + 1). El final de la melodía se marca con dos barras.
    4. La última nota de la melodía debe coincidir con la primera.

     Ejemplo 1:
    do mi fa mi | si do sol fa | fa re si do | sol mi re do ||

    Ejemplo 2:
    la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||*/

    public static void main(String[] args) {

        boolean longval = false;

        int longitud = 0;

        String nota = "";

        String melodia = "";

        int primtiponota = 0;

        String primnota = "";

        while (!longval) {

            longitud = (int) (Math.floor(Math.random()*(28-4+1)+4));

            if ((longitud % 4) == 0) {

                longval = true;

            }

        }

        int reps = longitud / 4;

        for (int numreps = 1; numreps <= reps; numreps++) {

            for (int notas = 1; notas <= 4; notas++) {

                int tiponota = (int) (Math.floor(Math.random()*(7-1+1)+1));

                if (numreps == 1 && notas == 1) {

                    primtiponota = tiponota;

                }

                if (numreps == reps && notas == 4) {

                    switch (primtiponota) {

                        case 1 -> {

                            primnota = "do";

                        }
                        case 2 -> {

                            primnota = "re";

                        }
                        case 3 -> {

                            primnota = "mi";

                        }
                        case 4 -> {

                            primnota = "fa";

                        }
                        case 5 -> {

                            primnota = "sol";

                        }
                        case 6 -> {

                            primnota = "la";

                        }
                        case 7 -> {

                            primnota = "si";

                        }

                    }

                    melodia = melodia + " " + primnota;

                }
                else {

                    switch (tiponota) {

                        case 1 -> {

                            nota = "do";

                        }
                        case 2 -> {

                            nota = "re";

                        }
                        case 3 -> {

                            nota = "mi";

                        }
                        case 4 -> {

                            nota = "fa";

                        }
                        case 5 -> {

                            nota = "sol";

                        }
                        case 6 -> {

                            nota = "la";

                        }
                        case 7 -> {

                            nota = "si";

                        }

                    }

                    if (numreps == 1 && notas == 1) {

                        melodia = melodia + nota;

                    }
                    else {

                        melodia = melodia + " " + nota;

                    }

                }

            }

            if (numreps == reps) {

                melodia = melodia + " ||";

            }
            else {

                melodia = melodia + " |";

            }

        }

        System.out.println(melodia);

    }

}
