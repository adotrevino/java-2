public class Metodos {
    public float avg(int[] arr) {
        int suma = 0;
        float prom;
        for(int i=0; i < arr.length; i++ ){
            suma+=arr[i];
        }
        prom = (suma/arr.length);
        return prom;

    }

    public char calificacion(float prom){
       if(prom >= 91){
        return 'A';
       }else if (prom >= 81) {
        return 'B';
       }else if (prom >= 71) {
        return 'C';
       }else if (prom >= 61) {
        return 'D';
       }else if (prom >= 51) {
        return 'E';
       } else{
        return 'F';
       }
    }

    public void printData(String name, int[] arr, float prom, char cal) {
        System.out.println("--------------\n ");
        System.out.println("Alumno: "+name);
        System.out.println("Calificacion 1: "+arr[0]);
        System.out.println("Calificacion 2: "+arr[1]);
        System.out.println("Calificacion 3: "+arr[2]);
        System.out.println("Calificacion 4: "+arr[3]);
        System.out.println("Calificacion 5: "+arr[4]);
        System.out.println("Promedio: "+prom);
        System.out.println("Calificación: "+cal);
    }
}
