public class StringArrayAlgs
{

// ------------ alg. di ordinamento: bubbleSort e mergeSort iterativo --------


    public static void bubbleSort(String[] v, int vSize)
    {
        for (int i = 0; i < vSize-1; i++)     //attenzione alla formulazione 
            for (int j = vSize-1; j > i; j--) //di questi due cicli
                if (v[j].compareTo(v[j-1]) < 0)
                    swap(v, j, j-1);
    }
    private static void swap(String[] v, int i, int j)
    {
        String s = v[i];
        v[i] = v[j];
        v[j] = s;
    }


    // mergeSort iterativo
    public static void iterativeMergeSort(String[] v, int vSize)
    {
        /*
          ad ogni passo di iterazione, dim e` la dimensione di tutti i 
          sottoarray da esaminare. Attenzione all'aggiornamento di dim nel ciclo
        */
        for (int dim = 1; dim < vSize; dim *= 2) 
        {
            int begin1 = 0;             //inizio primo sotto-array da fondere
            int begin2 = begin1 + dim;  //inizio secondo sotto-array da fondere
            while (begin2 + dim <= vSize)
            {
                String[] v1 = new String[dim];
                String[] v2 = new String[dim];
                System.arraycopy(v, begin1, v1, 0, dim);
                System.arraycopy(v, begin2, v2, 0, dim);
                String[] v3 = new String[dim*2];
                merge(v3, v1, v2);
                System.arraycopy(v3, 0, v, begin1, dim*2);
                begin1 = begin2 + dim;  //passa ai due sottoarray successivi
                begin2 = begin1 + dim;
            }
            /*
             Cosa succede se la dimensione dell'array non e' una potenza di 2?
             Effettuare qualche prova a mano e verificare che all'ultima 
             iterazione del ciclo esterno il codice sopra scritto omette di 
             elaborare la parte terminale dell'array (provare ad esempio con
             dimensioni n = 9,10,...,15 e osservare cosa succede agli ultimi  
             elementi dell'array).
             Il codice seguente gestisce questo eventuale "frammento terminale"
             e rende il metodo funzionante anche quando la dimensione di v
             non e` una potenza di 2
            */
            if (begin2 < vSize)  //caso in cui il secondo sottoarray della 
            {                    //coppia in esame e' incompleto (ad es. n=15)
                int dim2 = vSize - begin2;
                String[] v1 = new String[dim];
                String[] v2 = new String[dim2];
                System.arraycopy(v, begin1, v1, 0, dim);
                System.arraycopy(v, begin2, v2, 0, dim2);
                String[] v3 = new String[dim + dim2];
                merge(v3, v1, v2);
                System.arraycopy(v3, 0, v, begin1, v3.length);
            }
        }
    }
    //metodo ausilario di iterativeMergeSort
    private static void merge(String[] v, String[] v1, String[] v2)
    {
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        while (i1 < v1.length && i2 < v2.length)
            if (v1[i1].compareTo(v2[i2]) < 0)
                v[i++] = v1[i1++];
            else
                v[i++] = v2[i2++];
        while (i1 < v1.length)
            v[i++] = v1[i1++];
        while (i2 < v2.length)
            v[i++] = v2[i2++];
    }


// ------------ alg. di ricerca: binSearch iterativo --------

    public static int iterativeBinSearch(String[] v, int vSize, String s)
    {
        int from = 0;
        int to = vSize - 1;
        while (from <= to)
        {
            int mid = (from + to) / 2;
            if (s.equals(v[mid]))
                return mid;
            else if (s.compareTo(v[mid]) < 0)
                to = mid - 1;
            else
                from = mid + 1;
        }
        return -1;
    }

// -------------- altri metodi di utilita` ---------------------------

    public static String[] resize(String[] v, int newLength)
    {
        if (newLength < 0 || v == null)
            throw new IllegalArgumentException();
        String[] a = new String[newLength];
        if (newLength > v.length)
            System.arraycopy(v, 0, a, 0, v.length);
        else
            System.arraycopy(v, 0, a, 0, newLength);
        return a;
    }

     //Stampa tutti gli elementi di un array.
    public static String printArray(String[] v, int vSize)
    {
        String s = "[";
        for (int i = 0; i < vSize; i++)
            s = s + "\"" + v[i] + "\"" + " ";
        s = s + "\b]";
        return s;
    }
}