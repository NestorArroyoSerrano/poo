public enum TipoAutomovil {
    SEDAN("Sedan", "Auto normal", 4),
    STATION_WAGON("Station Wagon", "Auto mediano", 5),
    HATCHBACK("Hatchback", "Auto compacto", 5),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupé", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgón", "Auto utilitario", 3),
    SUV("Suv", "Todo terreno deportivo", 5);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuerta;

    TipoAutomovil(String nombre, String descripcion,  int numeroPuerta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuerta = numeroPuerta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }
}
