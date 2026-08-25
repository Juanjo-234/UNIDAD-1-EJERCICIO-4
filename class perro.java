class perro{
    String nombre;
    String raza;
    int edad;
    double pesoKg;
public perro(String nombre, String raza, int edad, double pesoKg){
    this.nombre = nombre;
    this.raza = raza;
    this.edad = edad;
    this.pesoKg = pesoKg;
}
//Getters//
public String getNombre(){
return nombre;
}

public String getRaza(){
    return raza;
}

public int getEdad(){
    return edad;
}

public double getPesoKg(){
    return pesoKg;
}
//Setters//
public void setNombre(String nombre){
    this.nombre = nombre;
}

public void setRazza(String raza){
    this.raza = raza;
}

public void setEdad(int edad){
    this.edad = edad;
}

public void setPesoKg(double pesoKg){
    this.pesoKg = pesoKg;
}

void requiereRevisionAnual(){
if(this.edad > 7 ){
System.out.println("Requiere revisión");
}else{
    System.out.println("No requiere revisión");
}
}

void mostrardetalle(){
    System.out.println("------------------------");
    System.out.println("Nombre del perro: " + nombre);
    System.out.println("Raxa: " + raza);
    System.out.println("Edad: " + edad);
    System.out.println("------------------------");
}

public static void main(String[] args) {
    perro p1 = new perro("Felipe", "Ovejero alemán", 6, 50);
    perro p2 = new perro("Sofia", "Mastin napolitano", 8, 60);

p1.mostrardetalle();
p1.requiereRevisionAnual();

p2.mostrardetalle();
p2.requiereRevisionAnual();


}
}