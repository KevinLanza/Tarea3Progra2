
//Trabaje en grupo con Iveth Sabillon

public class Animal//Se crea la clase principal que es "Animal" 
{

	String nombre;//Se crea una variable tipo string para "nombre"
	int edad;//se crea una variable tipo int para "edad"
	String ladrar;//Se crea una variable tipo string para "ladrar"
	String maullar;//Se crea una variable tipo string para "maullar"
	String hablar;//Se crea una variable tipo string para "hablar"
	
	String getNombre()//Se hace la funcion "getNombre"
	{
		return nombre;//Devuelve el nombre
	}
	
	int getEdad()//Se hace la funcion "getEdad"
	{
		return edad;//devuelve la edad
	}
	
	void setNombre(String nombre)//Se hace la funcion "setNombre" y se escriben los parametros de  la misma
	{
		this.nombre = nombre;
	}
	
	void setEdad (int edad)//Se hace la funcion "setEdad" y se escriben los parametros de  la misma
	{
		this.edad = edad;
	}
	
	Animal(String nombre , int edad )//Se hace la funcion "Animal" y se escriben los parametros de  la misma
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
}

class Perro extends Animal//Se crea la clase perro con herencia de Animal 
{
	
	Perro(String nombre , int edad)
	{
		super(nombre, edad);
		
	}


	String ladrar()
	{
		return ladrar;
	}
	
	//Se hacen las funciones correspondientes del ejercio y se la agrega la funcion ladrar
}

class Gato extends Animal
{
	
	Gato(String nombre, int edad)
	{
		super(nombre,edad);
		
	}
	
	String maullar()
	{
		return maullar;
	}

	//Se hacen las funciones correspondientes del ejercio y se la agrega la funcion maullar
}

class Loro extends Animal
{
	
	Loro(String nombre, int edad)
	{
		super(nombre, edad);
		
	}
	
	String hablar()
	{
		return hablar;
	}
	
	//Se hacen las funciones correspondientes del ejercio y se la agrega la funcion hablar
}
