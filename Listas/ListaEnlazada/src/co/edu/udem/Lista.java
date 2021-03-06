package co.edu.udem;

public class Lista {

	Nodo primero;
	
	//Buscar un elemento
	public Nodo buscarNodo(int contenido) {

		Nodo actual = primero;

		while (actual != null && actual.getContenido() != contenido) {
			actual = actual.getSiguiente();
		}

		return actual;
	}
	
	//Localizar el último elemento
	public Nodo localizarUltimo() {

		Nodo actual = primero;

		if (actual != null) {
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
		}

		return actual;
	}
	
	//Localizar anterior
	public Nodo localizarAnterior(int contenido) {
		
		Nodo anterior = null;
		Nodo actual = primero;

		while (actual != null && actual.getContenido()!=contenido) {
			anterior = actual;
			actual = actual.getSiguiente();
		
		}

		return actual != null ? anterior : null;
	}
	
	//Calcular el número de los elementos de una lista
	public int longitud() {

		Nodo actual = primero;
		int longitud = 0;

		while (actual != null) {
			longitud++;
			actual = actual.getSiguiente();
		}

		return longitud;
	}
	
	//Insertar un elemento después de uno del que se tiene la referencia
	public void insertarDespuesDe (int contenido, Nodo n) throws NoExisteException {
		Nodo anterior  = buscarNodo(contenido);
		if (anterior==null)
			throw new NoExisteException(contenido);
		else
			anterior.insertarDespues(n);
	}
	
	//Insertar un elemento como el primero de la secuencia
	public void insertarAlComienzo(Nodo n) {
		n.setSiguiente(primero);
		primero = n;
	}

	//Mostar toda la lista
	public void mostrarLista() {

		Nodo actual = primero;

		while (actual != null) {
			System.out.println(actual.getContenido());
			actual = actual.getSiguiente();
		}
	}
	
	public void insertarAlFinal(Nodo n) {
		
		Nodo ultimo=localizarUltimo();
		n.setSiguiente(null);
		ultimo.setSiguiente(n);
	}
	
	// Insertar un elemento antes de uno del que se tiene la referencia
	public void insertarAntesDe(int contenido, Nodo n) throws NoExisteException {
		Nodo anterior = localizarAnterior(contenido);
		if (anterior == null)
			throw new NoExisteException(contenido);
		else
			anterior.insertarDespues(n);
	}

	// TODO: Implementar los siguientes algoritmos
	/*
		Invertir la lista (imprimir en órden inverso)
		Ordenar la lista
		Mover un elemento al comienzo de la lista
		Mover un elemento al final
	*/
}
